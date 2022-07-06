package BasicClass.Class13;

import java.util.Arrays;

public class main{
    public static void f(int[] z, int y) {
        recurse(1234);


    }

    public static void recurse(int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0) {
            recurse(x / 10);
        }
        System.out.print(x % 10);
    }



}
