package thinkingInJava.demos.overload;

public class Animal {

    public static void classify(Animal a){
        System.out.println("animal");
    }

    public static void classify(Cat c){
        System.out.println("cat");
    }

    public static void classify(Dog d){
        System.out.println("this is a dog");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        classify(a);
        Cat c = new Cat();
        classify(c);
        Animal d = new Dog();
        classify(d);
    }
}

