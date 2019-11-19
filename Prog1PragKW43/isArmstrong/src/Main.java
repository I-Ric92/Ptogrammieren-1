/**
 * ## Armstrongzahlen
 *
 * Ja, so etwas gibt es. Eine Armstrongzahl ist eine Zahl, 
 * deren Summe ihrer Stellen, jeweils potenziert mit ihrer Stellenanzahl, 
 * wieder die Zahl selbst ergibt.
 *
 * Z.B.: $153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153$
 *
 * Entwickeln Sie nun bitte eine Methode `isArmstrong()`, die prüft, 
 * ob eine Zahl eine Armstrongzahl ist.
 *
 * Entwickeln Sie zusätzlich eine Methode `countArmstrongs()` die
 * angibt, wieviele Armstrongzahlen es bis zu einer oberen
 * Schranke gibt.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - https://de.wikipedia.org/wiki/Narzisstische_Zahl
 * - Mittels % 10 koennen Sie den Wert der letzten Ziffer bestimmen.
 * - Mittels / 10 koennen Sie eine Zahl um eine Stelle nach rechts "rausschieben".
 *
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

        for (int i = 1;i < lang; i++) {
            n = (int) (n + Math.pow(arr[i], lang));
        }
        if (n == x)
            return true;
        return false;
    }

    public static int countArmstrongs(int n) {
        int ret = 0;
        for (int i = 0; i <= n; i++) {
            if (isArmstrong(i))
                ret++;
        }
        return ret;
    }

    public static void main(String[] args) {

        boolean result = isArmstrong(153);
        System.out.println(result); // => true
        System.out.println(isArmstrong(999)); // => false
        System.out.println(isArmstrong(-75));
        System.out.println(isArmstrong(54748));

        int n = countArmstrongs(100);
        System.out.println(n); // => 10
        System.out.println(countArmstrongs(153)); // => 11
        System.out.println(countArmstrongs(1000)); // => 14
    }
}