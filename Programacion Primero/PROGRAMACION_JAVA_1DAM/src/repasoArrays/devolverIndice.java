package repasoArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class devolverIndice {

    /*Implementa y utiliza un método que reciba un array de 15 enteros y un número entero.
      El método debe devolver el índice de todas las veces que aparece dicho número en el array.
      Si no se encuentra, devolverá un array vacío.
📌    Ejemplo:
      Si el array es: [2, 3, 1, 4, 5, 6, 7, 8, 5, 1, 2, 3, 5, 7, 9] y nos indican el
      valor 5, el método devolverá [4, 8, 12] porque el número 5 se encuentra en esas posiciones.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int [] array = new int[15];

        System.out.print("Introduce un nuemro entero: ");
        int entero = sc.nextInt();

        System.out.println("Rellena los valores del array");
        for(int i=0; i<array.length; i++){
            array[i] = rand.nextInt(100);
            //System.out.println("Introduce el valor número " +(i+1) +"º: ";
        }
        System.out.println(Arrays.toString(array));


    }
}
