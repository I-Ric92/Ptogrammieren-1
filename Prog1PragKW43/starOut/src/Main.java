/**
 * ## Sternchen in Zeichenketten tilgen
 * <p>
 * Schreiben Sie nun eine Methode `starOut()`, die in einer Zeichenkette
 * jeweils das Zeichen links und rechts eines '*' löscht.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweis:__
 * <p>
 * - Auch wenn Kontrollanweisungen wie `continue` und `break` meist nicht schön sind,
 * ist diese Aufgabe ein Beispiel wie zumindest `continue` den Code sogar einfacher lesbar
 * machen kann.
 */
class Main {

    public static String starOut(String s) {
        String ret = "";

        if (s.length() == 0)
            return s;

        if (s.length() == 1)
            if (s.charAt(0) == '*')
                return ret;
            else
                return s;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0)
                if (s.charAt(i) != '*' && s.charAt(i + 1) != '*')
                    ret += s.charAt(i);
            if (i == s.length() - 1)
                if (s.charAt(i) != '*' && s.charAt(i - 1) != '*')
                    ret += s.charAt(i);
            if (i != 0 && i != s.length() - 1)
                if (s.charAt(i) != '*' && s.charAt(i + 1) != '*' && s.charAt(i - 1) != '*')
                    ret += s.charAt(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        String result = starOut("ab*cd");
        System.out.println(result); // => "ad"
        System.out.println(starOut("ab**cd")); // => "ad"
        System.out.println(starOut("sm*eilly")); // => "silly"

        System.out.println(starOut(" "));
        System.out.println(starOut("*"));
    }
}