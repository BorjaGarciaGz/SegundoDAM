package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ordenaArrayAscendente {
    public static void main(String[] args) {

        /*. Ordenar un array de enteros en orden descendente (sin Arrays.sort())
        Escribe un programa que solicite al usuario un array de enteros. Luego, implementa un método
        que reciba el array y lo ordene de mayor a menor sin utilizar Arrays.sort().
                Ejemplo de entrada: [5, 2, 9, 1]
        Salida esperada: [9, 5, 2, 1]/*/
        Scanner sc = new Scanner(System.in);
        System.out.println("longitud del array");
        int longitud = sc.nextInt();
        System.out.println("ingresa el array");
        int[]array=new int[longitud];
        for (int i = 0; i <array.length; i++) {
            System.out.println("introduce la posicion"+(i+1));
            array[i]=sc.nextInt();
        }
        int[] arrayinvertido=ordenarDescendente(array);
        System.out.println(Arrays.toString(arrayinvertido));

    }

    public static int[] ordenarDescendente(int[] array) {
        int[] arrayOrdenado = array.clone(); // Clonar el array para no modificar el original

        // Algoritmo de ordenación (Selection Sort)
        for (int i = 0; i < arrayOrdenado.length - 1; i++) {
            for (int j = i + 1; j < arrayOrdenado.length; j++) {
                if (arrayOrdenado[i] < arrayOrdenado[j]) {
                    // Intercambiar valores
                    int temp = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[j];
                    arrayOrdenado[j] = temp;
                }
            }
        }

        return arrayOrdenado;
    }
}
