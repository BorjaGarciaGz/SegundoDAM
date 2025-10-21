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

        String ruta="src/Ejercicio_11/Aplicacion_01.java";
        Scanner sc = new Scanner(System.in);
        System.out.println("De que fichero quieres hacer una copia?");
        String original = sc.nextLine();
        System.out.println("Como quieres que se llame el fichero nuevo");
        String nuevo = sc.nextLine();


        ProcessBuilder pb = new ProcessBuilder("java",ruta,original, nuevo);
        pb.inheritIO();
        try{
            Process p = pb.start();
            p.waitFor();
        }catch(IOException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
