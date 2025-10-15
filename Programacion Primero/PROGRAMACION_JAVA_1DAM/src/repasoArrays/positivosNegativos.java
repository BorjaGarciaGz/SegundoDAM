package repasoArrays;
import java.util.Arrays;
import java.util.Scanner;
public class positivosNegativos {

    /*Implementa y utiliza un método que reciba un array de 10 valores de tipo decimal
      que pueda tener valores positivos y negativos. Debe mostrar por pantalla el total de la
      suma de los valores que son positivos y la suma de los valores que son negativos (que
      será un valor negativo)*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] array = new double[5];

        System.out.println("Introduce valores decimales para el array, pueden ser negativos y positivos.");
        for(int i = 0; i < array.length; i++){
            System.out.print("Introduce el valor " + (i+1) + "º: ");
            array[i] = entrada.nextDouble();
        }
        System.out.println(Arrays.toString(array));

        //declaraba esta variable para llamar al metodo, pero es un metodo que no devuelve(VOID).
        //double resultadoFinal = positivosNegativos(array);
        //System.out.println("La suma total de todos los números del array es: " + resultadoFinal);

        positivosNegativos(array);

        entrada.close();
    }
    public static void positivosNegativos(double [] array){
        double sumaPositivos = 0;
        double sumaNegativos = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sumaPositivos += array[i];
            }
        }
        System.out.println(sumaPositivos);
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                sumaNegativos += array [i];
            }
        }
        System.out.println(sumaNegativos);
    }
}
