package nivel2.escribefecha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
