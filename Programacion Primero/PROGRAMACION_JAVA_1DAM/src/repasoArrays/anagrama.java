package repasoArrays;

import java.util.Scanner;

public class anagrama {
    /*
    Verificar si dos palabras son anagramas
    Escribe un método que reciba dos palabras y determine si son anagramas, es decir, si contienen
    las mismas letras en diferente orden.
    Ejemplo de entrada:
    Palabra 1: "roma"
    Palabra 2: "amor"
    Salida esperada:
    true
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] palabras = new String [2];

        System.out.println("Ingrese las palabras del array.");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce la palabra" +(i+1) +"ª: ");
            palabras[i] = sc.nextLine();
        }

        System.out.println(anagrama(palabras));

    }
    public static boolean anagrama (String [] palabras) {

        boolean resultado = false;
        String palabra1 = palabras[0];
        String palabra2 = palabras[1];
        if (palabra1.length() == palabra2.length()) {
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i) != palabra2.charAt(i)) {
                    return false;
                }else {
                    resultado = false;
                }
            }
        }
        return resultado;
    }
}
