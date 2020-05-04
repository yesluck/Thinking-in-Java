package initialization;

class Rock3 {
    String rockName;
    Rock3() { }
}

public class Practice1 {
    public static void main(String[] args) {
        Rock3 rock3 = new Rock3();
        System.out.println("Rock " + rock3.rockName);
    }
}

/* output:
Rock null
 */