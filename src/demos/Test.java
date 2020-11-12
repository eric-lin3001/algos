package demos;

public class Test {
     public static void main(String[] args) {
//          System.out.println('a' == );
          System.out.println(System.identityHashCode('a'));
          System.out.println(System.identityHashCode("ilovejava"));


          String s1 = new String("geek");
          String s2 = new String("geek");
          System.out.println(s1==s2);
          System.out.println(s1.equals(s2));
}
}
