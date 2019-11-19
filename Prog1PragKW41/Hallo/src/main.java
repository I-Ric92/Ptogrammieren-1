/**
 * ## Hello World
 *
 * Entwickeln Sie bitte eine Methode `hello()`, die eine
 * Begrüßung generiert. `hello()` soll ein Begrüßungstext nach 
 * folgendem Muster erzeugen: `"Hello <name>!"`
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem 
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `trim()`
 *
 */
class main {

    public static String hello(String name) {
        return ("Hallo "+ name.trim()).trim() + "!";  // .trim nimt Leehrzeichen weg
    }

    public static void main(String[] args) {
        String greet = hello("Max");
        System.out.println(greet); // => "Hello Max!"
        System.out.println(hello("Moritz")); // => "Hello Moritz!"

        // Achten sie auf die Leerzeichen
        System.out.println(hello("Maren ")); // => "Hello Maren!"
        System.out.println(hello(" Tessa")); // => "Hello Tessa!"

        System.out.println(hello("")); // => "Hello!"
    }
}