package basics.composition;

public class MainClass {

    public static void main(String[] args) {
        DayObject dayObject = new DayObject(1,2,3);
        Tuna tuna = new Tuna("ttt",dayObject);
        System.out.println(tuna);
    }
}
