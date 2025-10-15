package repasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class matriz3x3 {

    /*
    Pedir al usuario una matriz 3x3 y mostrar la traspuesta de esa matriz (intercambiar filas
    por columnas
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas = 3;
        int columnas = 3;

        int [][] matriz = new int[filas][columnas];

        System.out.println("Introduce los valores de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Valor de la posición [" + i + "][" + j + "]");
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("La matriz creada es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    /*public static int [][] trasPuesta(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {

        }


    }*/
}
