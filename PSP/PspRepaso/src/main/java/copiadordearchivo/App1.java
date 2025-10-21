package copiadordearchivo;

import java.io.*;
;

public class App1 {
    public static void main(String[] args) throws IOException {

        String nombreOriginal= args[0];
        String nombreNuevo= args[1];
        try {
            BufferedReader original = new BufferedReader(new FileReader(nombreOriginal));
            BufferedWriter nuevo = new BufferedWriter(new FileWriter(nombreNuevo,true));
            String linea;

            while ((linea = original.readLine()) != null) {
                nuevo.write(linea);
                nuevo.newLine();
            }
            original.close();
            nuevo.close();
            System.out.println("Archivo creado correctamente");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Todo fallo satisfactoriamente");
        }

    }
}
