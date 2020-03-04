import java.lang.reflect.Array;

import static java.lang.Character.toLowerCase;

public class Main {

    //2.1 Hello World
    public static String hello(String name) {
        return "Hallo " + name.trim() + "!";
    }

    //2.2 Zeichenketten klammern
    public static String embedCenter(String embad, String payload) {
        return embad.substring(0, (embad.length() / 2)) + payload + (embad.substring(embad.length() / 2));
    }

    //2.3 Zeichen zählen
    public static int countChars(char c, String s) {
        String buf = s.toLowerCase();
        String d = Character.toString(c).toLowerCase();
        int ret = 0;
        int i = 1;
        while (buf.contains(d)) {
            buf = buf.replaceFirst(d, "");
            ret++;
        }
        return ret;
    }

    //2.4 Zeichenketten formatieren
    public static String endUp(String s) {
        if (s.length() <= 3)
            return s.toUpperCase();
        String ret = s.substring(0, s.length() - 3);
        String end = s.substring(s.length() - 3).toUpperCase();
        return ret + end;
    }

    //2.5 Verflixtes Zeichenketten formatieren
    public static String stringX(String s) {
        if (s.length() < 3)
            return s;
        String anf = s.substring(0, 1);
        String mit = s.substring(1, s.length() - 1);
        String end = s.substring(s.length() - 1);
        mit = mit.replace("x", "");
        return anf + mit + end;
    }

    //2.6 Zeichen in Zeichenketten zählen
    public static boolean stringE(String s) {
        if(countChars('E', s) > 0 && countChars('E', s) < 4)
            return true;
        return false;
    }



    public static void main(String[] args) {

        //2.1 Hello World
        String greet = hello("Max");
        System.out.println(greet); // => "Hello Max!"
        System.out.println(hello("Moritz")); // => "Hello Moritz!"
        // Achten sie auf die Leerzeichen
        System.out.println(hello("Maren ")); // => "Hello Maren!"
        System.out.println(hello(" Tessa")); // => "Hello Tessa!"
        System.out.println(hello("")); // => "Hello!"

        //2.2 Zeichenketten klammern
        System.out.println(embedCenter("<<>>", "Yay")); // => <<Yay>>
        System.out.println(embedCenter("()", "Yay")); // => (Yay)
        System.out.println(embedCenter(":-)", "Example")); // :Example-)

        //2.3 Zeichen zählen
        int n = countChars('a', "Abc");
        System.out.println(n); // => 1
        System.out.println(countChars('A', "abc")); // => 1
        System.out.println(countChars('x', "ABC")); // => 0
        System.out.println(countChars('!', "!!!")); // => 3

        //2.4 Zeichenketten formatieren
        String result = endUp("Hello");
        System.out.println(result); // => "HeLLO"
        System.out.println(endUp("Hi there")); // => "Hi thERE"
        System.out.println(endUp("hi")); // => "HI"

        //2.5 Verflixtes Zeichenketten formatieren
        String result5 = stringX("xxHix");
        System.out.println(result5); // => xHix
        System.out.println(stringX("abxxxcd")); // => abcd
        System.out.println(stringX("xabxxxcdx")); // => xabcdx

        //2.6 Zeichen in Zeichenketten zählen
        boolean result6 = stringE("Earth");
        System.out.println(result6); // => true
        System.out.println(stringE("Nonsense")); // => true
        System.out.println(stringE("This is nuts")); // => false
        System.out.println(stringE("This example contains nonsense")); // => false


    }

}
