package initialization;

public class Practice15 {
    Practice15() {
        System.out.println(s1 + " " + s2);
    }

    Practice15(int i) {
        System.out.println(s1 + " " + s2);
    }

    String s1 = "String 1";
    String s2;
    {
        s2 = "String 2";
    }

    public static void main(String[] args) {
        new Practice15();
        new Practice15(1);
    }
}

/* output:
String 1 String 2
String 1 String 2
 */

// confirms that instance initialization occurs before either of the two constructors