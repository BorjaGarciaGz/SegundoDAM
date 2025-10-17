package actividad02pag25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el cantidad de aleatorrios que quiere generar: ");
        String cantidadAleatorios = sc.nextLine();

        System.out.println("Ingrese el número mímimo desde donde quiere generar los aleatorio: ");
        String minimo = sc.nextLine();

        System.out.println("Ingrese el número máximo hasta donde quiere generar los aleatorio: ");
        String maximo = sc.nextLine();


        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PSPTemario\\src\\main\\java\\actividad02pag25\\GenerarNumerosAleatorios.java";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, cantidadAleatorios, minimo, maximo);
            pb.redirectErrorStream(true);
            Process p = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            p.waitFor();

        } catch (IOException e) {
            System.out.println("Error..." + e.getMessage());;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
