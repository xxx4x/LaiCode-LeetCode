package BasicClass.Class2.Assignments;
/*
Return 1 if the input integer is positive,
-1 if the input integer is negative,
0 if the input integer is zero.
 */
public class ex1 {
    public static void main(String[] args){
        sign(823748);
    }
    public static int sign(int x){
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
// 参考答案