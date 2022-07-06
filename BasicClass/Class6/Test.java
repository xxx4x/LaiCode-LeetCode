package BasicClass.Class6;

public class Test {
    public static void main(String[] args){
        MyTest test = new MyTest();
        test.myTest();
    }
}

class Student {
    public String getName() {
        return "laioffer student";
    }
}

class MyTest {
    public Student student = null;
    public void myTest() {
        System.out.println(student.getName());
    }
}
