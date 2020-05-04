package reusing;

class Tide extends Detergent {
    public void scrub() {
        append(" Tide.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" Tide.sterilize()");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Tide tide = new Tide();
        tide.scrub();
        tide.sterilize();
        System.out.println(tide);
    }
}

/* output:
Cleanser Tide.scrub() Detergent.scrub() scrub() Tide.sterilize()
 */