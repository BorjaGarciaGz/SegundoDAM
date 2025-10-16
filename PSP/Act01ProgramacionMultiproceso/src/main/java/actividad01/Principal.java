package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Crea dos aplicaciones:
 *
 *      a. Crea una aplicación “MiniCalc” que realice operaciones básicas (suma, resta,
 *          multiplicación y división) a partir de dos números y un operador recibidos por argumentos.
 *
 *      b. Luego crea una aplicación principal que:
 *          i. Pida los datos al usuario.
 *          ii. Llame a MiniCalc.
 *          iii. Muestre el resultado devuelto.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        String num1 = sc.nextLine();
        System.out.println("Ingrese el segundo numero: ");
        String num2 = sc.nextLine();
        System.out.println("Introduzca la operación que desea realizar: \n ( + ) .SUMA \n ( - ) .RESTA \n ( * ) .MULTIPLICACIÓN \n ( / ) .DIVISIÓN");
        String operacion = sc.nextLine();

        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\Act01ProgramacionMultiproceso\\src\\main\\java\\actividad01\\Minicalc.java";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, num1, num2, operacion);
            pb.redirectErrorStream(true);
            Process proceso = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            proceso.waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al ejecutar. " + e.getMessage());
        }
    }
}
