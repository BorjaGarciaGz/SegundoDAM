package actividad3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error no se han recibido los argumentos");
            return;
        }

        Path nombraFichero = Paths.get(args[0]);
        String accion = args[1].toLowerCase();

        boolean esSobre = accion.equals("nuevo");
        boolean esAñadir = accion.equals("append");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy 'a las' HH:mm:ss");// Esto lo he buscado porque no sabía como hacerlo
        String linea = LocalDateTime.now().format(fmt);

        try {
            if (esSobre) {
                Files.writeString(
                        nombraFichero,
                        linea + System.lineSeparator(),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING,
                        StandardOpenOption.WRITE);
            } else {
                if (Files.exists(nombraFichero) && Files.size(nombraFichero) > 0) {
                    Files.writeString(
                            nombraFichero,
                            System.lineSeparator() + linea,
                            StandardOpenOption.CREATE,
                            StandardOpenOption.APPEND,
                            StandardOpenOption.WRITE);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
