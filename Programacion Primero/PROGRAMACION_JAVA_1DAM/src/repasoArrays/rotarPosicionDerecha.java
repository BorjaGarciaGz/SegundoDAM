package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotarPosicionDerecha {

    /*Rotar un array de enteros una posición a la derecha
      Escribe un programa que lea un array de enteros y luego implemente un método que lo rote una
      posición a la derecha.
      Ejemplo de entrada:
      [1, 2, 3, 4]
      Salida esperada:
      [4, 1, 2, 3]*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores del array.");
        System.out.println("Longitud del array: ");
        int longitud = sc.nextInt();
        int[] arrayenteros = new int[longitud];
        sc.nextLine();
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese el valor " + i + "º: ");
            arrayenteros[i] = sc.nextInt();
        }
        int[] resultado = aladerecha(arrayenteros);
        System.out.println(Arrays.toString(resultado));

    }

    public static int[] aladerecha(int[] arrayenteros) {
        int[] arrayderecha = new int[arrayenteros.length];

        for (int i = 0; i < arrayenteros.length - 1; i++) {
            arrayderecha[i + 1] = arrayenteros[i];
        }
        arrayderecha[0] = arrayenteros[arrayderecha.length - 1];
        return arrayderecha;
    }
}