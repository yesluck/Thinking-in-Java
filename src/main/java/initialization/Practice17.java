package initialization;

class PrintString {
    PrintString(String str) {
        System.out.println(str);
    }
}

public class Practice17 {
    public static void main(String[] args) {
        PrintString[] ps = new PrintString[5];
        for (int i = 0; i < 5; i++)
            ps[i] = new PrintString(Integer.toString(i));
    }
}

/* output:
0
1
2
3
4
 */