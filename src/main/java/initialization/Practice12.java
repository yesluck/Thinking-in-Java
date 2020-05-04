package initialization;

class Tank {
    boolean full = false;

    public void fill() {
        full = true;
        System.out.println("Filled!");
    }

    public void pour() {
        full = false;
        System.out.println("Poured!");
    }

    protected void finalize() {
        if (full)
            System.out.println("Error: full.");
        System.out.println("Finalized!");
    }
}

public class Practice12 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.fill();
        tank.pour();
        tank.fill();
        System.gc();
        System.runFinalization();

        tank.fill();
        tank.pour();
        System.gc();
        System.runFinalization();
    }
}

// TODO: no finalization output???
