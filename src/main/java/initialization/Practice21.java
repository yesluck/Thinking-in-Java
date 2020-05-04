package initialization;

public class Practice21 {
    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + " ordinal " + m.ordinal());
            switch(m) {
                case ONE:   System.out.println("$1");
                    break;
                case TWO:   System.out.println("$2");
                    break;
                case FIVE:   System.out.println("$5");
                    break;
                case TEN:   System.out.println("$10");
                    break;
                case TWENTY:   System.out.println("$20");
                    break;
                case FIFTY:   System.out.println("$50");
                    break;
            }
        }
    }
}

/* output:
ONE ordinal 0
$1
TWO ordinal 1
$2
FIVE ordinal 2
$5
TEN ordinal 3
$10
TWENTY ordinal 4
$20
FIFTY ordinal 5
$50
 */