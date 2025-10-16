package ProcesoAbrirCalculadora;

public class ProcesoAbrirCalculadora {
    public static void main(String[] args) {

        try {
            ProcessBuilder pb = new ProcessBuilder("calc.exe");
            // Se ejecuta start para crear realmente el proceso
            Process p = pb.start();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
