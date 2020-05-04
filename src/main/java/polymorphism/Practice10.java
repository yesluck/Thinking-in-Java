package polymorphism;

class Base {
    void method1() {
        System.out.println("In base method1");
        method2();
    }

    void method2() {
        System.out.println("In base method2");
    }
}

class Derived10 extends Base {
    @Override
    void method2() {
        System.out.println("In derived method2");
    }
}

public class Practice10 {
    public static void main(String[] args) {
        Base d = new Derived10();
        d.method1();
    }
}

/* output:
In base method1
In derived method2
 */

// explain: The first method isn’t overridden, but it calls the second method, which is, Java always uses the [most-derived] method for the object type