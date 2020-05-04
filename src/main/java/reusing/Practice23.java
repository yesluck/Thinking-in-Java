package reusing;

class LoadTest {
    static {
        System.out.println("Loaded static block");
    }
    public static void StaticMethod() {
        System.out.println("In StaticMethod");
    }
}

public class Practice23 {
    public static void main(String[] args) {
        LoadTest.StaticMethod();
        new LoadTest();
    }
}

/* output:
Loaded static block
In StaticMethod
 */