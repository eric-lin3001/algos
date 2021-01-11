package thinkingInJava;

/**
 * Write a switch statement for the enum in the previous example. For each case,
 * output a description of that particular currency.
 * <p>
 * Chapter 05 Exercise 22
 */

public class Ex_5_22 {
    public static void main(String[] args) {
        for (MoneyValue moneyValue : MoneyValue.values()) {
            switch (moneyValue) {
                case ONE:
                    System.out.println("this paper money's value is ONE");
                    break;
                case TWO:
                    System.out.println("this paper money's value is TWO");
                case FIVE:
                    System.out.println("this paper money's value is FIVE");
                    break;
                case TEN:
                    System.out.println("this paper money's value is TEN");
                    break;
                case TWENTY:
                    System.out.println("this paper money's value is TWENTY");
                    break;
                case FIFTY:
                    System.out.println("this paper money's value is FIFTY");
                    break;
                case ONE_HUNDRED:
                    System.out.println("this paper money's value is ONE_HUNDRED");
                    break;
            }
        }

    }
}
