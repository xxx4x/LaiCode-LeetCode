package BasicClass.Class2;

public class Test4 {
    public static void main(String[] args){
        int a = 2;
        double b = 1.2;
        double result = multiply(a, b);
        System.out.println("Minimum Value = " + result);

        double c = 1.3;
        int d = 3;
        double result2 = multiply (c,d);
        System.out.println("Minimum Value = " + result2);
    }
    public static double multiply(int a, double b) {
        return a * b;
    }
    public static double multiply(double a, int b) {
        return a * b;
    }
}
