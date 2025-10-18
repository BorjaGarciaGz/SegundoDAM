package sumador;

import java.io.*;
import java.util.ArrayList;

public class Padre {
    public static void main(String[] args) {

        String rutaEjecutable = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PSPTemario\\src\\main\\java\\sumador\\HijoSumador.java";

        ProcessBuilder pb = new ProcessBuilder("java", rutaEjecutable);

        ArrayList <Integer> numerosEnvios = new ArrayList<>();

        try {
            Process p = pb.start();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            for (int i = 0; i < 5; i++) {
                int numeroGenerado = generaAleatorio(1, 30);
                bw.write(numeroGenerado + "\n");
                numerosEnvios.add(numeroGenerado);
            }
            bw.flush();
            bw.close();

            //Obtenemos el resultado de la suma
            BufferedReader br = new BufferedReader(new FileReader(rutaEjecutable));
            String linea = br.readLine();

            System.out.print("El resultado de sumar ");
            for (int i = 0; i < numerosEnvios.size()-1; i++) {
                System.out.print(numerosEnvios.get(i) + " + ");
            }
            System.out.print(numerosEnvios.get(numerosEnvios.size()-1));
            System.out.print(" es = " + linea);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static int generaAleatorio(int minimo, int maximo) {
        return (int) (Math.floor(Math.random() * (maximo - minimo + 1) + minimo));

    }
}
