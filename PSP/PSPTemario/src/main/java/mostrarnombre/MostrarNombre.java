package mostrarnombre;

public class MostrarNombre {
    public static void main(String[] args) {
        if (args.length >= 3) {
            System.out.println("El nombre recibido es " + args[0] + args[1] + args[2]);
        }
    }
}
