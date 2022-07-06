package BasicClass.Class9.Assignments;
/*
Calculate Factorial of n (550)
Calculate the factorial of n using recursion.
Assumption: n >= 1.
Example:
n = 1 ⇒ return 1
n = 3 ⇒ return 6
n = 5 ⇒ return 120
n= 12
 */
public class ex2 {
    public static void main(String[] args){
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(12));
    }

    public static long factorial(int n){
        if (n == 1){
            return 1;
        }
        return n*factorial(n-1);
        /*
        long first = 1;
        if (n == first){
            return first;
        } else{
            long k = n*factorial(n-1);
            return k;
        }
         */
    }
}
