package mostrarnombre;

import java.io.IOException;
import java.nio.file.Paths;

public class MostrarNombre {
    public static void main(String[] args) {
        if (args.length >= 3) {
            System.out.println("El nombre recibido es " + args[0] + args[1] + args[2]);
        }

        String nombre = "Borja";
        String apellido1 = "Garcia";
        String apellido2 = "Gomez";

        String jarPath = Paths.get("out","artifacts","PSPTemario_jar","PSPTemario.jar")
                .toAbsolutePath().toString();

        ProcessBuilder pb = new ProcessBuilder(
                "java", "-cp", jarPath, "mostrarnombre.MostrarNombre",
                nombre, apellido1, apellido2
        );
        pb.inheritIO();


        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
