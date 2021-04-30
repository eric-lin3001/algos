package basics.composition;

public class DayObject {
    private int day;
    private int month;
    private int year;

    public DayObject(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        System.out.printf("Cons: %s \n",this);
    }


    @Override
    public String toString() {
        return String.format("%d/%d/%d",day,month,year);
    }
}
