package reusing;

class Base {
    Base(int i) {}
}

class Derived extends Base {
    Derived() {
        super(0);
    }
    Derived(int i) {
        super(i);
    }
}

public class Practice8 {
    public static void main(String[] args) {
        new Derived();
    }
}
