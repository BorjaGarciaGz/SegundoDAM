package mostrarnombreconinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Padre {
    public static void main(String[] args) {
        String rutaEjecutable = "C:\\C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PSPTemario\\out\\artifacts\\PSPTemario_jar2\\PSPTemario.jar";

        ProcessBuilder pb = new ProcessBuilder( "java", "-jar", rutaEjecutable);
        pb.redirectErrorStream(true);
        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String lineaLeida;
            while ((lineaLeida = br.readLine()) != null) {
                String[] palabrasLeidas = lineaLeida.split(" ");
                System.out.println("Los dato recibidos son:");
                System.out.println("\tNombre:" + palabrasLeidas[0]);
                System.out.println("\tApellido 1:" + palabrasLeidas[1]);
                System.out.println("\tApellido 2:" + palabrasLeidas[2]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
