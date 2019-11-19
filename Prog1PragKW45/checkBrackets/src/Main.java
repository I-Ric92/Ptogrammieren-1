/**
 * ## checkBrackets()
 * <p>
 * Eine vollständige Klammerung bedeutet: Jeder geöffneten Klammer
 * muss eine schließende Klammer folgen. Darüber hinaus müssen
 * die runden Klammern korrekt verschachtelt sein. Andere Zeichen
 * sind zu ignorieren.
 * <p>
 * Schreiben Sie nun eine Methode `checkBrackets()`, die prüft, ob eine
 * Zeichenkette den oben angegebenenen Regeln einer vollständigen
 * Klammerung entspricht oder nicht.
 */
public class Main {

    public static boolean checkBrackets(String x) {
        int n = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(')
                n++;
            else if (x.charAt(i) == ')')
                n--;
            if (n < 0)
                return false;

        }
        if (n == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {

        boolean check = checkBrackets("()");
        System.out.println(check); // => true
        System.out.println(checkBrackets("(()(a)(()((c))))")); // => true

        System.out.println(checkBrackets("(()")); // => false
        System.out.println(checkBrackets("a (()())a)")); // => false
    }
}