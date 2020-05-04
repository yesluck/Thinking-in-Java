//: reusing/Beetle.java
package reusing; /* Added by Eclipse.py */
// The full process of initialization.
import static net.mindview.util.Print.*;

class Insect {
  private int i = 9;
  protected int j;
  Insect() {
    print("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 =
    printInit("static Insect.x1 initialized");
  static int printInit(String s) {
    print(s);
    return 47;
  }
}

public class Beetle extends Insect {
  private int k = printInit("Beetle.k initialized");
  public Beetle() {
    print("k = " + k);
    print("j = " + j);
  }
  private static int x2 =
    printInit("static Beetle.x2 initialized");
  public static void main(String[] args) {
    print("Beetle constructor");
    Beetle b = new Beetle();
  }
} /* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
*///:~

class ConcreteBeetle extends Beetle {
  private int k = printInit("ConcreteBeetle.k initialized");
  public ConcreteBeetle() {
    print("k = " + k);
    print("j = " + j);
  }
  private static int x2 =
          printInit("static ConcreteBeetle.x2 initialized");
  public static void main(String[] args) {
    print("ConcreteBeetle constructor");
    ConcreteBeetle b = new ConcreteBeetle();
  }
}

/* output:
static Insect.x1 initialized
static Beetle.x2 initialized
static ConcreteBeetle.x2 initialized
ConcreteBeetle constructor
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
ConcreteBeetle.k initialized
k = 47
j = 39
 */

// Explain: static (Base -> ... -> Most Derived) --> constructor (Base -> ... -> Most Derived) --> nonstatic