package BasicClass.Class11.Assignments;
/*
**[Debug] a to the power of b (743)**

**There are bugs in the given code, please fix them.**

Evaluate a to the power of b, assuming both a and b are integers and b is non-negative.

**Examples**

- power(2, 0) = 1
- power(2, 3) = 8
- power(0, 10) = 0
- power(-2, 5) = -32

**Corner Cases**

- In this question, we assume 0^0 = 1.
- What if the result is overflowed? We can assume the result will not be overflowed when we solve this problem on this online judge.
 */
public class Ex2 {
    public static long power(int a, int b) {
        // Write your solution here
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }

        long half = power(a, b / 2);
        if (b %2==0){
            return half*half;
        } else {
            return half*half*a;
        }
    }

    public static void main(String[] args){
        System.out.println(power(2,0));
        System.out.println(power(2,3));
        System.out.println(power(0,10));
        System.out.println(power(-1,12345));
        System.out.println(power(3,9)); // 19683
    }
}

