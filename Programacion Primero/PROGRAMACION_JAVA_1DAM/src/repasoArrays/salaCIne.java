package repasoArrays;

import java.util.Random;
import java.util.Scanner;

/*public class salaCine {
    /*
     Implementar un sistema de reserva de asientos en un cine
        Desarrolla un programa que simule la reserva de asientos en un cine.
   • La sala debe representarse con una matriz donde cada asiento puede estar disponible (D) u
        ocupado (O).
   • El usuario podrá ver el estado de la sala, seleccionar un asiento y reservarlo.
   • El programa debe validar si el asiento está disponible antes de reservarlo.
        Ejemplo de entrada:
        nginx
                CopiarEditar
        Seleccione asiento fila 2, columna 3.
        Salida esperada:
        "Asiento reservado correctamente."*/

    /*Random rand = new Random();
    Scanner sc = new Scanner(System.in);
        System.out.println("Que filas tiene tu cine");
    int filas = sc.nextInt();
        System.out.println("Que columnas tiene tu cine");
    int columnas = sc.nextInt();
        System.out.println("Vamos a imprimir la sale de cine");
    char[][] salacine=new char[filas][columnas];
        for (int i = 0; i < salacine.length; i++) {
        for (int j = rand.nextInt(salacine.length); j < salacine[0].length; j++) {
            salacine[i][j]= 'L';
        }
    }
       for (int i = 0; i < salacine.length ; i++) {
        for (int j = 0; j < salacine[0].length; j++) {
            if(salacine[i][j]!='L'){
                salacine[i][j]='O';
            }
        }
    }
        for (int i = 0; i < salacine.length; i++) {
        for (int j = 0; j < salacine[0].length; j++) {
            System.out.print(salacine[i][j]+" ");
        }
        System.out.println();
    }
    reservas(salacine1);

}
public static void reservas(char [][] salacine1){

    Scanner sc = new Scanner(System.in);
    System.out.println("Elige la butaca que vas a reservar:");
    System.out.println("fila?");
    int fila=sc.nextInt();
    System.out.println("Que columna?");
    int columna=sc.nextInt();

    if(salacine1[fila][columna]=='L'){
        System.out.println("El asiento se puede reservar, esta es tu reserva");
        salacine1[fila][columna]='X';
        for (int i = 0; i < salacine1.length ; i++) {
            for (int j = 0; j < salacine1[0].length; j++) {
                System.out.print(salacine1[i][j]+" ");
            }
            System.out.println();
        }
    }else {
        System.out.println("El asiento esta ocupado");
    }

}*/



