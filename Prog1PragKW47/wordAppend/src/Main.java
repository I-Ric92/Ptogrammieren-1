import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ## Listen von Zeichenketten mittels `wordAppend()`verarbeiten
 * <p>
 * Entwickeln Sie nun bitte eine Methode `wordAppend()`.
 * Diese soll eine Liste von Strings durchlaufen, um einen Ausgabestring
 * zu erzeugen. Gehen Sie dabei wie folgt vor:
 * <p>
 * Immer wenn ein String zum 2., 4., 6., usw. mal in der Liste auftaucht,
 * soll der String an den Ausgabestring gehängt werden. Wenn kein String doppelt
 * vorkommt, soll die leere Zeichenkette zurückgegeben werden.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweis:__
 * <p>
 * - Denken Sie über den Einsatz einer geeigneten Datenstruktur
 * (`Collection`) nach.
 */
public class Main {

    public static String wordAppend(List<String> x) {
        //List<String> buf = new ArrayList<>();
        String ret = "";
        Map<String, Integer> mbuf = new HashMap<>();
        for (int i = 0; i < x.size(); i++) {
            if (!x.get(i).isEmpty()) {
                if (mbuf.containsKey(x.get(i)))
                    mbuf.put(x.get(i), mbuf.get(x.get(i)) + 1);
                else
                    mbuf.put(x.get(i), 1);
                if (mbuf.get(x.get(i)) == 2) {
                    mbuf.put(x.get(i), mbuf.get(x.get(i)) - 2);
                    ret = ret + x.get(i);
                }

            }
        }

        /*for (int i = 0; i < x.size(); i++) {
            int k = 1;
            for (int m = i + 1; m < x.size(); m++) {
                //if (x.get(i) == x.get(m))
                if (x.get(i).equals(x.get(m)))
                    k++;
            }
            k /= 2;
            if (buf.indexOf(x.get(i)) == -1) {
                for (int n = 0; n < k; n++) {
                    buf.add(x.get(i));
                }
            }
        }

        String ret = "";
        for (int i = 0; i < buf.size(); i++) {
            ret = ret + buf.get(i);
        }
        */
        return ret;
    }

    public static void main(String[] args) {
        List<String> example = Arrays.asList("a", "b", "a");
        String result = wordAppend(example);
        System.out.println(result); // -> "a"
        System.out.println(wordAppend(
                Arrays.asList("a", "b", "a", "c", "a", "d", "a")
        )); // -> "aa"
        System.out.println(wordAppend(Arrays.asList("a", "", "a", "b", "b"))); // -> "a"

        System.out.println(wordAppend(Arrays.asList("a", "a", "b", "b", "a", "a")));
        System.out.println(wordAppend(Arrays.asList("WW", "WW", "WWW", "W", "W", "WW")));
        System.out.println(wordAppend(Arrays.asList("silly", "funny", "extreme", "silly", "funny")));
    }

}