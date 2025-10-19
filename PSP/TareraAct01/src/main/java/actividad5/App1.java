package actividad5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int n;
        do {
            System.out.println("Introduce un número");
            n = sc.nextInt();
            numeros.add(n);
        } while (n != 0 || n < 0);

        System.out.println("Lista: " + numeros);

        String classpath = System.getProperty("java.class.path");
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", classpath, "actividad5.App2");
        pb.redirectErrorStream(true);

        try {
            Process p = pb.start();

            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()))) {
                for (Integer num : numeros) {
                    bw.write(num + "\n");
                }
                bw.flush();
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
            p.waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }






    }

