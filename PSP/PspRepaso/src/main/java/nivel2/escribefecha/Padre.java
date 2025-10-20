package nivel2.escribefecha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;


/**
 * EscribeFecha
 *  App1 escribe en un fichero la fecha y hora actual.
 *  Recibe el nombre del archivo por argumento.
 *  App2 la llama 3 veces con pausas de 1 segundo y luego muestra el contenido del fichero
 */

public class Padre {
    public static void main(String[] args) {
        Path ruta = Paths.get("mi_archivo_con_contenido.txt");
        String contenido = LocalDateTime.now().toString();

        String rutaHijo = "C:\\Users\\borja\\Documents\\ProyectosSegundoDAM\\SegundoDAM\\PSP\\PspRepaso\\src\\main\\java\\nivel2\\escribefecha\\Hijo.java";

        ProcessBuilder pb = new ProcessBuilder("java", rutaHijo, contenido);
        pb.redirectErrorStream(true).inheritIO();

        try {
            Files.writeString(ruta, contenido);
            System.out.println("Archivo creado y escrito exitosamnete.");

            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error al crear o escribir el archivo.");
        }
    }
}
