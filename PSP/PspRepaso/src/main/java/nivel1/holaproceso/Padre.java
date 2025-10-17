package nivel1.holaproceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Padre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu  nombre: ");
        String nombre = sc.nextLine();

        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PspRepaso\\src\\main\\java\\nivel1\\holaproceso\\Hijo.java";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, nombre);
            pb.redirectErrorStream(true);
            Process process = pb.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            process.waitFor();
        }
        catch (IOException  | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
