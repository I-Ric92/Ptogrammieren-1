/**
 * ## Zeichenketten rekursiv bereinigen
 * <p>
 * Schreiben Sie bitte eine __rekursive__ Methode `cleanString()`, die
 * mehrfache benachbarte Zeichenvorkommen in einem String
 * löscht.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Verbote:__
 * <p>
 * - Schleifen aller Art sind verboten.
 * - Lambdafunktionen sind verboten
 * - Datenfelder (globale Variablen) sind verboten.
 */
class Main {

    public static String cleanString(String x) {
        if (x.isEmpty())
            return x;
        String buf = x.substring(0, 1);
        String ret = "";
        if (x.length() > 1) {
            ret = cleanString(x.substring(1));
            if (buf.equals(x.substring(1, 2)))
                return ret;
            else
                ret = buf + ret;
        } else
            ret = buf;


        return ret;
    }

    public static void main(String[] args) {
        System.out.println(cleanString("yyzzza")); // => yza
        System.out.println(cleanString("aabbbcdd")); // => abcd
        System.out.println(cleanString("Hello")); // => Helo

        System.out.println(cleanString("Hello  Hallo"));
    }
}