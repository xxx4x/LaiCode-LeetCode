package BasicClass.Class1.assignment;
// String concatenation
/*
Given two strings, concatenate them into one, separated by a comma.
Example:
first string: “hello”
second string: “world”
result: “hello,world”
 */
public class ex5 {
    public static String concatenate(String x, String y){
        String z = x + "," + y; //complete the expression // 参考答案
        return z;
    }

    public static void main(String[] args){
        System.out.println(concatenate("asd,",",basdasd"));
    }
}
