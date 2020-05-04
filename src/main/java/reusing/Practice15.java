package reusing;

import reusing.Practice15_Inside.*;

class OutsideDerived extends InsideBase {
    public void outsidePrint(String s) {
        Print(s);
    }
}

public class Practice15 {
    public static void main(String[] args) {
        InsideBase ib = new InsideBase();
        OutsideDerived od = new OutsideDerived();
        od.outsidePrint("a");
//        od.Print("a");  // compile error
    }
}

/* output:
a
 */