package actividad1;

public class MiniCalc {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Argumentos no validos.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            String comando = args[2];
            double resultado;

            switch (comando) {
                case "+":
                    resultado = num1 + num2;
                    break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                        case "*":
                            resultado = num1 * num2;
                            break;
                            case "/":
                                if (num2 == 0) {
                                    System.out.println("No se puede dividir entre cero.");
                                    return;
                                }
                                resultado = num1 / num2;
                                break;
                                default:
                                    System.out.println("Argumentos no validos.");
                                    return;

            }
            System.out.println("Resultado: " + resultado);
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
