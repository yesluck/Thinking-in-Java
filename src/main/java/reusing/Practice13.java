package reusing;

class Base13 {
    public void Print() {
        System.out.println("default");
    }

    public void Print(int i) {
        System.out.println("Integer " + i);
    }

    public void Print(String s) {
        System.out.println("String " + s);
    }

    public void Print(double d) {
        System.out.println("Double " + d);
    }
}

class Derived13 extends Base13 {
    @Override
    public void Print(String s) {
        System.out.println("Derived String " + s);
    }
}

public class Practice13 {
    public static void main(String[] args) {
        Derived13 d = new Derived13();
        d.Print();
        d.Print(1);
        d.Print("yeah");
        d.Print(2.0);
    }
}

/*
default
Integer 1
Derived String yeah
Double 2.0
 */