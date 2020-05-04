package initialization;

class Rock5 {
    Rock5() {
        System.out.println("Constructor called.");
    }

    Rock5(String rockName) {
        System.out.println("Constructor called: " + rockName);
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Rock5 rock5 = new Rock5(), rock6 = new Rock5("rock6");
    }
}

/* output:
Constructor called.
Constructor called: rock6
 */