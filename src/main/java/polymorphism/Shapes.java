//: polymorphism/Shapes.java
package polymorphism; /* Added by Eclipse.py */
// Polymorphism in Java.
import polymorphism.shape.*;

public class Shapes {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s)
      shp.draw();
    for (Shape shp : s)
      shp.practice3();
  }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~

/* output Practice3.1:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
 */

/* output Practice3.2:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
Print as stated in Practice 3
Print as stated in Practice 3
[Square] Print as stated in Practice 3
Print as stated in Practice 3
[Square] Print as stated in Practice 3
Print as stated in Practice 3
[Square] Print as stated in Practice 3
Print as stated in Practice 3
Print as stated in Practice 3
 */

/* output Practice3.3:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
[Triangle] Print as stated in Practice 3
[Triangle] Print as stated in Practice 3
[Square] Print as stated in Practice 3
[Triangle] Print as stated in Practice 3
[Square] Print as stated in Practice 3
[Triangle] Print as stated in Practice 3
[Square] Print as stated in Practice 3
[Triangle] Print as stated in Practice 3
[Circle] Print as stated in Practice 3
 */