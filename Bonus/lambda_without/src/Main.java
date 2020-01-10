import java.util.List;
import java.util.Arrays;

/**
 *
 * ## Filtern von Listen von Zeichenketten mittels Lambdas
 *
 * Diese Aufgabe haben Sie bereits exakt oder in sehr ähnlicher Form
 * an anderen Stellen im Praktikum gelöst. Diesmal dürfen Sie 
 * allerdings nur Streams und Lambdafunktionen nutzen. 
 * Innerhalb von Lambdafunktionen sind jegliche Kontrollanweisungen 
 * wie Schleifen oder bedingte Anweisungen untersagt. 
 * Sie dürfen aber natürlich Teilprobleme in andere Lambdafunktionen, 
 * Operatoren oder Prädikate auslagern.
 *
 * Entwickeln Sie nun bitte eine Lambdafunktion `without` und machen Sie diese 
 * in `public static` Datenfeldern außerhalb der `main()`-Methode 
 * für die Auto-Evaluierung bekannt.
 *
 * `without` soll aus einer Liste von Zeichenketten eine neue Zeichenkette 
 * ohne eine vorgebene Zeichenkette generieren.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Nutzen Sie jeweils den konkretesten Lambda Typ 
 *   (also bspw. `Predicate<String>` anstatt `Function<String, Boolean>`).
 * - Achten Sie darauf, dass sie Streams limitieren (ansonsten haben Sie Endlosberechnungen).
 *
 * __Verbote:__
 *
 * - Es sind nur Lambda Funktionen erlaubt, keine Methoden (bis auf die `main()`).
 * - Es sind keine Schleifen oder bedingten Anweisungen erlaubt.

 */
public class Main {

    public static void main(String[] args) {
        List<String> examples = Arrays.asList(
                "Dies", "ist", "nur", "ein", "Beispiel"
        );
        List<String> result = without.apply(examples, "nur");
        System.out.println(result); // => ["Dies", "ist", "ein", "Beispiel"]
    }
}