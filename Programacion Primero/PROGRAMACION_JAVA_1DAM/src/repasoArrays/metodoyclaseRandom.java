package repasoArrays;

public class metodoyclaseRandom {


    /*Usando la clase Random
    Importar la clase:
    Importa java.util.Random.

    Crear una instancia de Random:
    Esto te permite generar números aleatorios.

    Recorrer el array con un bucle:
    Usa un bucle for para asignar un número aleatorio a cada posición del array.
    Por ejemplo, para generar números enteros entre 0 y 99, usa nextInt(100).*/



/*import java.util.Random;

    public class RandomArray {
        public static void main(String[] args) {
            int[] arr = new int[10];         // Declaración del array
            Random random = new Random();      // Instancia de Random

            // Rellenar el array con números aleatorios entre 0 y 99
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }

            // Imprimir el array
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
    /*Usando Math.random()
    Math.random():
    Este método devuelve un valor double entre 0.0 (inclusive) y 1.0 (exclusivo).

    Escalar el valor:
    Multiplica el resultado por el rango deseado y convierte a entero.
    Por ejemplo, para un número entre 0 y 99: (int)(Math.random() * 100).*/



   /* public class RandomArray {
        public static void main(String[] args) {
            int[] arr = new int[10];  // Declaración del array

            // Rellenar el array con números aleatorios entre 0 y 99
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random() * 100);
            }

            // Imprimir el array
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
   /* Consideraciones adicionales
    Rango de números:
    Ajusta el valor dentro de nextInt(bound) o la multiplicación en Math.random() según el rango que necesites.

    Tipos de datos:
    Estos ejemplos generan arrays de enteros, pero puedes adaptar el método para otros tipos de datos si es necesario.

    Este es el método "random" para rellenar un array en Java, permitiéndote generar y asignar valores aleatorios de forma sencilla.*/








}
