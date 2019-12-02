import java.util.List;

/**
 * ## Binärbäume rekursiv verarbeiten
 *
 * Gegeben sei die Klasse `Node` mit der Binärbäume
 * gebildet werden können, die Zeichenketten als Werte 
 * speichern können.
 *
 * Entwickeln Sie nun bitte die folgenden Methoden:
 *
 * - `serialize()`: Erzeugt eine Liste in dem der Baum inorder durchlaufen wird.
 * - `count()`: Liefert die Anzahl an Knoten in einem Baum.
 * - `depth()`: Liefert die maximale Tiefe eines Baums.
 * - `longest()`: Findet das längste (im Baum am tiefsten rechts stehende) Wort.
 *
 * Sie finden Aufrufbeispiele in der `main()`-Methode.
 *
 * __Hinweis__:
 *
 * - Sehen Sie sich noch einmal die Inhalte zu
 *   rekursiven Datenstrukturen der Unit 05 an.
 *
 * __Verbote__:
 *
 * - Sie sollen rekursiv programmieren, d.h. Schleifen aller
 *   Art sind verboten.
 *
 */
class Main {

    public static String serialize(Node x){// ToDo


        return "";
    }

    public static int count(Node x){//ToDo


        return 0;
    }

    public static String longest(Node x){//ToDo


        return "";
    }

    public static int depth(Node x){//ToDo


        return  0;
    }

    public static void main(String[] args) {
        Node tree = new Node("f",
                new Node("o",
                        new Node("C",
                                new Node("tasty"),
                                null),
                        new Node("F")
                ),
                new Node("E",
                        null,
                        new Node("e")
                )
        );
        // Hinweis, der Evaluator wird diesen Baum in folgender
        // Notation ausgeben (Pattern: %value[%left,%right])
        // <f[o[C[tasty,null],F],E[null,e]]>

        List<String> serialized = serialize(tree);
        System.out.println(serialized); // => [tasty, C, o, F, f, E, e]
        System.out.println(count(tree)); // => 7
        System.out.println(longest(tree)); // => tasty
        System.out.println(depth(tree)); // => 4
    }
}