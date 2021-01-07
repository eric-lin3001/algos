package demos.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("Bob");
        list.add(p1);
        System.out.println(list.contains(new Person("Bob"))); // false
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.name, p.name);
        }
        return false;
    }
}
