/**
 * ## Zeichenketten verarbeiten mit `everyNth()`
 *
 * Entwickeln Sie nun bitte eine Methode `everyNth()`, die für eine Zeichenkette $s$
 * nur jedes n.te Zeichen zurück liefert. 
 * Bei $n = 3$ sollen also nur die Zeichen 0, 3, 6, ... und so weiter zurückgegeben werden.
 * Fuer $n <= 0$ soll die leere Zeichenkette zurückgegeben werden.
 *
 * Aufrufbeispiele finden Sie in der `main()-Methode`.
 *
 * __Hinweis:__
 *
 * - Achtung: Diese Aufgabe ist anfällig für Endlosschleifen.
 * - Erhalten Sie in VPL eine Out-of-Memory Fehlermeldung, 
 *   haben Sie vermutlich eine Endlosschleife gebaut.
 *
 */
class Main {

    public static String everyNth(String s, int n) {
        String ret = "";

        if (n <= 0)
            return ret;

        for (int i = 0; i < s.length(); i++)
            if(i % n == 0)
                ret += s.charAt(i);

        return ret;
    }

    public static void main(String[] args) {
        String result = everyNth("Miracle", 2);
        System.out.println(result); // => "Mrce"
        System.out.println(everyNth("abcdefg", 2)); // => "aceg"
        System.out.println(everyNth("abcdefg", 3)); // => "adg"

        System.out.println(everyNth("abcdefg", -2));
        System.out.println(everyNth("abcdefg", 0));
    }
}