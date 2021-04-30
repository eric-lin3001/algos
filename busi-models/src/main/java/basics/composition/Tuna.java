package basics.composition;

public class Tuna {
    private String name;
    private DayObject dayObject;


    public Tuna(String name, DayObject dayObject) {
        this.name = name;
        this.dayObject = dayObject;
    }


    @Override
    public String toString() {
        return String.format("My name is %s, My birthay is %s", name, dayObject);
    }
}
