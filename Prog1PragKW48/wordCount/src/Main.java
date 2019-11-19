import java.util.Map;
import java.util.TreeMap;

/**
 * ## Worthäufigkeit in Zeichenketten bestimmen
 * <p>
 * Entwickeln Sie nun eine Methode `wordCount()`, die die absolute
 * Häufigkeit von Worten in einem Text mittels eines Mappings zählt.
 * Worte sind durch ein oder mehrere Whitespace Zeichen
 * (Leerzeichen, Tabulatoren, Linebreaks, etc.) voneinander getrennt.
 * Worte sollen case-insensitiv gezählt werden.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweis:__
 * <p>
 * - In regulären Ausdrücken können Sie alle Whitespace Zeichen
 * mit `"\\s"` selektieren.
 */
class Main {

    public static Map<String, Integer> wordCount(String x) {
        x = x.toLowerCase();
        Map<String, Integer> ret = new TreeMap<>();
        String[] split = x.split("\\s");    //siehe _Hinweis_

        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                if (ret.containsKey(split[i]))
                    ret.put(split[i], ret.get(split[i]) + 1);
                else
                    ret.put(split[i], 1);
            }

        }

        return ret;
    }

    public static void main(String[] args) {
        Map<String, Integer> result = wordCount("aa BB cC Aa Cc Bb aA AA");
        System.out.println(result); // => { "aa": 4, "bb": 2, "cc": 2 }
        System.out.println(wordCount("Ein kleines Beispiel"));
        // => { "ein": 1, "kleines": 1, "beispiel": 1 } 
    }
}