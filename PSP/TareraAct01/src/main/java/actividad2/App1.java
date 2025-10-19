package actividad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas palabras desea introducir?");
        int numPalabras = sc.nextInt();
        sc.nextLine();

        List <String> palabras = new ArrayList();

        for (int i = 0; i < numPalabras; i++) {
            System.out.println("Introduce la palabra numero " +(i + 1)  + ":");
            palabras.add(sc.nextLine());
        }
        System.out.println(palabras);

        String cadena = String.join(" ", palabras);

        String rutaFichero = "C:\\Users\\borja\\Desktop\\Apuntes y Tareas 2ºDAM\\TareraAct01\\src\\main\\java\\actividad2\\App2.java";

        try {
            ProcessBuilder pb = new ProcessBuilder( "java", rutaFichero, cadena);
            pb.redirectErrorStream(true);
            Process p = pb.start();

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            p.waitFor();
        } catch (IOException  | InterruptedException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
