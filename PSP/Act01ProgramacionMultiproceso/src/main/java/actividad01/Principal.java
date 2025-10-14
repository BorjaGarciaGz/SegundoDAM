package actividad01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Introduzca la operación que desea realizar: \n ( + ) .SUMA \n ( - ) .RESTA \n ( * ) .MULTIPLICACIÓN \n ( / ) .DIVISIÓN");
        String operacion = sc.next();
    }
}
