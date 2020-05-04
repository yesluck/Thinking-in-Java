package reusing;

public class Practice19 {
    final int i;

    Practice19() {
        i = 0;
    }

    Practice19(int x) {
        i = x;
    }

    public static void main(String[] args) {
        Practice19 p = new Practice19(5);
        System.out.println(p.i);
    }
}

/* output:
5
 */
