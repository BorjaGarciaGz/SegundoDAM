package nivel1.ecoconargumentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Padre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe la frase que prefieras: ");
        String frase = entrada.nextLine();

        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PspRepaso\\src\\main\\java\\nivel1\\ecoconargumentos\\Hijo.java";

        try {
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, frase);
            pb.redirectErrorStream(true);
            Process proceso = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
