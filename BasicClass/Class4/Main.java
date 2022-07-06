package BasicClass.Class4;

public class Main {// 一个Javafile里只能有一个public class
    public static void main(String[] args){
        System.out.println("Hello offer");
        Student tom = new Student("Tom", 20, 3.4, true); // tom是这个object的reference
        System.out.println("Name = " + tom.name); //dereference 的过程 比如名字
        System.out.println("Age = " + tom.age);
        System.out.println("Gpa = " + tom.getGpa());
        System.out.println("Passed = " + tom.passed);
        tom.sayHello();

        // default: 0, false, null
        // primitive byte, short, int, long, float, double, boolean, char
        // default    0     0      0     0    0.0    0.0     false   '\u0000'
        // Reference types: String =>null
    }
}

class Student{
    String name;
    int age;
    private double gpa;
    boolean passed;

    public Student() {

    }  // 函数的重载 return type 和函数名都相同

    public double getGpa() {
        // validation  不是轻轻松让你get 需要条件 如果false 就没法get了
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int age, double gpa, boolean passed){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.passed = passed;
    }

    public void sayHello() {
        System.out.println("Hello, This is " + name);
    }

    public void sayHelle(Student another){
        System.out.println("Hello" + another.name + "This is " + name);
    }


}
