import java.util.function.BinaryOperator;

/**
 * ## Bestimmen einer Stelle einer Zahl mittels Lambdas
 * <p>
 * Diese Aufgabe haben Sie bereits exakt oder in sehr ähnlicher Form
 * an anderen Stellen im Praktikum gelöst. Diesmal dürfen Sie
 * allerdings nur Streams und Lambdafunktionen nutzen.
 * Innerhalb von Lambdafunktionen sind jegliche Kontrollanweisungen
 * wie Schleifen oder bedingte Anweisungen untersagt.
 * Sie dürfen aber natuerlich Teilprobleme in andere Lambdafunktionen,
 * Operatoren oder Prädikate auslagern.
 * <p>
 * Entwickeln Sie nun bitte eine Lambdafunktion `nthDigit` und machen Sie diese
 * in `public static` Datenfeldern außerhalb der `main()`-Methode
 * für die Auto-Evaluierung bekannt.
 * <p>
 * `nthDigit` soll aus einer ganzen Zahl (Dezimalnotation) den Wert der
 * n.ten Stelle zurückgeben.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweise:__
 * <p>
 * - Nutzen Sie jeweils den konkretesten Lambda Typ
 * (also bspw. `Predicate<String>` anstatt `Function<String, Boolean>`).
 * <p>
 * __Verbote:__
 * <p>
 * - Es sind nur Lambda Funktionen erlaubt, keine Methoden (bis auf die `main()`).
 * - Es sind keine Schleifen oder bedingten Anweisungen erlaubt.
 */
class Main {

    public static BinaryOperator<Integer> nthDigit = (i, y) ->
            (y >= 0 && y < ((Integer) (Math.abs(i))).toString().length())
                    ? Integer.parseInt(String.valueOf(((Integer) (Math.abs(i))).toString().charAt(y)))
                    : null;

    public static void main(String[] args) {
        int result = nthDigit.apply(4321, 1);
        System.out.println(result); // => 3
        System.out.println(nthDigit.apply(-654321, -5)); // => null
    }

}