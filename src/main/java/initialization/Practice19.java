package initialization;

class StringList {
    StringList(String... strs) {
        int n = strs.length;
        for (int i = 0; i < n; i++)
            System.out.println(strs[i]);
    }
}

public class Practice19 {
    public static void main(String[] args) {
        StringList sl1 = new StringList("a", "b", "c");
        String[] strs = {"A", "B", "C"};
        StringList sl2 = new StringList(strs);
    }
}

/* output:
a
b
c
A
B
C
 */