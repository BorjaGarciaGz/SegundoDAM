package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReemplazaPalabras {

    /*Reemplazar palabras en un array de Strings
    Escribe un programa que lea un array de Strings y luego implemente un método que reciba una
    palabra a buscar y otra para reemplazarla.
    Ejemplo de entrada:
    Array: ["java", "python", "java"]
    Buscar: "java"
    Reemplazar por: "kotlin"
    Salida esperada:
            ["kotlin", "python", "kotlin"]*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas palabras desea introducir: ");
        int longitud = sc.nextInt();

        System.out.println("Ingrese el array de string: ");
        String[] palabras = new String[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese el valor " + (i+1) + "º: ");
            palabras[i] = sc.next();
        }
        System.out.println("Introduce la palabra a buscar: ");
        String buscar = sc.next();
        System.out.println("Introduce la palabra de reemplazo: ");
        String reemplazo = sc.next();

        String[] resultado = reemplazo(palabras, buscar, reemplazo);
        System.out.println(Arrays.toString(resultado));
    }
    public static String [] reemplazo(String[] palabras, String buscar, String reemplazo) {
        String [] resultado = new String[palabras.length];

        for (int i = 0; i < palabras.length; i++) {
            resultado[i] = palabras[i];
            if (palabras[i].equals(buscar)) {
                resultado[i] = reemplazo;
            }
        }
        return resultado;
    }
}
