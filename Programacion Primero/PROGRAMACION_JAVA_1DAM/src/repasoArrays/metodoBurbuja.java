package repasoArrays;

public class metodoBurbuja {

    public static void main(String[] args) {

        int array[] = {6, 8, 3, 5, 4, 9, 0, 2, 1, 7};

        System.out.print("Array sin ordenar: ");
        imprimirArray(array);

        ordenarBurbuja(array);

        System.out.print("\nArray ordenado: ");
        imprimirArray(array);
    }

    public static void ordenarBurbuja(int[] array) {
        //Ordenamiento
        for (int i = 0; i < array.length - 1; i++) {
            // // Comparación de pares de elementos adyacentes
            for (int j = 0; j < (array.length - 1 - i); j++) {
                //// Si el elemento actual es mayor que el siguiente, se intercambian
                if (array[j] > array[j + 1]) {
                    int auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                }
            }
        }
    }

    public static void imprimirArray(int[] arr) {
        for (int numero : arr) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }





}
