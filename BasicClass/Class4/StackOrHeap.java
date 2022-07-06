package BasicClass.Class4;

/*
x1, a1, x2, a2, x3 which are on stack and which are on heap?
 */
public class StackOrHeap {
    public static void main(String[] args) {
        B b = new B();  // b
        b.f();
        b.a2.g(5);
    }
}

class B {
    public void f() {
        int x1 = 7;   // x1 local type variables stack
        A a1 = new A(); // a1 reference function stack
    }
    int x2 = 8;  // stack
    A a2 = new A();   // stack
}

class A {
    int x = 7;
    public void g(int num) {
        int x3 = num;   // heap
        System.out.println(x3);
    }
}

