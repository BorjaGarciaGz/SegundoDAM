package actividad01pag23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Crea un programa que ejecute un ping a localhost y que cierre esta aplicación transcurridos 15 segundos.
 * Si se ha cerrado antes mostrará un mensaje diferente a si es el propio programa el que cierra la llamada al ping.
 */

public class PingLocalHost {
    public static void main(String[] args) {
        try {
            // Detectar sistema operativo

            String os = System.getProperty("os.name").toLowerCase();

            List<String> comando = new ArrayList<String>();

            if (os.contains("win")) {
                // Windows: -t = ping continuo
                comando.add("ping");
                comando.add("127.0.0.1");
                comando.add("-t");
            } else {
                //Linux / Mac: sin -c = continuo por defecto
                comando.add("ping");
                comando.add("127.0.0.1");
            }

            System.out.println("Lanzando ping a localhost...");

            ProcessBuilder pb = new ProcessBuilder(comando);
            pb.redirectErrorStream(true);
            Process proceso = pb.start();

            //Leer salida del ping en un hilo aparte para que no se bloquee

            /**
             *   -Thread lector = new Thread(() -> { ... });
             *
             *       Crea un hilo nuevo llamado lector.
             *
             *       Lo que hay entre { ... } es el código que ejecutará ese hilo (una lambda que implementa Runnable).
             *
             *   -proceso.getInputStream()
             *
             *       Obtiene el stream de salida estándar (stdout) del proceso hijo (en tu caso, el ping).
             *
             *       Ahí es donde el ping va escribiendo sus líneas.
             *
             *   -new InputStreamReader(proceso.getInputStream())
             *
             *       Envuelve el InputStream en un lector de caracteres, convirtiendo bytes → texto según el charset por defecto.
             *
             *   -new BufferedReader(new InputStreamReader(...))
             *
             *       Añade un buffer y permite leer línea a línea de forma eficiente mediante readLine().
             *
             *   -try (BufferedReader br = ...) { ... }
             *
             *       Es un try-with-resources: cuando el bloque acabe, cierra automáticamente el BufferedReader (y el stream subyacente), aunque haya excepciones.
             *
             *   -String linea; while ((linea = br.readLine()) != null) { ... }
             *
             *       Declara una variable linea.
             *
             *       Entra en un bucle de lectura bloqueante:
             *
             *   -br.readLine() espera hasta que el proceso escriba una línea o termine.
             *
             *       Si hay línea, la asigna a linea y sigue; si devuelve null, significa que el proceso cerró su salida (terminó) y el bucle acaba.
             *
             *   -System.out.println(linea);
             *
             * Imprime cada línea del ping en tu consola (la del proceso padre).
             *
             * Así ves en tiempo real lo que va escupiendo el ping.
             *
             * } catch (Exception e) { ... }
             *
             * Si ocurre cualquier excepción leyendo (por ejemplo, si el proceso se destruye y el stream se cierra de repente), se captura y se muestra un mensaje.
             *
             * ¿Por qué hacerlo en un hilo aparte?
             *
             * La lectura de stdout es bloqueante; si la haces en el hilo principal, pararías tu programa mientras lees.
             *
             * Además, si no consumes la salida, el buffer del proceso hijo puede llenarse y bloquear al ping, impidiendo que siga ejecutándose.
             *
             * Con este hilo lector mantienes el proceso drenado y tu hilo principal libre para controlar el timeout de 15 s y decidir si hay que matar
             */
            Thread lector = new Thread(() -> {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }
                } catch (Exception e) {
                    System.out.println("Error leyendo salida: " + e.getMessage());
                }
            });
            lector.start();

            //Esperar 15 segundos
            Instant inicio = Instant.now();
            boolean terminado = proceso.waitFor(15, TimeUnit.SECONDS);
            Instant fin = Instant.now();
            long duracion = TimeUnit.MILLISECONDS.toSeconds(java.time.Duration.between(inicio, fin).toMillis());

            //Decidir que mensaje mostrar
            if (terminado) {
                System.out.println("El proceso termino popr si solo antes de los 15 segundos");
            } else {
                System.out.println("El proceso sigue activo tras 15 segundos. Lo cerramos manualmente");
                proceso.destroy();
                if (!proceso.waitFor(2, TimeUnit.SECONDS)) {
                    proceso.destroyForcibly();
                    System.out.println("Se forzó la finalización del proceso");
                } else {
                    System.out.println("Proceso finalizado correctamente por el programa.");
                }
            }

            lector.join(); // Espera a que el hilo de lectura finalice
            System.out.println("\nPrograma finalizado exitosamente");

        }
        catch (Exception e) {
            System.out.println( "Error ejecutando el ping" + e.getMessage());
        }

    }
}
