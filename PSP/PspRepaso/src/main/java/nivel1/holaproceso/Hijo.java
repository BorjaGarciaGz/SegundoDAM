package nivel1.holaproceso;

public class Hijo {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("No se han podido ingresar los argumentos.");
        }

        try {
            String nombre = args[0];
            System.out.println("Hola " + nombre + ", soy el proceso hijo." );
        }
        catch (Exception e) {
            System.out.println("Error al ingresar el proceso.");
        }
    }
}
