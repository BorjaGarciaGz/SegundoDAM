package repasoArrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    /*Implementa y utiliza un método que recibe tres enteros. El primer entero va a indicar el número de elementos
     (enteros) que va a devolver el array. Los valores de estos elementos se deben calcular aleatoriamente entre un mínimo y
     un máximo que serán el segundo y tercer parámetro que reciba el método. El array conseguido debe ser devuelto por el método.s*/


    public static int [] arrayDevuelto(int longitud, int minimo, int maximo) {

        int [] array = new int[longitud];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = rand.nextInt((maximo-minimo)+1) + minimo;
        }

        return array;

    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud del array: ");
        int longitud = entrada.nextInt();

        System.out.print("Ingrese el valor minimo del array: ");
        int minimo = entrada.nextInt();

        System.out.print("Ingrese el valor maximo del array: ");
        int maximo = entrada.nextInt();

        int [] resultado = arrayDevuelto(longitud, minimo, maximo);

        System.out.print("El array es: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }





    }






}
