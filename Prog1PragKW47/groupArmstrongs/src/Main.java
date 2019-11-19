import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * ## Armstrongzahlen gruppieren
 * <p>
 * Entwickeln Sie nun bitte die Methoden
 * <p>
 * - `armstrongs()`, die eine Liste aller aufsteigend sortierter
 * Armstrongzahlen bis zu einer oberen Schranke erzeugt,
 * - und `groupyByLength()`, die eine Liste von Integer Werten mittels einer
 * Map nach der Anzahl ihrer Stellen gruppiert. Die Map soll das Ordnungskriterium
 * Stellenanzahl bei einer sequentiellen Verarbeitung der Schlüssel erhalten.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweise:__
 * <p>
 * - Sie haben bereits einmal eine Lösung entwickelt, die prüft, ob eine Zahl eine Armstrongzahl ist.
 * - Beachten Sie die Wahl ihrer Map-Implementierung.
 */
class Main {

    public static boolean isArmstrong(int x) {

        int n = 0;
        int lang = 1;
        int s = x;

        if (x < 0)
            return false;

        while (s >= 10) {
            lang++;
            s = s / 10;
        }

        if (lang <= 0)
            return false;

        int[] arr = new int[lang];
        s = x;
        for (int i = 0; s >= 10; i++) {
            arr[i] = s % 10;
            s = s / 10;
        }
        arr[lang - 1] = s;
        if (lang > 0)
            n = (int) (Math.pow(arr[0], lang));

        for (int i = 1; i < lang; i++) {
            n = (int) (n + Math.pow(arr[i], lang));
        }
        if (n == x)
            return true;
        return false;
    }

    public static List<Integer> armstrongs(int x) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i <= x; i++) {
            if (isArmstrong(i))
                ret.add(i);
        }
        return ret;
    }

    public static Map<Integer, List<Integer>> groupByLength(List<Integer> x) { //ToDo
        Map<Integer, List<Integer>> ret = new TreeMap<Integer, List<Integer>>();
        List<Integer> l = new ArrayList<>();
        int n = 20;
        for (int i = 1; n > 0; i++) {
            l.addAll(getList(x, i));
            if (l.isEmpty())
                n--;
            else {
                ret.put(i, getList(x, i));
                n = 2;
            }
            l.clear();
        }
        return ret;
    }

    public static List<Integer> getList(List<Integer> x, int y) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {     //Durchgehen der Liste
            int lang = 1;
            int buf = x.get(i);
            while (buf >= 10) {                   //Länge
                lang++;
                buf = buf / 10;
            }
            while (buf <= -10) {                   //Länge
                lang++;
                buf = buf / 10;
            }
            if (lang == y)
                ret.add(x.get(i));
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> lance = armstrongs(500);
        System.out.println(lance);
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407]

        Map<Integer, List<Integer>> grouped = groupByLength(lance);
        System.out.println(grouped);
        // {1=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9], 3=[153, 370, 371, 407]}

        //lance = {1886, 1761, 1478, 1502, 1081, 1020, 1271, 1285, 1982};
        //Map<Integer, List<Integer>> grouped2 = groupByLength(lance);
        //System.out.println(grouped2);
    }
}