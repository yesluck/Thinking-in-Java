package initialization;

public class Practice10 {
    protected void finalize() {
        System.out.println("Finalized!");
    }

    public static void main(String[] args) {
        new Practice10();
        System.gc();
        System.runFinalization();
    }
}

/* output:
Finalized! (uncertain)
 */