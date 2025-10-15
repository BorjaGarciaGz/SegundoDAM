package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInverso {

     /* Implementa y utiliza un método que reciba un array de enteros (podemos hacer las
        pruebas con array de 5 y de 10 enteros) y devuelva un array con los mismos enteros en
        orden inverso al de entrada. Por ejemplo, si el array de entrada tiene los valores 2, 4, 3,
        1 y 5, el de salida debe tener 5, 1, 3, 4 y 2.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array1 = new int[5];
        int [] array2 = new int[10];

        System.out.println("Introduce los valores del primer array.");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Introduce el valor número " + (i + 1) + "º: ");
            array1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        int [] array3 = arrayInverso(array1);
    }
    public static int [] arrayInverso(int [] array1) {

        int [] array1Inverso = new int[array1.length];
        for (int i = array1.length - 1; i >= 0; i--) {
            //array1Inverso[i] = array1[i];
            System.out.print(array1[i] +" ");
        }
        return array1;
    }
}
