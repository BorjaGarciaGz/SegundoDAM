package org.example;

import java.util.Scanner;

public class Hijo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;

        while (sc.hasNextInt()){
            resultado+=sc.nextInt();
        }

        System.out.println(resultado);
    }
}
