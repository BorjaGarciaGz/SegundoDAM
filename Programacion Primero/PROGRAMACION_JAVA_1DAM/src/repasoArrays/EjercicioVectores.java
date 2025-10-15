package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioVectores {

   /* Construir un programa que pida al usuario dos vectores de números enteros v1 y v2,
    y que construya un nuevo vector del resultado de “concatenar” los vectores v1 y v2.
    Es decir, colocar los elementos de v2 a continuación de los de v1 y,
    finalmente, mostrar el resultado de la concatenación por pantalla.*/

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int longitud1 = 5;
        int longitud2 = 5;

        int[] array1 = new int[longitud1];
        System.out.println("Ingrese los valores del array 1.");
        for (int i = 0; i < longitud1; i++) {
            System.out.print("Ingrese el valor " + (i + 1) +" : ");
            array1[i] = entrada.nextInt();
        }
        System.out.println("El array1 ingresado es: ");
        System.out.print(Arrays.toString(array1));

        System.out.println();
        System.out.println("Ingrese los valores del array 2.");
        int[] array2 = new int[longitud2];
        for (int i = 0; i < longitud2; i++) {
            System.out.print("Ingrese el valor " + (i + 1) +" : ");
            array2[i] = entrada.nextInt();
        }
        System.out.println("El array2 ingresado es: ");
        System.out.print(Arrays.toString(array2));



    }
}
