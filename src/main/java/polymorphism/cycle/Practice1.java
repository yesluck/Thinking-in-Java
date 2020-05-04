package polymorphism.cycle;

public class Practice1 {
    public static void ride(Cycle c) {
        System.out.println("Rides with " + c.wheels()+ " wheels: " + c);
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}

/* Practice1 output:
Rides polymorphism.cycle.Cycle@2503dbd3
Rides polymorphism.cycle.Unicycle@4b67cf4d
Rides polymorphism.cycle.Bicycle@7ea987ac
Rides polymorphism.cycle.Tricycle@12a3a380
 */

// lines 10-12 are upcasting.

/* Practice5 output:
Rides with 0 wheels: polymorphism.cycle.Cycle@2503dbd3
Rides with 1 wheels: polymorphism.cycle.Unicycle@4b67cf4d
Rides with 2 wheels: polymorphism.cycle.Bicycle@7ea987ac
Rides with 3 wheels: polymorphism.cycle.Tricycle@12a3a380
 */