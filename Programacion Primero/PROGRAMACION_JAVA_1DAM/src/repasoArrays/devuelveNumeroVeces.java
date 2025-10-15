package repasoArrays;

import java.util.Scanner;

public class devuelveNumeroVeces {

    /*Implementa y utiliza un método que recibe dos parámetros: un array de 10 enteros y un
      número entero. El método debe devolver el número de veces que se encuentra dicho
      número en el array. */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero");
        int repetido = sc.nextInt();

        int [] array = new int[5];

        System.out.println("Introduce los valores del array.");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor número "+(i+1)+"º: ");
            array[i] = sc.nextInt();
        }
        int valor= numerosVeces(repetido, array);
        System.out.println("El número " + repetido +" se repite " +valor +" veces");
    }
    public static int numerosVeces(int entero, int[] array) {
        int contador =0;
        for(int i = 0; i < array.length; i++){
           if(array[i] == entero){
               contador++;
           }
        }
        return contador;
    }
}
