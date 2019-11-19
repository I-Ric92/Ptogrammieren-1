/**
 * ## Zeichenketten formatieren mit `endUp()`
 *
 * Schreiben Sie eine Methode `endUp()`, die die letzten
 * drei Zeichen einer Zeichenkette groß schreibt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()` 
 * - `toUpperCase()`
 * - `length()`
 * - Der Einsatz der Kontrollanweisung `if` kann hilfreich sein.
 *
 */
class Main {

    public static String endUp(String s) {
        int lang = s.length();
        if (lang < 3)
            return s.toUpperCase();
        String anf = s.substring(0, (lang - 3));
        String end = s.substring(lang - 3);
        return anf + end.toUpperCase();
    }

    public static void main(String[] args) {
        String result = endUp("Hello");
        System.out.println(result); // => "HeLLO"
        System.out.println(endUp("Hi there")); // => "Hi thERE"
        System.out.println(endUp("hi")); // => "HI"
    }
}