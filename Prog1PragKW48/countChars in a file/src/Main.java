import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * ## Zeichenhäufigkeiten in Textdateien bestimmen
 * <p>
 * Sie sollen nun zwei Methoden entwickeln.
 * <p>
 * - `readFrom()` soll eine Text-Datei als Zeichenkette einlesen.
 * Im Fehlerfall ist die `null`-Referenz zurückzugeben.
 * - `countChars()` soll in einer Zeichenkette gegebene Zeichen
 * case-insensitiv zählen (d.h. 'a' ist wie 'A' und umgekehrt zu zählen).
 * Werden keine Zeichen angegeben, sollen standardmäßig
 * die Zeichen von `'a'` bis `'z'` gezählt werden.
 * <p>
 * Aufrufbeispiele beider Methoden finden Sie in der `main()`-Methode.
 * Die Rückgabe von `countChars()` soll dazu geeignet sein, alphabetisch aufsteigend
 * ausgegeben zu werden.
 * <p>
 * __Hinweise:__
 * <p>
 * - Denken Sie über den Einsatz von Exceptions nach
 * (siehe Unit 02, spezielle Kontrollanweisungen).
 * - Sehen Sie sich noch einmal das *Überladen von Methoden in Unit 02 an.
 * - Sehen Sie sich noch einmal mögliche Map-Implementierungen in Unit 03 an.
 */
public class Main {

    public static String readFrom(File x) {
        String ret = "";
        String buf = "";
        FileReader fr;
        try {
            fr = new FileReader(x);
            BufferedReader br = new BufferedReader(fr);

            do {
                /*if (ret.isEmpty());
                else
                    ret += "\n";
                ret += buf;
                */

                buf = br.readLine();
                if (buf != null)
                    if (ret == (""))
                        ret += buf;
                    else {
                        ret += "\n" + buf;
                    }
            }
            while (buf != null);

            /*for (String zeile = br.readLine(); zeile != null; zeile = br.readLine()) {
                if (ret.isEmpty())
                    ret += zeile;
                else
                    ret += "\n" + zeile;
            }
            */

            //ret.trim();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println("Datei nicht gefunden");
            return null;
        } catch (IOException e) {
            //e.printStackTrace();
            return null;
        }
        return ret;
    }

    public static Map<Character, Integer> countChars(String x, String y) {
        y = y.toLowerCase();
        String buf = x.replaceAll(" ", "");
        buf = buf.toLowerCase();
        char[] xx = buf.toCharArray();
        Map<Character, Integer> mbuf = new TreeMap<>();
        for (int i = 0; i < xx.length; i++) {
            if (y.contains(Character.toString(xx[i]))) {
                mbuf.put(xx[i], mbuf.getOrDefault(xx[i], 0) + 1);
            }

            /*
            for (int n = 0; i < yy.length; n++) {
                if (xx[i] == yy[n]) {
                    if (mbuf.containsKey(xx[i]))
                        mbuf.put(xx[i], mbuf.get(xx[i]) + 1);
                    else
                        mbuf.put(xx[i], 1);
                }
            }
            */
        }
        return mbuf;
    }

    public static Map<Character, Integer> countChars(String x) {

        return countChars(x, "qwertzuiopasdfghjklyxcvbnm");
    }

    public static void main(String[] args) {
        // Aufruf von readFrom()
        File f = new File("lorem.txt");
        String content = readFrom(f);
        String lorem = content.substring(0, 21);
        System.out.println(lorem);
        // => Lorem ipsum dolor sit

        // Rückgabe von readFrom() im Fehlerfall
        System.out.println(readFrom(new File("gibtesnicht.txt")));
        // => null

        // Default-Aufruf von countChars()
        Map<Character, Integer> occurences = countChars(lorem);
        System.out.println(occurences);
        // => {d=1, e=1, i=2, l=2, m=2, o=3, p=1, r=2, s=2, t=1, u=1}

        // Aufruf von countChars() mit vorgegebenen Zeichen
        System.out.println(countChars(lorem, "AeIoU"));
        // => {e=1, i=2, o=3, u=1}

        File v = new File("lorem.txt");
        String content2 = readFrom(v);
        System.out.println(content2);

        String content3 = "\n\n";
        System.out.println(content3);
        System.out.println(content3.length());
    }
}