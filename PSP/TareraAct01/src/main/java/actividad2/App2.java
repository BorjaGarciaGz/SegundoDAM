package actividad2;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error al recibir los argumentos");
            return;
        }

        String cadena = args[0];

        String [] palabras = cadena.split("\\s+"); // con esto consigo un salto de linea, además sin este salto de linea mo me contaria bien las palabras

        Arrays.sort(palabras);
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.println(palabras[i]);
        }

        System.out.println("Hay " + palabras.length + " palabras");

    // Es una chapuza, pero funciona!



    }

}
