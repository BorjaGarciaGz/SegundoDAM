import java.util.Random;
import java.util.Scanner;

public class CaracteresEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer nombre");
        String nombre1 = sc.nextLine();
        System.out.println("Ingresa el segundo nombre");
        String nombre2 = sc.nextLine();
        System.out.println("Ingresa el tercer nombre");
        String nombre3 = sc.nextLine();
        char[] array =caracteres(nombre1,nombre2,nombre3);
        System.out.println(array);
    }
    public static char[] caracteres (String nombre1,String nombre2,String nombre3){
        Random rand = new Random();
        int fin1= rand.nextInt(nombre1.length())+1;
        System.out.println("el numero aleatorio es "+fin1);
        int fin2= rand.nextInt(nombre2.length())+1;
        System.out.println("el numero aleatorio es "+fin2);
        int fin3= rand.nextInt(nombre3.length())+1;
        System.out.println("el numero aleatorio es "+fin3);
        int longitud=fin1+fin2+fin3;
        char[] array= new char[longitud];
        for (int i = 0; i < fin1; i++) {
            array[i] = nombre1.charAt(i);
        }
        for (int i = 0; i < fin2; i++) {
            array[fin1 + i] = nombre2.charAt(i);
        }
        for (int i = 0; i < fin3; i++) {
            array[fin1 + fin2 + i] = nombre3.charAt(i);
        }
        return array;
    }
}
