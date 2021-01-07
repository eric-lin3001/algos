package basics;

import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.Comparator;

public class StaticFields {
    String name;
    int a;
    public static int b;

    public StaticFields(String name) {
        this.name = name;
        a++;
        b++;
    }

    public static void main(String[] args) {
        StaticFields staticFields1 = new StaticFields("s1");
        // 类StaticFields被实例化，实例化名为staticFields1，操作是对非静态变量a+1，a原值为0，所以staticFields1.a输出1
        System.out.println(staticFields1.a);
        // 类StaticFields被实例化，实例化名为staticFields1，操作是对静态变量b+1，静态变量值在实例中共享，原b值为0，+1后等于1，所以StaticFields.b输出1。注意要以类名而不是实例名引用b。
        System.out.println(StaticFields.b);
        StaticFields staticFields2 = new StaticFields("s2");
        // 类StaticFields被实例化，实例化名为staticFields1，操作是对非静态变量a+1，a原值为0，所以staticFields1.a输出1
        System.out.println(staticFields2.a);
        // 类StaticFields被实例化，实例化名为staticFields1，操作是对静态变量b+1，静态变量值在实例中共享，原b值为1，+1后等于2，所以StaticFields.b输出2。注意要以类名而不是实例名引用b。
        System.out.println(StaticFields.b);
    }
}
