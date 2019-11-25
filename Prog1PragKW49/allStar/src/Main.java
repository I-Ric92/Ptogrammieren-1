/**
 * ## Rekursives `allStar()`
 * <p>
 * Entwickeln Sie nun bitte eine __rekursive__ Methode `allStar()`,
 * die in einer Zeichenkette jedes Zeichen durch ein '*' trennt.
 * <p>
 * Aufrufbeispiele für `allStar()` finden Sie in der `main()`-Methode.
 * <p>
 * Verallgemeinern Sie dann `allStar()` so, dass ein beliebiges Zeichen
 * anstelle des `'*'` als Trennzeichen genutzt werden kann.
 * <p>
 * __Hinweise:__
 * <p>
 * - Berücksichtigen Sie die Hinweise wie sich sequenzbasierte
 * Rekursionen formulieren lassen (Unit 05).
 * - Sehen Sie sich ggf. noch einmal überladene Methoden aus
 * Unit 02 an.
 * <p>
 * __Verbote:__
 * <p>
 * - Die Lösung ist rekursiv zu lösen, d.h. Schleifen aller Art sind verboten.
 */
public class Main {

    public static String allStar(String x) {
        return allStar(x, '*');
    }

    public static String allStar(String x, char y) {
        if (x.isEmpty() || x.length() == 1)
            return x;
        String ret = "";
        ret += x.charAt(0);
        ret += y;
        x = x.substring(1);

        return ret + allStar(x, y);
    }


    public static void main(String[] args) {
        String result = allStar("Hello");
        System.out.println(result); // => H*e*l*l*o
        System.out.println(allStar("abc")); // => a*b*c
        System.out.println(allStar("ab")); // => a*b
        System.out.println(allStar("ab", '-')); // => a-b
    }
}