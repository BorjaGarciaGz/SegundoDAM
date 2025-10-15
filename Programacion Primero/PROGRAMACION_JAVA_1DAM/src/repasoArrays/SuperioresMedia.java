package repasoArrays;

import java.util.Scanner;

public class SuperioresMedia {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[5];

        System.out.println("Introduce los valores del array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresa un numero: ");
            array[i] = sc.nextInt();
        }
        int resultado = superiorMedia(array);
        System.out.println("El resultado es: " + resultado);
    }
    public static int superiorMedia(int [] array) {
        int contador =0;
        int media = 0;
        int suma = 0;

        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        media = suma / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                contador++;
            }
        }
        return contador;
    }

}
