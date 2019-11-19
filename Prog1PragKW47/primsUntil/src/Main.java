import java.util.ArrayList;
import java.util.List;

/**
 * ## Primzahlen bestimmen
 * <p>
 * Eine Primzahl ist eine natürliche Zahl > 1, die nur durch sich
 * selbst und 1 teilbar ist. Sie sollen nun Primzahlen
 * generieren und tabellarisch auf der Konsole ausgeben.
 * <p>
 * Entwickeln Sie hierzu bitte die folgenden Methoden:
 * <p>
 * - `isPrim()` prüft, ob eine gegebene Zahl eine Primzahl ist.
 * - `primsUntil()` erzeugt eine Liste aller aufsteigen sortierten Primzahlen
 * bis zu einer oberen Schranke.
 * - `columnize()` erzeugt aus einer Liste eine Zeichenkette in dem jedes Element
 * mit einem Tabulator `\t` getrennt wird. Jeder n.te Tabulator wird jedoch
 * durch ein `\n` ersetzt (solche Zeichenketten erscheinen tabellarisch
 * auf der Konsole).
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweise:__
 * <p>
 * - https://de.wikipedia.org/wiki/Primzahl
 * - Kennen Sie noch die String Methode `trim()`?
 */
class Main {

    public static boolean isPrim(int x) {
        if (x < 2)
            return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> primsUntil(int x) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if (isPrim(i))
                ret.add(i);
        }
        return ret;
    }

    public static String columnize(List<Integer> x, int y) {
        if (x.isEmpty() || y <= 0)
            return "";
        String ret = "";
        for (int i = 0; i < x.size() - 1; i++) {
            if ((i + 1) % y == 0)
                ret += x.get(i) + "\n";
            else
                ret += x.get(i) + "\t";
        }
        ret += x.get(x.size() - 1);
        return ret;
    }

    public static void main(String[] args) {
        boolean prim = isPrim(7);
        System.out.println(prim); // => true

        List<Integer> prims = primsUntil(20);
        System.out.println(prims); // => [2, 3, 5, 7, 11, 13, 17, 19]

        String output = columnize(prims, 3);
        System.out.println(output);
        // 2   3   5
        // 7   11  13
        // 17  19

        // Entspricht der Zeichenkette: "2\t3\t5\n7\t11\t13\n17\t19"

        System.out.println(primsUntil(2));
        System.out.println(columnize(primsUntil(2), 2));

        System.out.println(primsUntil(19));
        System.out.println(columnize(primsUntil(19), 4));

        System.out.println(columnize(primsUntil(0), 4));
        System.out.println(columnize(primsUntil(19), 0));
    }
}