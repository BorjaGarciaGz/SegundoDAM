package repasoArrays;

import java.util.Scanner;

public class mayorMenor {

    /* Implementa y utiliza un método que reciba un array de 10 enteros y muestre por
       pantalla cuáles de ellos son el mayor, el menor y cuántas veces se repite el mayor y el
       menor en dicho array.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la longitud del array: ");
        int longitud = sc.nextInt();

        int[] array = new int[longitud];

        System.out.println("Introduzca los valores del array");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce el valor número " + (i + 1) + "º: ");
            array[i] = sc.nextInt();
        }
        mayorMenor(array);

    }
    public static void mayorMenor(int[] array) {

        int contadorMayor = 0;
        int contadorMenor = 0;
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                mayor = array[i];
                menor = array[i];
            } else if (array[i] < menor) {
                menor = array[i];
            }else if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == menor) {
                contadorMenor++;
            }
            if (array[i] == mayor) {
                contadorMayor++;
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("Las veces que se repite el número mayor es: " + contadorMayor);
        System.out.println("Las veces que se repite menor es: " + contadorMenor);
    }
}