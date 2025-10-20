package bucadordepalabra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Descripción:
 *
 * App1 recibe dos argumentos: el nombre de un fichero y una palabra.
 * Cuenta cuántas veces aparece esa palabra dentro del fichero y muestra el resultado.
 *
 * App2 pide al usuario el nombre del fichero y la palabra, ejecuta App1 con ProcessBuilder y muestra la salida.
 */

public class App2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce le nombre del fichero.");
        String nombre = sc.nextLine();
        System.out.println("¿Cual va a ser el contenido del fichero?");
        String contenido = sc.nextLine();

        String rutaHijo = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PspRepaso\\src\\main\\java\\bucadordepalabra\\App1.java";
        ProcessBuilder pb = new ProcessBuilder( "java", rutaHijo, nombre, contenido);
        pb.redirectErrorStream(true );

        try {
            Process p = pb.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
