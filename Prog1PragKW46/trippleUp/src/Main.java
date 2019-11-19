/**
 * ## Aufsteigend sortierte Tripple finden
 * <p>
 * Schreiben Sie nun bitte eine Methode `trippleUp()`
 * die in einem Integer-Array prüft, ob dieses
 * drei aufsteigende, benachbarte Werte wie bspw. 1, 2, 3,
 * oder auch 24, 25, 26 beinhaltet.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 */
class Main {

    public static boolean trippleUp(int[] x) {

        if (x.length < 0)
            return false;

        for (int i = 0; i < x.length - 2; i++) {
            if (x[i] == x[i + 1] - 1 && x[i] == x[i + 2] - 2)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 4, 5, 6, 2};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 4};
        int[] a4 = {3, 2, 1};

        System.out.println(trippleUp(a1)); // => true
        System.out.println(trippleUp(a2)); // => true
        System.out.println(trippleUp(a3)); // => false
        System.out.println(trippleUp(a4)); // => false
    }
}