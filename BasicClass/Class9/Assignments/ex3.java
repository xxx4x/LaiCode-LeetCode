package BasicClass.Class9.Assignments;

public class ex3 {
    public static void main(String[] args){
        System.out.println(power(2,0)); //1
        System.out.println(power(2,3)); // 8
        System.out.println(power(0,10)); // 0
        System.out.println(power(-2,5)); // -32
        System.out.println(power(-1,12345));
    }

    public static long power(int a, int b){

        if (b == 0){
            return 1;
        }
        if (a == 0){
            return 0;
        }
        long half = power(a, b/2);
        return b % 2 == 0? half*half : half*half*a;

        /*
        if (b==0) {
            return 1;
        } else if (a==-1){
            if (b % 2 ==0){
                return 1;
            } else {
                return -1;
            }
        } else if (a==1){
            return 1;
        } else{
            return a*power(a,b-1);
        }

         */
    }
}
