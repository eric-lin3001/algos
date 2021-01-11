package thinkingInJava;

/**
 * Create an enum of the least-valuable six types of paper currency.
 * Loop through the values() and print each value and its ordinal().
 *
 * Chapter 05 Exercise 21
 */

enum MoneyValue {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY, ONE_HUNDRED
}

public class Ex_5_21 {


    public static void main(String[] args) {
        for (MoneyValue v : MoneyValue.values()) {
            System.out.println("Paper money value is " + v + ", ordinal is " + v.ordinal());
        }
    }
}
