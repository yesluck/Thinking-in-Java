//: polymorphism/shape/Circle.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Circle extends Shape {
  @Override
  public void draw() { print("Circle.draw()"); }
  @Override
  public void erase() { print("Circle.erase()"); }
  @Override
  public void practice3() {
    System.out.println("[Circle] Print as stated in Practice 3");
  }
} ///:~
