package BasicClass.Class1;

public class Main {

    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        int j = i++; // j = i =5; i = i+1 = 6
        System.out.println("j:" + j);
        System.out.println("i:"+i);
        System.out.println();

        int p = 5;
        System.out.println(p);
        int q = ++p; // p = p + 1 =6 , q = p =6
        System.out.println("q:" + q);
        System.out.println("p:" + p);

    }
}
