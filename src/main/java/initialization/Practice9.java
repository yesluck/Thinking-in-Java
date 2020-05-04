package initialization;

public class Practice9 {
    Practice9() {
        this(5);
    }

    Practice9(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Practice9 p = new Practice9();
    }
}

/* output:
5
 */