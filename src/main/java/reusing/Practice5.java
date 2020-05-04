package reusing;

class A {
    A(int i) {
        System.out.println("Constructing A" + i);
    }
}

class B {
    B(int i) {
        System.out.println("Constructing B" + i);
    }
}

class C extends A {
    C(int i) {
        super(i);
        new B(i);
    }
}

public class Practice5 {
    public static void main(String[] args) {
        C c = new C(1);
    }
}

/* Practice5 output:
Constructing A
Constructing B
 */

/* output:
Constructing A1
Constructing B1
 */