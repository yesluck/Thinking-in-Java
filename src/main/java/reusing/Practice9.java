package reusing;

class Component1 {
    Component1(String s) {
        System.out.println("Constructing Component1 " + s);
    }

    void dispose() {
        System.out.println("Disposing Component1");
    }
}

class Component2 {
    Component2(String s) {
        System.out.println("Constructing Component2 " + s);
    }

    void dispose() {
        System.out.println("Disposing Component2");
    }
}

class Component3 {
    Component3(String s) {
        System.out.println("Constructing Component3 " + s);
    }

    void dispose() {
        System.out.println("Disposing Component3");
    }
}

class Root {
    private Component1 c1 = new Component1("in Root");
    private Component2 c2 = new Component2("in Root");
    private Component3 c3 = new Component3("in Root");
    Root(String s) {
        System.out.println("Constructing Root " + s);
    }

    void dispose() {
        System.out.println("Disposing Root");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class Stem extends Root {
    private Component1 c1 = new Component1("in Stem");
    private Component2 c2 = new Component2("in Stem");
    private Component3 c3 = new Component3("in Stem");
    Stem(String s) {
        super(s);
        System.out.println("Constructing Stem " + s);
    }

    void dispose() {
        System.out.println("Disposing Stem");
        super.dispose();
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

public class Practice9 {
    public static void main(String[] args) {
        Stem stem = new Stem("s");
        stem.dispose();
    }
}

/* output:
Constructing Component1 in Root
Constructing Component2 in Root
Constructing Component3 in Root
Constructing Root s
Constructing Component1 in Stem
Constructing Component2 in Stem
Constructing Component3 in Stem
Constructing Stem s
Disposing Stem
Disposing Root
Disposing Component3
Disposing Component2
Disposing Component1
Disposing Component3
Disposing Component2
Disposing Component1
 */
