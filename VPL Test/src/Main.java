import java.util.List;

/**
 * ## Palindrome in Zeichenketten bestimmen
 *
 * Palindrome sind Zeichenketten, die von vorne und hinten
 * gelesen, dasselbe Wort ergeben (z.B. "stets"). Die Groß-/
 * Kleinschreibung soll dabei ignoriert werden.
 *
 * Ein Wort ist eine zusammenhängende Zeichenkette, welches
 * durch ein oder mehrere Leerzeichen von anderen Worten in
 * einer Zeichenkette getrennt ist.
 *
 * Entwickeln Sie nun bitte eine Methode `palindromes()`,
 * um in einem String alle Palindromwörter zu bestimmen
 * und diese Palindrome als Liste von Zeichenketten zurückzugeben.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Main {

    public static List palindromes(String x) {
        String[] spi = x.split(" ");
        List ret = new List();

        for (int i = 0; i <= spi.length; i++) {
            int b = 0;
            for (int j = 0; j <= (spi[i].length() / 2); j++) {
                if (spi[j].equals(spi[spi.length - j]))
                    b = 1;
            }
            if (b == 1)
                ret.add(spi[i]);

        }

        return ret;
    }

    public static void main(String[] args) {
        List<String> palindromes = palindromes("Es ist stets dasselbe Beispiel");
        System.out.println(palindromes); // => ["stets"]
        System.out.println(palindromes("Regallager")); // => ["Regallager"]
        System.out.println(palindromes("no palinedromes")); // => []
        System.out.println(palindromes("Natan ist stets weise")); // => ["Natan", "stets"]
    }
}
