/**
 * ## Vorkommen von Zeichenketten zählen
 * <p>
 * Schreiben Sie nun eine Methode `countOccurences()` die zählt, wie häufig eine Zeichenkette *a* in einer
 * anderen Zeichenkette *b* vorkommt. Sich überlagernde Zeichenketten sind erlaubt.
 * D.h. "xx" ist als zweimal in "xxx" vorhanden zu zählen.
 * Leere Zeichenketten sind nicht zu zählen.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweise:__
 * <p>
 * - Beachten Sie, dass leere Zeichenketten schnell eine Endlosschleife erzeugen können.
 * - Liefert VPL eine Out-of-Memory Fehlermeldung ist dies vermutlich auf eine
 * Endlosschleife zurückzuführen.
 * - Die String-Methoden `indexOf()` oder `startsWith()` könnten hilfreich sein.
 */
class Main {

    public static int countOccurences(String a, String b) {
        int n = 0;
        int i = 0;

        if (b.length() < a.length() || a.length() == 0 || b.length() == 0)
            return n;

        while (i <= (b.length() - a.length())) {
            i = b.indexOf(a, i);
            if (i == -1)
                return n;
            i++;
            n++;
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(countOccurences("Hello", "Hello World")); // => 1
        System.out.println(countOccurences("abc", "abc abc abc")); // => 3
        System.out.println(countOccurences("xx", "xxx")); // => 2

        System.out.println(countOccurences("xxx", "xx"));
        System.out.println(countOccurences("xx", ""));
        System.out.println(countOccurences("", "xxx"));
    }
}