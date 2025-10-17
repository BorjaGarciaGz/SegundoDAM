package nivel1.sumarporargumentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        String primero = sc.nextLine();

        System.out.println("Ingrese el segundo numero: ");
        String segundo = sc.nextLine();

        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PspRepaso\\src\\main\\java\\nivel1\\sumarporargumentos\\App1.java";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, primero, segundo);
            pb.redirectErrorStream(true);
            Process p = pb.start();

            //Esta parte lee y muestra por consola todo lo que el proceso hijo va imprimiendo por su salida estandar.
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            p.waitFor();
        }catch (IOException | InterruptedException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
