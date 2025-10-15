package actividad02;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Aplicacion2 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("No se puede ingresar el argumento");
        }

        String entrada = args[0].trim();
        if (entrada.isEmpty()) {
            System.out.println("");
            return;
        }
        List<String> palabras = Arrays.stream(entrada.split("\\s+"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        Collator es = Collator.getInstance(new Locale("es"));
        es.setStrength(Collator.PRIMARY);
        palabras.sort(Collections.reverseOrder(es));

        System.out.println(String.join(" ", palabras));
    }

}
