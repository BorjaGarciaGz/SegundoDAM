package copiadordearchivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class App1 {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.out.println("Argumentos incorrectos.");
            return;
        }

        Path origen = Path.of(args[0]);
        Path destino = Path.of(args[1]);

        Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);

    }
}
