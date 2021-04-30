package basics.polymorphism;

public class FoodList {

    Food[] foods = new Food[5];
    int i = 0;

    void add(Food food) {
        if(i<foods.length){
            foods[i] = food;
            System.out.println(String.format("Your food %s is added!",food.getClass()));
            i++;
        }else {
            System.out.println("Out of range!");
        }
    }

}
