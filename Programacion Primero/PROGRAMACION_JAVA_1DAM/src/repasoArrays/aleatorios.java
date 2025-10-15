package repasoArrays;

import java.util.Random;

public class aleatorios {
    /*Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100.
      Mostrar la suma de todos los números aleatorios que se guardan en la tabla.
     */

    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

    }
}
