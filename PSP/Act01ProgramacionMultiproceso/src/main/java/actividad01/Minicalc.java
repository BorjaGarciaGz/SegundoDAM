package actividad01;

public class Minicalc {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("No se puede ingresar el argumento");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            String operacion = args[2];
            double resultado;

            switch (operacion) {
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
                                    System.out.println("Error. No se puede dividir entre 0.");
                                    return;
                                }
                                resultado = num1 / num2;
                                break;
                                default:
                                    System.out.println("Operación inválida. Usar +. -, *, /.");
                                    return;
            }

            System.out.println(resultado);

        }catch (Exception e) {
            System.out.println("Error. debes ingresar valores númericos");
        }
    }
}
