package initialization;

class Peach {
    public void eat() {
        bite();
        this.bite();
    }

    public void bite() {
        System.out.println("Bite");
    }
}

public class Practice8 {
    public static void main(String[] args) {
        Peach peach = new Peach();
        peach.eat();
    }
}

/* output:
Bite
Bite
 */