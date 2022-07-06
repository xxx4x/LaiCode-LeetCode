package BasicClass.Class2.Assignments;

/*
Calculate factorial of n
求n的阶乘. Assumption, n > 1.
Example:
n = 3, return 6
n = 4, return 24
n = 5, return 120
 */

public class ex4 {
    public static void main(String[] args){
        factorial(12);
    }

    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
}
// 参考答案
