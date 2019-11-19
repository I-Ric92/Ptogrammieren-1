/**
 * ## Ein Passwort-Generator
 * <p>
 * Schreiben Sie nun bitte eine Methode `pwdgen()` zum Generieren von
 * Passwörtern.
 * <p>
 * - Passwörter sollen dabei aus einem Satz gebildet werden.
 * - Worte in dem Satz sind durch ein oder mehrere  Leerzeichen voneinander
 * getrennt.
 * - Für jedes Wort soll abwechselnd der erste oder letzte Buchstabe des
 * Wortes genommen werden.
 * - Die Anzahl an Worten soll an den Anfang des Passworts gesetzt werden.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweise:__
 * <p>
 * - Die String-Methode `split()` ist sicher hilfreich.
 * - Beachten Sie, dass Sätze mit Leerzeichen beginnen oder enden können.
 * <p>
 * __Achtung:__ Ab sofort werden keine Methodenköpfe mehr vorgegeben.
 * Diese aus der Problemformulierung zu bestimmen, ist Teil der Aufgabe.
 */
class Main {

    public static String pwdgen(String s) {
        s = s.trim();
        if (s.equals(""))
            return "0";
        int n = 0;
        int leer = 0;
        String[] buf = s.split(" +");

        String ret = "" + buf.length;

        for (int i = 0; i < buf.length; i++) {
            if (n % 2 == 0) {
                ret += buf[n].substring(0, 1);
                n++;
            } else {
                ret += buf[n].substring(buf[n].length() - 1);
                n++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String pwd = pwdgen("Dies ist nur ein doofes Beispiel");
        System.out.println(pwd); // => "6Dtnndl"
        System.out.println(pwdgen("a b c")); // => 3abc

        System.out.println(pwdgen("   Dies ist nur   ein doofes Beispiel   "));
        System.out.println(pwdgen("      "));
    }
}