package BasicClass.Class1;

public class Test {
    public static void main(String[] args) {
        String s = "abc" + 1 + "!!!"; /// abc1!!!
        String a = 5 + 1 + "abc"; // = 6 + "abc"=6abc
        String b = "abc" + 5 + 1; // = "abc5" + 1 = abc51   注意符号顺序
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);

    }
}
