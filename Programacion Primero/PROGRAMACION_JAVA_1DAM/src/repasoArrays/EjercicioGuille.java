package repasoArrays;
import java.util.Arrays;
import java.util.Scanner;
public class EjercicioGuille {

      /*Enunciado1:/Implementa un método que pida al usuario 10 números enteros (no es necesario hacerle
        llegar los datos, se piden en el método) y los devuelva en un array ordenados de mayor a
        menor.*/
    public static int [] devuelveOrdenado (){
        Scanner entrada = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el número " + (i+1));
            array[i] = entrada.nextInt();
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(devuelveOrdenado()));
    }
}
