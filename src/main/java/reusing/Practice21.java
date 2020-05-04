package reusing;

class FinalMethod {
    final void Echo() {
        System.out.println("Echo!");
    }
}

class FinalMethodDerived extends FinalMethod {
    // Cannot override or even define
//    @Override
//    void Echo() {
//        System.out.println("EchoDerived!");
//    }
}

public class Practice21 {
}
