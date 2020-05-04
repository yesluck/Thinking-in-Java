package initialization;

class Rock4 {
    String rockName1 = "default";
    String rockName2;

    Rock4(String rockName_) {
        rockName2 = rockName_;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Rock4 rock4 = new Rock4("myRock");
        System.out.println(rock4.rockName1);
        System.out.println(rock4.rockName2);
    }
}

/* output:
default
myRock
 */