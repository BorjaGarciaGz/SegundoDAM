package nivel1.ecoconargumentos;

public class Hijo {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("No ha sido posible cargar los argumentos.");
            return;
        }

        try {
            String frase = args[0];
            System.out.println("Recibo la frase: " + frase + " y la frese del reves es: ");
            String fraseInvertida = new  StringBuilder(frase).reverse().toString();
            System.out.println(fraseInvertida);

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
