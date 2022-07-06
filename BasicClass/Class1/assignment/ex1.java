package BasicClass.Class1.assignment;
// Division without loss of precision
// Q: Given two integer a and b, calculate a divide by b but maintain the precision.
public class ex1 {
    public static double divide() {
        int a = 3;
        int b = 7;

        //double c = (double) a/b; // Complete the expression
        double c =  1.0* a/b; // 参考答案
        return c;
    }
    public static void main(String[] args){
        System.out.println(divide());
    }
}
