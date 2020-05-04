package access;

class Accesses {
    public String s1 = "public";
    private String s2 = "private";
    protected String s3 = "protected";
    void echo () {
        System.out.println("Echo!");
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Accesses a = new Accesses();
        System.out.println(a.s1);
//        System.out.println(a.s2);
        System.out.println(a.s3);
        a.echo();
    }
}

/* output:
Error:(16, 29) java: s2 has private access in access.Accesses
 */
