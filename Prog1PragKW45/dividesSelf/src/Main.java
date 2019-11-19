/**
 * ## Selbstteilende Zahlen
 * <p>
 * Entwickeln Sie nun bitte eine Methode `dividesSelf()`, die prüft,
 * ob eine Zahl selbstteilend ist. Eine Zahl ist selbstteilend, wenn
 * alle ihre Stellen die Zahl ganzzahlig teilt.
 * <p>
 * Da durch den Wert 0 bekanntlich nicht geteilt werden kann, können alle
 * Zahlen mit einer Nullziffer (Dezimalnotation) nicht sich selbstteilend
 * sein.
 * <p>
 * z.B.: 128 = 128 % 1 == 0 && 128 % 2 == 0 && 128 % 8 == 0
 * <p>
 * Entwickeln Sie zusätzlich eine Methode `countSelfDivides()` die
 * angibt, wieviele sich selbstteilende Zahlen es ab 0 bis zu einer oberen
 * Schranke gibt.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweise:__
 * <p>
 * - Die Methodensignaturen sind Ihnen nicht mehr vorgegeben. Leiten Sie diese
 * aus der Aufgabenstellung bitte selber ab.
 * - Mittels % 10 können Sie den Wert der letzten Ziffer bestimmen.
 * - Mittels / 10 können Sie eine Zahl um eine Stelle nach rechts "rausschieben".
 */
class Main {

    public static boolean dividesSelf(int n) {

        if(n < 0)
            n = n * (-1);

        int lang = 1;
        int s = n;

        while (s >= 10) {
            lang++;
            s = s / 10;
        }

        s = n;

        int[] arr = new int[lang];

        for (int i = 0; s >= 10; i++) {
            arr[i] = s % 10;
            s = s / 10;
        }
        arr[lang - 1] = s;

        for (int i = 0; i < lang; i++) {
            if (arr[i] == 0)
                return false;
        }

        for (int i = 0; i < lang; i++) {
            if (n % arr[i] != 0)
                return false;
        }
        return true;
    }

    public static int countDividesSelf(int n) {
        int m = 0;
        for (int i = 0; i <= n; i++) {
            if (dividesSelf(i))
                m++;
        }
        return m;
    }

    public static void main(String[] args) {

        boolean result = dividesSelf(128);
        System.out.println(result); // => true
        System.out.println(dividesSelf(12)); // => true
        System.out.println(dividesSelf(102)); // => false

        int n = countDividesSelf(10);
        System.out.println(n); // => 9
        System.out.println(countDividesSelf(100)); // => 23
        System.out.println(countDividesSelf(1000)); // => 79

        System.out.println(dividesSelf(012));
        System.out.println(dividesSelf(-128)); // => false
        System.out.println(dividesSelf(000));

        System.out.println(countDividesSelf(1000));
        System.out.println(countDividesSelf(0));
        System.out.println(countDividesSelf(000));
    }
}