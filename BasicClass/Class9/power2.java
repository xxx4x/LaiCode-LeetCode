package BasicClass.Class9;

public class power2 {
    public static void main(String[] args){
        System.out.println(power(2,0)); //1
        System.out.println(power(2,3)); // 8
        System.out.println(power(0,10)); // 0
        System.out.println(power(-2,5)); // -32
        System.out.println(power(-1,12345));
    }

    public static long power(int a, int b){
        // base case
        if (b==0){
            return 1;
        }
        // recursion rule
        return a * power(a, b-1);
    }
}
