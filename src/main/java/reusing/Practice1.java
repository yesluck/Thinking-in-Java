package reusing;

class First {}

class Second {
    First first;

    public void useFirst() {
        if (first == null) {
            System.out.println("Lazy initialization");
            first = new First();
        } else
            System.out.println("Already has an instance!");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Second second = new Second();
        second.useFirst();
        second.useFirst();
    }
}

/* output:
Lazy initialization
Already has an instance!
 */
