import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Padre {
    public static void main(String[] args) {
        String rutaFichero = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\Sumador\\out\\artifacts\\Sumador_jar\\Sumador.jar";
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", rutaFichero);
        ArrayList<Integer> numerosEnvio = new ArrayList<>();
        try {
            Process p = pb.start();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            for (int i = 0; i < 5; i++) {
                int numeroGenerado = generaAleatorio(1,30);
                bw.write(numeroGenerado+"\n");
                numerosEnvio.add(numeroGenerado);
            }
            bw.flush();
            bw.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea = br.readLine();
            System.out.print("El resultado de sumar ");
            for (int i = 0; i < numerosEnvio.size()-1; i++) {
                System.out.print(numerosEnvio.get(i)+"+");
            }
            System.out.print(numerosEnvio.get(numerosEnvio.size()-1));
            System.out.println(" es: "+linea);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int generaAleatorio(int minimo, int maximo){
        return (int) (Math.floor(Math.random()*(maximo-minimo+1)+minimo));
    }
}

