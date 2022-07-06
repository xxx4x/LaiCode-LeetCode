package BasicClass.Class7;
public class Main1 {
    public static void main(String[] args) {
        int x = 1, y = 1;
        A a = new A(2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(a.x);
        System.out.println(a.y);
    }
}

class A {
    public int x;
    public int y;

    A(int y) {
        this.y = y;
    }
}
