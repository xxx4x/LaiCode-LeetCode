package BasicClass.Class1;

public class Implicit {
    public static void main(String[] args){
        int x = 1;
        double y = x; // 此处double可以省，因为 double 精度> int 精度
        System.out.println("x =  " + x + "; y = " + y);
    }
}
