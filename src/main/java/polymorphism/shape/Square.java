//: polymorphism/shape/Square.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Square extends Shape {
  @Override
  public void draw() { print("Square.draw()"); }
  @Override
  public void erase() { print("Square.erase()"); }
  @Override
  public void practice3() {
    System.out.println("[Square] Print as stated in Practice 3");
  }
} ///:~
