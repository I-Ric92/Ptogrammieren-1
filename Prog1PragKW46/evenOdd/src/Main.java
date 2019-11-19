import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * ## Listen nach geraden und ungeraden Zahlen ordnen
 * <p>
 * Entwickeln Sie nun bitte eine Methode namens `evenOdd()`,
 * die eine Liste auf Basis einer bestehenden Liste von Integern erzeugt.
 * <p>
 * - In der neuen Liste müssen erst alle geraden Werte der ursprünglichen Liste
 * stehen, erst dann sollen die ungeraden Werte folgen.
 * - Die Reihenfolge der ursprünglichen Liste soll innerhalb der geraden und ungeraden
 * Werte aber erhalten bleiben.
 * <p>
 * Aufrufbeispiele finden sich in der `main()`-Methode.
 */
class Main {

    public static List<Integer> evenOdd(List<Integer> x) {
        if (x.isEmpty())
            return x;
        else {
            List<Integer> ret = new ArrayList<>();
            List<Integer> ger = new ArrayList<>();
            List<Integer> ung = new ArrayList<>();

            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) % 2 == 0)
                    ger.add(x.get(i));
                else
                    ung.add(x.get(i));
            }
            ret.addAll(ger);
            ret.addAll(ung);
            return ret;
        }
    }

    public static void main(String[] args) {
        List<Integer> result = evenOdd(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(result); // => [2, 4, 6, 1, 3, 5]
        System.out.println(evenOdd(Arrays.asList(5, 1, 3))); // => [5, 1, 3]
        System.out.println(evenOdd(Arrays.asList(4, 2, 6))); // => [4, 2, 6]
    }
}