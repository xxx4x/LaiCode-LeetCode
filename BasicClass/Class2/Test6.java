package BasicClass.Class2;

import java.util.*;
public class Test6 {
    public static void main(String[] args) {
        int s = sign(-7);
        System.out.println(s);
    }

    public static int sign(int x) {
        if (x < 0) {
            return -1;
        } else if (x > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
