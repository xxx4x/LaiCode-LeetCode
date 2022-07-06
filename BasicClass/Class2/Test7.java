package BasicClass.Class2;

public class Test7 {
    public static void main(String[] args) {
        int s = sign(-7);
        System.out.println(s);
    }
    public static int sign(int x){
        if (x < 0) {
            return -1;
        }
        if (x > 0) {
            return 1;
        }
        return 0;
    }
}
