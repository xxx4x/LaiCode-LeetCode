package BasicClass.Class1;

public class Explicit {
    public static void main(String[] args){
        double x = 1.9;
        int y = (int) x + 3;  // 此处不能省， double 精度> int 精度
        System.out.println("" + x + "; y = " + y);
    }
}
