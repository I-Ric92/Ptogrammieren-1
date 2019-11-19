/**
 * ## Zeichenketten "rotieren"
 * <p>
 * Entwickeln Sie nun bitte eine Methode `rotate()`, die eine Zeichenkette
 * nach links oder rechts "rotiert". Zeichen die links oder rechts aus
 * der Zeichenkette "geschoben" werden, sollen rechts bzw. links wieder
 * "hineingeschoben" werden.
 * <p>
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 * <p>
 * __Hinweise:__
 * <p>
 * - Beachten Sie, dass eine Rotation positiv und negativ sein kann.
 * - Beachten Sie, dass eine Rotation länger als die eigentliche Zeichenkette sein kann.
 * - Das Problem lässt sich tatsächlich ohne Schleife lösen (sicherlich aber auch mit ;-).
 */
class Main {

    public static String rotate(int n, String s) {


        String ret = "";

        if (n == 0)
            return s;
        else {

            if (n >= s.length()) {
                n = n - s.length();
                return rotate(n, s);
            } else if (n <= -s.length()) {
                n = n + s.length();
                return rotate(n, s);
            }
            else {
                int m = s.length() - n;
                if (n > 0)
                    ret = s.substring(m) + s.substring(0, m);

                else {
                    m = n * (-1);
                    ret = s.substring(m) + s.substring(0, m);
                }
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        String result = rotate(2, "Hello");
        System.out.println(result); // => "loHel"
        System.out.println(rotate(3, "Hello")); // => "lloHe"
        System.out.println(rotate(6, "Hello")); // => "oHell"
        System.out.println(rotate(-2, "Hello"));
        System.out.println(rotate(-6, "Hello"));
        System.out.println(rotate(0, "Hello"));
        System.out.println(rotate(50, "Hello"));
        System.out.println(rotate(-50, "Hello"));
    }
}