/**
 *
 * ## Binärbäume rekursiv prettyprinten
 *
 * Gegeben sei die Klasse `Node` mit der Binärbäume
 * gebildet werden können, die Zeichenketten als Werte 
 * speichern können.
 *
 * Entwickeln Sie nun bitte eine __rekursive__ Methode `prettyPrint()`, die
 * eine Zeichenkettenrepräsentation für solche Binärbäume generiert, 
 * die auf der Konsole ausgegeben gut als Baumstruktur interpretierbar
 * sind.
 *
 * Sie finden Aufrufbeispiele in der `main()`-Methode.
 *
 * `prettyPrint()` soll
 *
 * - jeden Knoten des Baums mit einem vorangestellten `"- "` kennzeichen, 
 * - jede Ebene des Baums um zwei Leerzeichen `"  "` einrücken und
 * - für den `null` Baum, die leere Zeichenkette `""` zurückgeben.
 *
 * __Hinweis:__
 *
 * - Die Datenstruktur `Node` findet sich in der Datei `Node.java`.
 * - Es bietet sich ggf. an das Einrückungsproblem mit einer 
 *   überladenen Methode anzugehen, der eine Einrückungstiefe
 *   als zusätzlicher Parameter übergeben wird.
 *
 * __Verbote:__
 *
 * - Das Problem ist rein rekursiv zu lösen. Schleifen sind nicht gestattet.
 *
 */
class Main {

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

        String output = prettyPrint(tree);
        System.out.println(output); // =>
        //- f
        //  - o
        //    - C
        //      - tasty
        //    - F
        //  - E
        //    - e 

        System.out.println(prettyPrint(new Node("A"))); // => "- A"
        System.out.println(prettyPrint(null)); // => ""
    }
}