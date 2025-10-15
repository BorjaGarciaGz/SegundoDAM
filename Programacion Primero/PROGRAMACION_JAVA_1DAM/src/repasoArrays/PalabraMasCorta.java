package repasoArrays;

import java.util.Scanner;

public class PalabraMasCorta {

    /* Encontrar la palabra más corta en un array
       Escribe un programa que lea un array de Strings y luego implemente un método que devuelva la
       palabra más corta.
       Ejemplo de entrada:
       ["java", "c", "python"]
       Salida esperada:
       "c"*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("OIntroduce la longitud del array: ");
        int longitud = sc.nextInt();

        System.out.println("Introduce los valores del array: ");
        sc.nextLine();
        String[] palabra = new String[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduc el valor número: "+(i+1) +"º: ");
            palabra[i] = sc.nextLine();
        }

    }

   // public static String palabraMasCorta(String palabra) {

        /*for (int i = 0; i < palabra.length(); i++) {
            //lonPalabra= len(palabra)

        }
    }*/
}
