import jdk.dynalink.Operation;

import java.util.function.Predicate;

/**
 * ## Vollkommene Zahlen mittels Lambdas bestimmen
 *
 * Eine natürliche Zahl $n$ wird vollkommene Zahl (auch perfekte Zahl) genannt,
 * wenn sie gleich der Summe aller ihrer (positiven) Teiler außer sich selbst ist.
 *
 * Die kleinsten drei vollkommenen Zahlen sind:
 *
 * - $6   = 1 + 2 + 3 = 6$
 * - $28  = 1 + 2 + 4 + 7 = 28$
 * - $496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496$
 *
 * Entwickeln Sie nun bitte mehrere Lambda-Funktionen, um perfekte Zahlen bis zu einer
 * oberen Schranke zu bestimmen und machen Sie diese
 * in `public static` Datenfeldern außerhalb der `main()`-Methode
 * für die Auto-Evaluierung bekannt.
 *
 * Zerlegen Sie das Problem so in folgende Lambdafunktionen (Teilprobleme).
 *
 * - Entwickeln Sie ein Prädikat `perfect`, dass bestimmt, ob eine Zahl eine vollkommene Zahl ist.
 * - Entwickeln Sie eine Lambdafunktion `perfectNumbers`, die `perfect` nutzt, um eine Liste aller
 *   aufsteigend sortierten vollkommenen Zahlen bis zu einer gegebenen Schranke zu bestimmen.
 *
 * Entsprechende Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - https://de.wikipedia.org/wiki/Vollkommene_Zahl
 * - Vergleichen Sie den Wert von `Integer` (nicht `int`) in Streams mittels `equals()` oder
 *   casten Sie mittels `(int)` auf den primitiven Datentyp `int`, der mittels `==` verglichen werden kann.
 * - Sie können auch `IntStream` nutzen, um einen Stream primitiver Datentypen zu erzeugen und
 *   diese Vergleichsprobleme zu vermeiden.
 * - Nutzen Sie jeweils den konkretesten Lambda Typ
 *   (also bspw. `Predicate<String>` anstatt `Function<String, Boolean>`).
 * - Achten Sie darauf, dass Sie Streams limitieren (ansonsten haben Sie Endlosberechnungen).
 *
 * __Verbote:__
 *
 * - Es sind nur Lambda Funktionen erlaubt, keine Methoden (bis auf die `main()`).
 * - Es sind keine Schleifen oder bedingten Anweisungen erlaubt.
 *
 */
class Main {

    public static Predicate<Integer> perfect = i ->


    public static void main(String[] args) {

        System.out.println(perfect.test(4)); // => false
        System.out.println(perfect.test(496)); // => true

        int[] perfects = perfectNumbers.apply(10000);
        System.out.println(Arrays.toString(perfects)); // => [6, 28, 496]
    }
}
