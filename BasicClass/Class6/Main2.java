package BasicClass.Class6;

public class Main2 {
    public static void main(String args[]){
        System.out.println(JavaTester.x);
        JavaTester s = new JavaTester(); // obj: s
        s.run(5);
    }
}

class JavaTester{
    static int x = 11;
    int y = 33;
    public void run(int x){
        JavaTester t = new JavaTester(); //obj: t :2 objects
        this.x = 22; // member variable
        y = 44;  // member variable

        System.out.println("x: " + x);   //x: 5
        System.out.println("Test.x: " + t.x);  //Test.x: 22
        System.out.println("t.x: " + t.x);  //t.x: 22
        System.out.println("t.y: " + t.y);  // t.y :33
        System.out.println("y: " + y); // y:44
    }
}
