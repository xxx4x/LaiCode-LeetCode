package BasicClass.Class2.Assignments;
/*
Is Prime Number
Determine whether an integer n is a prime number. Assumption n is >=2.
 */
public class ex2 {
    public static void main(String[] agrs){
        isPrime(65200);
    }
    public static boolean isPrime(int n) {
        // Write your solution here
        for (int i =2; i*i <=n; i++) {//参考答案
        //for (int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
