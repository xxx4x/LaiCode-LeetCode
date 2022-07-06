package BasicClass.Class9;

public class Fib {
    public static void main(String[] args){
        for (int i = 0; i < 20; i++) {
            System.out.println("Fibo(" + i + ")=" + fib(i) + " ");
        }
    }
    public static long fib(int n){
        if (n<0){
            return -1;
        }
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        long a = 0;
        long b = 1;
        for (int i = 0; i < n-1; i++){
            long tmp = a+b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
