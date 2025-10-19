package actividad5;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n > 0) numeros.add(n);
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("No se recibieron números válidos.");
            return;
        }

        int mayor1 = Integer.MIN_VALUE;
        int mayor2 = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double suma = 0;

        for (int n : numeros) {
            if (n > mayor1) {
                mayor2 = mayor1;
                mayor1 = n;
            } else if (n > mayor2) {
                mayor2 = n;
            }
            if (n < menor) menor = n;
            suma += n;
        }

        double media = suma / numeros.size();

        System.out.println("Los dos numeros mayores son: " + mayor1 + " y " + mayor2);
        System.out.println("El numero menor: " + menor);
        System.out.printf("Media: " + media);

    }
}

