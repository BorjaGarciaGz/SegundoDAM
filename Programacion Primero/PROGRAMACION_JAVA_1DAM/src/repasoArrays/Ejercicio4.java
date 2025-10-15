package repasoArrays;

import java.util.Scanner;

public class Ejercicio4 {

    /*Implementa y utiliza un método que reciba un array de números enteros y devuelva un array que indique Par o Impar según
      el valor en el índice correspondiente sea un número par o impar.
      Por ejemplo, si recibe el array 3, 4, 4, 1, 5 devolverá el array Impar, Par, Par, Impar, Impar.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int longitudArray = sc.nextInt();

        int [] array = new int[longitudArray];

        for (int i =0; i < longitudArray; i++) {
            System.out.println("Introduce el numero: " +(i+1) +" :");
            array[i] = sc.nextInt();
        }

    }
    public String[] parImpar(int [] array) {

        String[] resultado = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                resultado[i] = "Par";
            } else {
                resultado[i] = "Impar";
            }

        }

        return resultado;
    }
}


