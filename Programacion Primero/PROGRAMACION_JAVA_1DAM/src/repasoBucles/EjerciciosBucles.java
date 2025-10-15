package repasoBucles;

import java.util.Scanner;

public class EjerciciosBucles {

    /*Realiza un programa que pida un número entero por pantalla inferior a 10. Posteriormente va a pedir
    por pantalla ese número de números, es decir, si inicialmente hemos introducido el número 7 ahora
    pedirá 7 números de tipo entero y calculará la media de ellos(la media debe ser un número con decimales).*/


   /* public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingrese un numero inferior a 10: ");
            numero = sc.nextInt();
        }
        while(numero > 10);

        int suma =0;
        for (int i = 0; i < numero; i++){
            System.out.println("Ingresa el número" +(i + 1));
            int numero2 = sc.nextInt();
            suma += numero2;
        }
        System.out.println("La suma es: " + suma  + "la media es " + suma/numero);

    }*/

    /*  Realiza un programa que pida un número entero que se encuentre entre el
        x y el 50. Posteriormente debe mostrar por terminal todos los números que son
        múltiplos de 3 desde el x hasta dicho número o mostrar mensaje de error si el número
        no se encuentra en dicho rango sin volver a pedir el número (x es el día que naciste del
        mes)*/


   /* public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fechaNac;
        System.out.println("Ingrese fecha de nacimiento: ");
        fechaNac = sc.nextInt();

        System.out.println("Ingrese un número que este entre " +fechaNac +" y el 50: ");
        int num = sc.nextInt();

        if (num<2 || num>50){
            System.out.println("el numero debe ser entre 2 y el 50: ");
        }
        else{System.out.println("Los múltiplos de 3 entre " + fechaNac + " y " + num + " son:");
            for (int i = 0; i <= num; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    */
    /* Realiza un programa que pida un número entero que se encuentre entre
       el x y el 50. Posteriormente debe mostrar por terminal todos los números que son
       múltiplos de 3 desde x hasta dicho número o mostrar mensaje de error si el número no
       se encuentra en dicho rango volviendo a pedir un número hasta que dicho número se
       encuentre en el rango (x es el día que naciste del mes)*/


  /*  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// pedimos fecha de nacimiento como limite inferior

        System.out.println("Ingrese el día de su nacimiento: ");
        int diaNac = sc.nextInt();

        int numero;

        do {
            System.out.print("Imngrese un número entre " + diaNac + " y 50 ");
            numero = sc.nextInt();

            //dentro del do usamos el if para que nos de el mensaje de error

            if (numero < diaNac || numero > 50) {
                System.out.println("Error. el numero ingresado no esta dentro del rango permitido");
            }
        } while (numero < diaNac || numero > 50);

        System.out.print("Los multiplos de 3 entre " + diaNac + " y " + numero + " son: ");
        for (int i = diaNac; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }
    }*/

    /*Realiza un programa que pida x números enteros y muestre cuál ha sido
      el mayor que ha sido introducido y el menor (x será el número de letras que tenga tu
      nombre (en casode ser compuesto se coge tu primer nombre, por ejemplo, si es María
      Isabel, x seráel número 5).*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar el primer nombre del usuario para determinar x (número de letras)
        System.out.print("Introduce tu primer nombre: ");
        String nombre = sc.next(); // Se toma solo la primera palabra en caso de nombre compuesto
        int x = nombre.length();
        System.out.println("Vas a introducir " + x + " números enteros.");

        // Inicializamos las variables mayor y menor
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Se solicita x números y se determina el mayor y el menor
        for (int i = 1; i <= x; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = sc.nextInt();

            if (num > mayor) {
                mayor = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        // Mostrar resultados
        System.out.println("El número mayor introducido es: " + mayor);
        System.out.println("El número menor introducido es: " + menor);

        sc.close();
    }


    }


