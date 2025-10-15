package CadenasDeCaracteres;

import java.util.Scanner;

public class Tema7Glosario {
    public static void main(String[] args) {

        // declaración de cadenas
        //String cadenaA=new String();//cadena vacia
        String cadenaB=new String("Hola");//declaramos un objeto
        //String cadenaC="Hola";

        //Leer cadenas
        Scanner lector=new Scanner(System.in);
        //String cadena;
        cadenaB=lector.next();//Una palabra
        //cadena=lector.nextLine();//Toda la linea
        System.out.println("El contenido de la cadena es: "+cadenaB);



        // CHAR caracteres especiales
        //char prueba= '\n';
        char prueba1= '\'';
        char prueba2= '\\';
        char prueba3= '\"';
        System.out.println("El resultado es: " + prueba1 + prueba2 + prueba3);

        // CHAR representado como un número entero.
        // para que aparezcan los dos valores de char usamos la concatenacion con "".
        char prueba4= 87;
        char prueba5= 'W';
        System.out.println(prueba4 +" " +prueba5);

        //Se pueden asiganar valores de enteros y caracter, tanto a char como a int.

        int numLetra= 'a'; // de caracter a número
        System.out.println("1: " +numLetra);
        char a= 97; // de  número a caracter
        System.out.println("2: " +a);

        //para hacer una conversión
        numLetra= 97;
        a = (char) numLetra; // de esta manera cambiamos
        System.out.println("3: " +a);

        a = 'a';
        int e = a;
        System.out.println("4: " +e);









    }
}
