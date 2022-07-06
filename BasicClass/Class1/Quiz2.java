package BasicClass.Class1;

public class Quiz2 {
    public static void main (String[] args){
        int a = 2, b = 4, c = 8;
        double result = a + (double) (b / c); // int b / int c = int 4/8= int 0.5 =0 double 0 = 0.0
        System.out.println(result); // int 2 + 0.0= 2.0
    }
}
