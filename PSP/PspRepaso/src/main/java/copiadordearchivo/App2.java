package copiadordearchivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Descripción:
 *
 * App1 recibe dos argumentos: nombre del fichero original y nombre del nuevo fichero.
 * Copia el contenido del primero dentro del segundo.
 *
 * App2 pide los nombres al usuario, ejecuta App1 mediante ProcessBuilder y muestra un mensaje de confirmación.
 */

public class App2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cual es el nombre del fichero original?");
        String ficheroOriginal = entrada.nextLine();
        System.out.println("¿Y el nombre del nuevo fichero?");
        String ficheroNuevo = entrada.nextLine();

        String rutaApp1 = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PspRepaso\\src\\main\\java\\copiadordearchivo\\App1.java";

        ProcessBuilder pb = new ProcessBuilder(rutaApp1, ficheroOriginal, ficheroNuevo);
        pb.redirectErrorStream(true);

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
