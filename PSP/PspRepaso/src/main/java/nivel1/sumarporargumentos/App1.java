package nivel1.sumarporargumentos;

public class App1 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Error: argumentos incorrectos");
            return;
        }

        try {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[1]);
            int resultado = numero1 + numero2;

            System.out.println("La suma de ambos numeros da un Resultado de: " + resultado);

        }catch(NumberFormatException e) {
            System.out.println("Error: argumentos incorrectos. Deben ser númericcos.");
        }
    }
}
