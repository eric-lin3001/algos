package basics.polymorphism;

public class MainClass {

    public static void main(String[] args) {
//        Fatty fatty = new Fatty();
//        Food food = new Food();
//        Food tuna = new Tuna();
//        Tuna tuna1 = new Tuna();
//
//        fatty.digest(food);
//        fatty.digest(tuna);
//        fatty.digest(tuna1);


//        Food[] foods = new Food[2];
//        Food foods[] = new Food[2];
//        foods[0] = new Tuna();
//        foods[1] = new Potpie();
//
//        for (Food food : foods) {
//            food.eat();
//        }
//
        FoodList foodList = new FoodList();
        Tuna tuna = new Tuna();
        Potpie potpie = new Potpie();
        foodList.add(tuna);
        foodList.add(potpie);



    }


}
