package basics.statics;

public class Employee {
    private static int nextId;
    private int id;
    static int m = 1;
    int t;

    // 静态成员变量可以被（对象等）修改，由于它属于类，所以所有对象的该静态成员都被修改。
    public void changeNextId() {
        nextId++;
    }

    // 静态成员变量属于类，所有对象调用时都返回相同的值。
    public void getNextId(){
        System.out.println(nextId);
    }

    // 静态方法属于类，所以在里面无法修改非静态变量。
    public static void setNextId(int nextId) {
        System.out.println(4);
        Employee.nextId = nextId;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        int a = e1.id;
        e1.getNextId();
        e1.getNextId();
        Employee e2 = new Employee();
        e2.getNextId();
        e1.id = 3;
        e1.setNextId(4);
    }
}
