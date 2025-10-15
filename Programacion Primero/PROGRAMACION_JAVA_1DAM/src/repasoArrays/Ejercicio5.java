package repasoArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio5 {

    /*Implementa y utiliza un método que reciba dos arrays de 10 números enteros e indique el número de números en el que coincide
     (en el mismo índice). Por ejemplo, si recibe como primer array 1, 3, 5, 7, 9, 9, 1, 3, 2 y 5 y
     como segundo array 3, 3, 6, 8, 9, 2, 1, 4, 4 y 6 devolverá 3 ya que coincide en el valor del índice [1], [4] y [6].*/


    public static int recibearray (int [] array1, int [] array2) {
        int contador=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int longitud1 = 10;
        int longitud2 = 10;

        int [] array1 = new int[longitud1];
        for(int i=0; i<longitud1; i++){
            System.out.println("Ingrese el número " +(i+1));
            array1[i] = entrada.nextInt();
        }
        System.out.print("El array1 ingresado es: ");
        for(int i=0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int [] array2 = new int[longitud2];
        for(int i=0; i<longitud2; i++){
            System.out.print("Ingrese el número " +(i+1));
            array2[i] = entrada.nextInt();
        }

        System.out.println("El array2 ingresado es: ");
        for(int i=0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }

        System.out.println("El número de veces que coinciden los indeces son");
        System.out.println(recibearray(array1,array2));
    }



}
