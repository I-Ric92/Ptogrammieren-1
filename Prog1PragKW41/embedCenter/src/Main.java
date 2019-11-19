/**
 * ## Zeichenketten klammern
 *
 * Schreiben Sie eine Methode `embedCenter()`, die eine payload Zeichenkette in die 
 * Mitte einer anderen Klammer-Zeichenkette setzt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Beachten Sie Sonderfälle wie leere Klammer und Payload Zeichenketten.
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 *
 */
class Main {

    public static String embedCenter(String embed, String payload) {
        int lenght = embed.length();
        int halb = lenght/2;
        String anf = embed.substring(0, halb);
        String end = embed.substring(halb);
        String neu = anf + payload + end;
        return neu;
    }

    public static void main(String[] args) {
        System.out.println(embedCenter("<<>>", "Yay")); // => <<Yay>>
        System.out.println(embedCenter("()", "Yay")); // => (Yay)
        System.out.println(embedCenter(":-)", "Example")); // :Example-)
    }
}