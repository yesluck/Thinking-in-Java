package initialization;

public class Practice14 {
    static String s1 = "String 1";
    static String s2;
    static {
        s2 = "String 2";
    }

    public static void main(String[] args) {
        System.out.println(s1);
        System.out.println(s2);
    }
}

/* output:
String 1
String 2
 */