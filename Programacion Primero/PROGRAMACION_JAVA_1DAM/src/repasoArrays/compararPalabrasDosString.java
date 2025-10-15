package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class compararPalabrasDosString {

    /*Comparar palabras en dos arrays
      Escribe un programa que solicite al usuario dos arrays de Strings del mismo tamaño. Luego,
      implementa un método que compare ambas listas y devuelva un array de booleanos, indicando en
      cada posición si las palabras son iguales o no.
      Ejemplo de entrada: Array 1: ["Hola", "Java", "Python"] Array 2: ["Hola", "C++", "Python"]
      Salida esperada: [true, false, true]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int longitud= 3;
        String [] array1 = new String[longitud];
        String [] array2 = new String[longitud];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Ingrese la cadena número " +(i+1) +"º para el array1. ");
            array1[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Ingrese la cadena número " +(i+1) +"º para el array2. ");
            array2[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(array2));







    }
}
