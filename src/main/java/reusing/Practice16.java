package reusing;

class Amphibian {
    public void Quack() {
        System.out.println("Quack!");
    }
}

class Frog extends Amphibian {
    public void Quack() {
        System.out.println("FrogQuack!");
    }
    public void Jump() {
        System.out.println("Jump");
    }
}

public class Practice16 {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.Quack();
        ((Frog) frog).Jump();
    }
}

/* output:
FrogQuack!
Jump
 */