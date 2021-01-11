package thinkingInJava.demos.enums;

public class Burrito {

    Spicyness degree;
    public Burrito(Spicyness degree) {
        this.degree = degree;
    }

    public void describe(){
        System.out.print("this burrito is ");
        switch (degree){
            case HOT:
                System.out.println("very hot");
                break;
            case NOT:
                System.out.println("not hot at all");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spicyness.HOT),
                greenChile = new Burrito(Spicyness.MEDIUM),
                jalapeno = new Burrito(Spicyness.NOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
