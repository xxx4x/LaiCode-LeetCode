package BasicClass.Class1.assignment;
// Check if the number x is even, return true for even numbers.
public class ex2 {
    public static boolean isEven(int x){
        // boolean b = x % 2 == 0; // complete the expression
        boolean b = (x % 2 == 0); // 参考答案
        return b;
    }
    public static void main (String[] args){
        System.out.println(isEven(13872));
    }
}
