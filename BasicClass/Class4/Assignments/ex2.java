package BasicClass.Class4.Assignments;
/*
There are bugs in the given code, please fix them.
Calculate the factorial of n (n > 1).
Example:
n = 3, return 6
n = 4, return 24
n = 5, return 120
 */
public class ex2 {
    public static void main(String[] args){
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            /*
            int res *= n;
             */
        }
        return res;
    }
}
