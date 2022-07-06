package BasicClass.Class6;

public class Myclass {
    public static void main(String[] args){
        int a = 5;
        int z = a++ + a*10000 + a++ + a*1000 + ++a + a*100;

        System.out.println("a = " + a);
        System.out.println("Sum of x+y = " + z);
    }
}
