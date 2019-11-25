/**
 * ## Rekursives `allStar()`
 *
 * Entwickeln Sie nun bitte eine __rekursive__ Methode `allStar()`,
 * die in einer Zeichenkette jedes Zeichen durch ein '*' trennt.
 *
 * Aufrufbeispiele für `allStar()` finden Sie in der `main()`-Methode.
 *
 * Verallgemeinern Sie dann `allStar()` so, dass ein beliebiges Zeichen 
 * anstelle des `'*'` als Trennzeichen genutzt werden kann.
 *
 * __Hinweise:__
 *
 * - Berücksichtigen Sie die Hinweise wie sich sequenzbasierte
 *   Rekursionen formulieren lassen (Unit 05).
 * - Sehen Sie sich ggf. noch einmal überladene Methoden aus
 *   Unit 02 an.
 *
 * __Verbote:__
 *
 * - Die Lösung ist rekursiv zu lösen, d.h. Schleifen aller Art sind verboten.
 *
 */
public class Main {

    public static void main(String[] args) {
        String result = allStar("Hello");
        System.out.println(result); // => H*e*l*l*o
        System.out.println(allStar("abc")); // => a*b*c
        System.out.println(allStar("ab")); // => a*b
        System.out.println(allStar("ab", '-')); // => a-b
    }
}