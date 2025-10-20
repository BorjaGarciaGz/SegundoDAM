package actividad4;

public class App1 {
    static void main() {

    }

    private static int calculoAleatorios(int min, int max) {
        return (int)  (Math.floor(Math.random() * ((max - min) + 1)));
    }
}
