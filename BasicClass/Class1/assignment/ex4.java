package BasicClass.Class1.assignment;
// areRoughly Equal
//Check if the given number x and y are roughly equal, the allowed error is lower than 0.0001.
// test number [1.123456,1.123457]
public class ex4 {
    public static boolean areEqual(double x, double y){
        // boolean b = Math.abs(x-y) < 0.0001 ;
        boolean b = (x-y < 0.0001) && (y-x <0.0001); // 参考答案 （自己写的时候也想到了 但忽视了括号）
        return b;
    }
    public static void main(String[] args){
        System.out.println(areEqual(1.123456,1.123457));
    }
}

