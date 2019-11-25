/**
 * ## Vorkommen von Zeichenketten rekursiv zählen
 *
 * Bitte entwickeln Sie nun eine __rekursive__ Methode
 * `countSubstring()`, die zählt wie oft ein String
 * Teilstring eines anderen Strings ist.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Sehen Sie sich noch einmal an wie man 
 *   sequenzbasierte Rekursionen formulieren kann (Unit 05).
 *
 * __Verbote:__
 *
 * - Sie sollen rekursiv programmieren, d.h. Schleifen aller Art
 *   sind verboten.
 *
 */
class Main {

    public static int countSubstring(String x, String y){
        int ret = 0;

        return ret;
    }

    public static void main(String[] args) {
        int n = countSubstring("Hello World", "Hello");
        System.out.println(n); // => 1
        System.out.println(countSubstring("Hello World", "l")); // => 3
        System.out.println(countSubstring("xxx", "xx")); // => 2
    }
}