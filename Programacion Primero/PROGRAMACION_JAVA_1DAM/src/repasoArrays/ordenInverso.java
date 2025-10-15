package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ordenInverso {
      /*Escribir una aplicacion que solicite al usuario cuantos numeros
        desea introducir. A continuacion, introducir por teclado esa cantidad
        de numeros enteros, y por ultimo, mostrar en el orden inverso al introducido*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = sc.nextInt();

        int [] array = new int[longitud];
        System.out.println("Introduce los valores del array.");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        for (int i = array.length- 1; i >= 0; i--){
        }
        System.out.println("El array introducido es el siguiente: ");
        System.out.println(Arrays.toString(array));
    }
}

