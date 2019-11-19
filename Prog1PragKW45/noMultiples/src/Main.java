/**
 * ## Tripple in Zeichenketten finden
 * <p>
 * Entwickeln Sie nun bitte eine Methode `noMultiples()`, die prüft, ob in
 * einer Zeichenkette niemals drei (oder mehr) gleiche Zeichen aufeinander
 * folgen.
 * <p>
 * Verallgemeinern Sie `noMultiples()` nun so,
 * dass die Anzahl der zu wiederholenden Zeichen parameterisiert ist.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweis:__
 * <p>
 * - Sehen Sie sich noch einmal überladene Methoden in Unit 2 (Methoden) an.
 */
class Main {

    public static boolean noMultiples(int n, String s) {
        if (s.length() == 0)
            return true;
        if (s.length() < n)
            return true;
        if (n < 2)
            return false;

        for (int i = 0; i <= s.length() - n; i++) {
            int k = 0;
            for (int m = 1; m < n; m++) {
                if (s.charAt(i) == s.charAt(i + m))
                    k++;
                if (k >= n - 1)
                    return false;
            }
        }
        return true;
    }

    public static boolean noMultiples(String s) {
/*
        if (s.length() < 3)
            return true;

        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2))
                return false;
        }
        return true;
 */
        return noMultiples(3, s);
    }

    public static void main(String[] args) {
        boolean result = noMultiples("Hello World");
        System.out.println(result); // => true
        System.out.println(noMultiples("faaantastic")); // => false
        System.out.println(noMultiples(2, "Hello World")); // => false

        System.out.println(noMultiples(3, "Hello World"));// => true
        System.out.println(noMultiples(3, "Hello    World"));
        System.out.println(noMultiples(1, ""));// => true
        System.out.println(noMultiples(0, ""));// => true
        System.out.println(noMultiples(1, "k"));// => false
    }
}