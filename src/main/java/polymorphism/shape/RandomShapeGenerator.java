//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;
import java.util.*;

public class RandomShapeGenerator {
  private Random rand = new Random(42);
  public Shape next() {
    switch(rand.nextInt(4)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
      case 3: return new Rectangle();
    }
  }
} ///:~

/* Practice4 output:
Triangle.draw()
Circle.draw()
Triangle.draw()
Circle.draw()
Square.draw()
Rectangle.draw()
Square.draw()
Triangle.draw()
Triangle.draw()
[Triangle] Print as stated in Practice 3
[Circle] Print as stated in Practice 3
[Triangle] Print as stated in Practice 3
[Circle] Print as stated in Practice 3
[Square] Print as stated in Practice 3
[Rectangle] Print as stated in Practice 3
[Square] Print as stated in Practice 3
[Triangle] Print as stated in Practice 3
[Triangle] Print as stated in Practice 3
 */