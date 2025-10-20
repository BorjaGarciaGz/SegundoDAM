package bucadordepalabra;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Descripción:
 *
 * App1 recibe dos argumentos: el nombre de un fichero y una palabra.
 * Cuenta cuántas veces aparece esa palabra dentro del fichero y muestra el resultado.
 *
 * App2 pide al usuario el nombre del fichero y la palabra, ejecuta App1 con ProcessBuilder y muestra la salida.
 */

public class App1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java App1 <nombre> <apellido>");
            return;
        }
        String nombre = args[0];
        String contenido = args[1];

        File fichero = new File(nombre);

        try {
            if (fichero.createNewFile()){
                System.out.println("Archivo creado: " +fichero.getName());
            }else {
                System.out.println("El archivo ya existe: " +fichero.getName());
            }
            try (FileWriter fw = new FileWriter(fichero)) {
                fw.write(contenido);
                System.out.println("El contenido del fiechero es: " + contenido);
            }catch (IOException e){
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
