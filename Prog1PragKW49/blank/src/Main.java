/**
 * ## Geratene Zeichen rekursiv "blanken"
 * <p>
 * Entwickeln Sie nun bitte eine __rekursive__ Methode `blank()`.
 * <p>
 * `blank()` soll zwei Zeichenketten `a` und `b` nehmen und eine neue
 * Zeichenkette wie folgt generieren. Alle Zeichen die in `a` aber nicht in
 * `b` sind, sollen in der generierten Zeichenkette durch ein `'_'` ersetzt
 * werden. Leerzeichen bleiben ebenfalls in der generierten Zeichenkette
 * erhalten, auch wenn sie nicht in `b` vorkommen.
 * <p>
 * Der Vergleich soll case-insensitiv erfolgen, also `'a'` ist wie `'A'`
 * zu werten. Die Rückgabe soll in Uppercase erfolgen.
 * <p>
 * __Hinweise:__
 * <p>
 * - Aufruf-Beispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Verbote:__
 * <p>
 * - Es sind keine Schleifen erlaubt.
 * - Es dürfen keine regulären Ausdrücke genutzt werden.
 * - Die folgenden `String`-Methoden sind daher untersagt:
 * `split()`, `matches()`, `replaceAll()`, `replaceFirst()`
 */
class Main {

    public static String blank(String x, String y) {
        x = x.toUpperCase();
        y = y.toUpperCase();
        String ret = "";
        String buf = "";
        if (x.length() == 0)
            return x;

        buf = Character.toString(x.charAt(0));
        buf.toUpperCase();
        x = x.substring(1);
        if (y.contains(buf))
            ret += buf;
        else {
            if (buf.contains(" "))
                ret = " ";
            else
                ret += "_";
        }
        ret += blank(x, y);
        return ret.toUpperCase();
    }

    public static void main(String[] args) {
        String result = blank("Hello World", "ell");
        System.out.println(result); // => _ELL_ ___L_
        System.out.println(blank("abc def ghj", "a")); // => A__ ___ ___

        System.out.println(blank("abc def ghj", ""));
        System.out.println(blank("", "a"));
        System.out.println(blank("abc def ghj", "aD"));

    }
}
