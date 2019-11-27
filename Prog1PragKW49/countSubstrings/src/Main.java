/**
 * ## Vorkommen von Zeichenketten rekursiv zählen
 * <p>
 * Bitte entwickeln Sie nun eine __rekursive__ Methode
 * `countSubstring()`, die zählt wie oft ein String
 * Teilstring eines anderen Strings ist.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweis:__
 * <p>
 * - Sehen Sie sich noch einmal an wie man
 * sequenzbasierte Rekursionen formulieren kann (Unit 05).
 * <p>
 * __Verbote:__
 * <p>
 * - Sie sollen rekursiv programmieren, d.h. Schleifen aller Art
 * sind verboten.
 */
class Main {

    public static int countSubstring(String x, String y) {
        int ret = 0;
        if (x.length() < y.length() || y.length() == 0 || x.length() == 0)
            return ret;

        int i;
        i = x.indexOf(y);
        if (i != -1) {
            ret++;
            x = x.substring(i + 1);
        } else
            return ret;

        return ret + countSubstring(x, y);
    }

    public static void main(String[] args) {
        int n = countSubstring("Hello World", "Hello");
        System.out.println(n); // => 1
        System.out.println(countSubstring("Hello World", "l")); // => 3
        System.out.println(countSubstring("xxx", "xx")); // => 2
    }
}