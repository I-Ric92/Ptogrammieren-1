import java.util.ArrayList;
import java.util.List;

/**
 * ## Binärbäume rekursiv verarbeiten
 * <p>
 * Gegeben sei die Klasse `Node` mit der Binärbäume
 * gebildet werden können, die Zeichenketten als Werte
 * speichern können.
 * <p>
 * Entwickeln Sie nun bitte die folgenden Methoden:
 * <p>
 * - `serialize()`: Erzeugt eine Liste in dem der Baum inorder durchlaufen wird.
 * - `count()`: Liefert die Anzahl an Knoten in einem Baum.
 * - `depth()`: Liefert die maximale Tiefe eines Baums.
 * - `longest()`: Findet das längste (im Baum am tiefsten rechts stehende) Wort.
 * <p>
 * Sie finden Aufrufbeispiele in der `main()`-Methode.
 * <p>
 * __Hinweis__:
 * <p>
 * - Sehen Sie sich noch einmal die Inhalte zu
 * rekursiven Datenstrukturen der Unit 05 an.
 * <p>
 * __Verbote__:
 * <p>
 * - Sie sollen rekursiv programmieren, d.h. Schleifen aller
 * Art sind verboten.
 */
class Main {

    public static List<String> serialize(Node x) {

        List<String> ret = new ArrayList<String>();
        if (x == null) //ToDo
            return ret;
        if (x.left != null)
            ret.addAll(serialize(x.left));


        if (x.value != null)
            ret.add(x.value.toString());
        if (x.right != null)
            ret.addAll(serialize(x.right));
        return ret;
    }

    public static int count(Node x) {
        if (x == null) //ToDo
            return 0;
        int i = 1;
        if (x.left != null)
            i += count(x.left);
        if (x.right != null)
            i += count(x.right);
        return i;
    }

    public static String longest(Node x) {
        if (x == null) //ToDo
            return "";

        String ret = x.value;
        String buf = "";
        if (x.left != null) {
            buf = longest(x.left);
            if (buf.length() >= ret.length())
                ret = buf;
        }
        if (x.right != null) {
            buf = longest(x.right);
            if (buf.length() >= ret.length())
                ret = buf;
        }


        return ret;
    }

    public static int depth(Node x) {
        if (x == null) //ToDo
            return 0;
        int ret = 1;
        int bufl = 0;
        int bufr = 0;
        if (x.right != null)
            bufr = depth(x.right);
        if (x.left != null)
            bufl = depth(x.left);
        if (bufr >= bufl)
            ret += bufr;
        else
            ret += bufl;


        return ret;
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

        Node no = new Node(null);

        List<String> serialized = serialize(tree);
        System.out.println(serialized); // => [tasty, C, o, F, f, E, e]
        System.out.println(count(tree)); // => 7
        System.out.println(longest(tree)); // => tasty
        System.out.println(depth(tree)); // => 4

        List<String> serialized2 = serialize(no);
        System.out.println(serialized2);
        System.out.println(count(no));
        System.out.println(longest(no));
        System.out.println(depth(no));

        Node no2 = null;

        List<String> serialized3 = serialize(no2);
        System.out.println(serialized3);
        System.out.println(count(no2));
        System.out.println(longest(no2));
        System.out.println(depth(no2));
    }
}