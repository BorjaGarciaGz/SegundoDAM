package ejemplosusoprocessbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class EjemplosUsosProcessBuilder {

    public static void main(String[] args) {
        // 1) TODO en un único String (FALLA si hay argumentos)
        ejemplo1_UnSoloString();

        // 2) Array de cadenas (FUNCIONA con argumentos)
        ejemplo2_ArrayDeCadenas();

        // 3) Mezcla: construir un String y hacer split("\\s+")
        ejemplo3_StringMasSplit();

        //La siguiente propiedad nos devuleve TRUE si estamos en un sistema operativo Windows.
        System.out.println(System.getProperty("os.name").toLowerCase().startsWith("windows"));

    }

    // Utilidad para ejecutar y volcar salida/errores
    private static void ejecutarYMostrar(ProcessBuilder pb) {
        try {
            pb.redirectErrorStream(true);
            Process p = pb.start();

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(p.getInputStream()))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }

            int exit = p.waitFor();
            System.out.println("[EXIT CODE] " + exit);
            System.out.println("--------------------------------------------------");
        } catch (IOException | InterruptedException e) {
            System.out.println("[EXCEPCIÓN] " + e.getClass().getSimpleName() + ": " + e.getMessage());
            System.out.println("--------------------------------------------------");
            Thread.currentThread().interrupt();
        }
    }

    // 1) Recibiendo todo el comando en un String
    //    ¡Ojo! Esto SOLO funciona si NO hay argumentos.
    //    Aquí, al poner "java -version" como UNA sola cadena,
    //    ProcessBuilder intentará encontrar un ejecutable literalmente llamado "java -version"
    //    y fallará con IOException (no lo va a encontrar).
    private static void ejemplo1_UnSoloString() {
        System.out.println("1) Un único String (fallará con argumentos):");
        ProcessBuilder pb = new ProcessBuilder("java -version"); // <- incorrecto si hay args
        ejecutarYMostrar(pb);
    }

    // 2) Usando un array de cadenas (cada token separado)
    //    Esta es la forma recomendada cuando hay argumentos.
    private static void ejemplo2_ArrayDeCadenas() {
        System.out.println("2) Array de cadenas (funciona con argumentos):");
        ProcessBuilder pb = new ProcessBuilder("java", "-version");
        ejecutarYMostrar(pb);
    }

    // 3) Mezcla: el comando se arma en un único String y luego se hace split("\\s+")
    //    Útil cuando recibes el comando como texto y quieres “tokenizarlo” por espacios.
    //    Nota: si hay argumentos con espacios entre comillas, split simple no es suficiente;
    //    pero siguiendo tu enfoque, usamos split("\\s+").
    private static void ejemplo3_StringMasSplit() {
        System.out.println("3) String + split(\"\\\\s+\") (mejor para generalizar):");
        String comando = "java -version";              // lo recibimos como UNA cadena
        String[] partes = comando.split("\\s+");       // lo partimos por espacios en blanco
        ProcessBuilder pb = new ProcessBuilder(partes);
        ejecutarYMostrar(pb);
    }


}

