import java.util.List;
import java.util.Arrays;

/**
 * ## Listen rekursiv verarbeiten
 * <p>
 * Schreiben Sie nun bitte zwei __rekursive__ Methoden
 * `join()` und `sum()`.
 * <p>
 * `join()` soll eine Liste von Integer Werten mit einem Trennzeichnen
 * verknüpfen und eine Zeichenkette zurückgeben.
 * <p>
 * `sum()` soll eine Liste von Integer Werten aufaddieren und einen
 * `int` Wert zurückgeben.
 * <p>
 * Sie finden Aufrufbispiele für beide Methoden in der `main()`-Methode.
 * <p>
 * __Hinweis:__
 * <p>
 * - Sehen Sie sich noch einmal in Unit 05 an, wie sequenzbasierte
 * Rekursionen formuliert werden können.
 * <p>
 * __Verbote:__
 * <p>
 * - Sie sollen rekursiv programmieren, d.h. Schleifen aller Art sind
 * verboten.
 */
class Main {
    public static String join(List<Integer> x, String y) {
        String ret = "";
        if (x.isEmpty())
            return ret;
        if (x.size() == 1)
            return ret + x.get(0).toString();
        int i;
        ret += x.get(0).toString();
        ret += y;
        x = x.subList(1, x.size());
        return ret + join(x, y);
    }

    public static int sum(List<Integer> x) {
        int ret = 0;
        if (x.isEmpty())
            return ret;
        ret += x.get(0);
        x = x.subList(1, x.size());
        return ret + sum(x);
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3);
        String operation = join(values, "+");
        System.out.println(operation); // => 1+2+3

        int sum = sum(values);
        System.out.println(operation + "=" + sum); // => 1+2+3=6
    }
}