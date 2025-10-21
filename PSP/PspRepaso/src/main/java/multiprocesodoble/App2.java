package multiprocesodoble;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int numeroLlamadas = rand.nextInt(1, 20);

        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PspRepaso\\src\\main\\java\\multiprocesodoble\\App1.java";

        for (int i = 0; i < numeroLlamadas; i++) {
            int numero = rand.nextInt(1, 40);
            ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, Integer.toString(numero) + "");
            pb.inheritIO();
            try{
                Process p = pb.start();
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
