//: reusing/Chess.java
package reusing; /* Added by Eclipse.py */
// Inheritance, constructors and arguments.
import static net.mindview.util.Print.*;

class Game {
  Game(int i) {
    print("Game constructor");
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    // Practice6 comment next line and error
    super(i);
    print("BoardGame constructor");
  }
}	

public class Chess extends BoardGame {
  Chess() {
    super(11);
    print("Chess constructor");
  }
  public static void main(String[] args) {
    Chess x = new Chess();
  }
} /* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~

/* Practice6 output:
Error:(13, 20) java: constructor Game in class reusing.Game cannot be applied to given types;
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
 */