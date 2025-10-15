package actividad02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crea dos aplicaciones:
 *
 *      a. Aplicación 1
 *          i. Le pide al usuario el número de palabras que quiere introducir.
 *          ii. Le pide al usuario que introduzca estas palabras.
 *          iii. Todas estas palabras se las pasará en una única cadena a Aplicación 2
 *          iv. Recibirá una cadena con estas palabras ordenadas de Aplicación 2 y mostrará estas
 *              palabras poniendo cada palabra en una línea distinto y al final indicará el número
 *              total de palabras.
 *
 *      b. Aplicación 2
 *           i. Recibe una cadena con sucesivas palabras
 *          ii. Le devolverá todas las palabras en una única cadena a Aplicación ordenadas
 *              alfabéticamente en orden descendente (Si recibe Mario Ana Zaragoza devolverá Zaragoza Mario Ana)
 */

public class Aplicacion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas palabras desea introducir?");
        int numPalabras = sc.nextInt();
        sc.nextLine();

        ArrayList palabras = new ArrayList();

        for (int i = 0; i < numPalabras; i++) {
            System.out.println("Introduce la palabra numero " + (i + 1) + ":");
            String palabra = sc.next();
            palabras.add(palabra);
        }
        System.out.println(palabras);

        String cadena  = String.join(" ", palabras);

        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\Act01ProgramacionMultiproceso\\src\\main\\java\\actividad02\\Aplicacion2.java";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, cadena);
            pb.redirectErrorStream(true);
            Process proceso = pb.start();
        }
        catch (Exception e) {
            System.out.println(e);
        }



    }
}
