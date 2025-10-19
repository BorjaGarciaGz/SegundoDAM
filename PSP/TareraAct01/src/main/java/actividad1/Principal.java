package actividad1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Crea dos aplicaciones:
 *
 *       a. Crea una aplicación “MiniCalc” que realice operaciones básicas (suma, resta,
 *          multiplicación y división) a partir de dos números y un operador recibidos por argumentos.
 *
 *       b. Luego crea una aplicación principal que:
 *          i. Pida los datos al usuario.
 *          ii. Llame a MiniCalc.
 *          iii. Muestre el resultado devuelto.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        String num1 = sc.nextLine();

        System.out.println("Ingrese otro numero: ");
        String num2 = sc.nextLine();

        System.out.println("Ingrese el comando de la operacion que desea realizar: \n ( + ) .SUMA \n ( - ) .RESTA \n ( * ) .MULTIPLICACION \n ( / ) .DIVISION");
        String comando = sc.nextLine();

        String rutaFichero = "C:\\Users\\borja\\Desktop\\Apuntes y Tareas 2ºDAM\\TareraAct01\\src\\main\\java\\actividad1\\MiniCalc.java";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, num1, num2, comando);
            pb.redirectErrorStream(true);
            Process p = pb.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            p.waitFor();
        }
        catch (IOException | InterruptedException e) {
            System.out.println("ERROR..." + e.getMessage());
        }
    }
}
