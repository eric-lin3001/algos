package demos;

public class RecursionDemo {

    private static long factorial(int n){
        System.out.println("called: "+ n);
        if(n==1){
            return 1;
        }else {
            long rst = n*factorial(n-1);
            System.out.println(rst);
            return rst;
        }
    }

    public static void main(String[] args) {
        long rst = factorial(5);
        System.out.println(rst);
    }
}
