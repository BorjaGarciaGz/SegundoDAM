package repasoArrays;

import java.util.Scanner;

public class numerosDistintos {

    /*Implementa y utiliza un método que, recibiendo un array de enteros
    devuelba un entero indicando el número distinto de numeros que tiene dicho array.hazlo utilizando
    el metodo sort.*/




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del array: ");
        int longitud = sc.nextInt();

        int[] array = new int[longitud];

        System.out.println("Ingrese el valor del array.");
        for(int i = 0; i<longitud; i++){
            System.out.print("Valor numero" +(i+1) +"º: ");
             array[i] = sc.nextInt();
        }




    }
}
