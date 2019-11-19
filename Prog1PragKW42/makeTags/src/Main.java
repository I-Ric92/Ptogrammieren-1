/**
 * ## HTML (und andere) Tags erzeugen
 *
 * Entwickeln Sie nun bitte eine Methode `makeTags()`, die HTML-artige Zeichenketten
 * wie `"<em>Yay</em>"` aus zwei Zeichenketten erzeugen kann.
 *
 * - Eine Zeichenkette beschreibt ein Tag und eine Zeichenkette den Inhalt,
 *   der durch dieses Tag gekennzeichnet werden soll.
 * - Tags werden grundsätzlich klein geschrieben.
 * - Wird kein Tag angeben (leere Zeichenkette "" oder null) soll nur der
 *   Inhalt zurückgegeben werden.
 * - Der Inhalt in Tags hat nie führende oder abschließende Leerzeichen.
 * - Tags wie Inhalte sollen in der Ausgabe keine führenden oder abschließenden Whitespaces
 *   haben.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die String Methoden `trim()`, `isEmpty()` und `toLowerCase()` sind vermutlich hilfreich.
 * - Dadurch letztlich viel einfacher als es aussieht.
 *
 */
class Main {

    public static String makeTags(String tag, String content) {
        int langtag = tag.length();
        int langcontent = content.length();
        tag = tag.trim();
        tag = tag.toLowerCase();
        if (tag.isEmpty())
            return content.trim();
        String front = "<" + tag + ">";
        String back = "</" + tag + ">";
        return front + content.trim() + back;
    }

    public static void main(String[] args) {
        String result = makeTags("em", " Yay ");
        System.out.println(result); // => "<em>Yay</em>"

        System.out.println(
                makeTags("CITE ", "Programmieren lernt man nur durch programmieren.")
        );
        // => "<cite>Programmieren lernt man nur durch programmieren.</cite>"

        System.out.println(makeTags("", "No tags")); // => No tags

    }
}