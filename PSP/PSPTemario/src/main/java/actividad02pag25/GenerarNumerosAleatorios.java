package actividad02pag25;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Vamos a crear un proyecto con dos clases
 *
 *     Clase1 Va a generar x números aleatorios (x es el primer
 *          parámetro que recibe como argumento) entre dos números que
 *          va a recibir también como argumento y los va a mostrar por
 *          terminal ordenados.
 *
 *     Clase2 va a llamar a esta Clase1 (no es necesario opción –jar)
 */

public class GenerarNumerosAleatorios {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("No se puede generar numeros de aleatorios");
            return;
        }

        try {
            int cantidadAleatorios = Integer.parseInt(args[0]);
            int minimo = Integer.parseInt(args[1]);
            int maximo = Integer.parseInt(args[2]);

            int [] numeros = new int[cantidadAleatorios];

            for (int i = 0; i < cantidadAleatorios; i++) {
                numeros[i] = (int)Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
            }

            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));


        } catch (Exception e) {
            System.out.println("Error. debes ingresar valores numericos");
        }
    }
}