package BasicClass.Class9;

public class power3 {
    public static void main(String[] args){
        System.out.println(power(2,0)); //1
        System.out.println(power(2,3)); // 8
        System.out.println(power(0,10)); // 0
        System.out.println(power(-2,5)); // -32
        System.out.println(power(-1,12345));
    }

    public static long power(int a, int b){
        // base case
        if (b == 0){
            return 1;
        } else if (b ==1){
            return a;
        }

        if (b % 2 == 1){
            return power(a, b/2) * power(a, b/2)*a;
        } else{
            return power(a, b/2) * power(a, b/2);
        }
    }
}
