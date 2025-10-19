package actividad3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class App2 {

    private static final String fichero = "fechas.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rutaFichero = "C:\\Users\\borja\\Desktop\\Apuntes y Tareas 2ºDAM\\TareraAct01\\src\\main\\java\\actividad3\\App1.java";

        try {

            System.out.println("¿Cuantas veces quieres llamar al proceso? (de 4 a 6 veces).");
            int vecesLlamada = sc.nextInt();
            Random rand = new Random();

            for (int i = 0; i < vecesLlamada; i++) {
                String modo = (i == 0) ? "nuevo" : "append";

                ProcessBuilder pb = new ProcessBuilder("java", rutaFichero, fichero, modo);
                pb.redirectErrorStream(true);
                try {
                    Process p = pb.start();

                    try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                    }
                    p.waitFor();

                    if (i < vecesLlamada - 1) {
                        int esperar = 2000 + rand.nextInt(3000);
                        Thread.sleep(esperar);
                    }
                } catch (IOException | InterruptedException e) {
                    System.out.println("Error al leer el proceso" + e.getMessage());
                    return;
                }
            }

            System.out.println("\nContenido del fichero: " + fichero + ":");


        } finally {

        }
    }
}