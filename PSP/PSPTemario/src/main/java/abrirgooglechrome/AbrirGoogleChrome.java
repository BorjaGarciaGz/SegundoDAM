package abrirgooglechrome;

import java.io.File;
import java.io.IOException;

public class AbrirGoogleChrome {
    public static void main(String[] args) {
        String so = System.getProperty("os.name").toLowerCase();
        String comando;
        ProcessBuilder pb;

        try {
            if (so.contains("windows")) {
                // Intenta las dos ubicaciones típicas
                comando = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
                File fichero = new File(comando);

                if (!fichero.exists()) {
                    comando = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
                }
                // Ruta completa como PRIMER token (sin split)
                pb = new ProcessBuilder(comando /*, "https://www.google.com" */);

            } else if (so.contains("mac")) { // macOS
                // Usa 'open' con la app
                pb = new ProcessBuilder("open", "-a", "Google Chrome" /*, "https://www.google.com" */);

            } else { // Linux
                // Prueba xdg-open (abre con navegador por defecto)
                pb = new ProcessBuilder("xdg-open", "about:blank");
                // O directamente chrome si sabes que está instalado:
                // pb = new ProcessBuilder("google-chrome" /*, "https://www.google.com" */);
            }

            pb.redirectErrorStream(true);
            pb.start();

        } catch (IOException e) {
            e.printStackTrace(); // así ves el mensaje real de la IOException
        }
    }
}
