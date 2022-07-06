package BasicClass.Class2.Assignments;
/*
Calculate a to the power of b (naive)
Example:
a = 3, b = 4  Return 81
a = 4, b = 2  Return 16
Assumption: a > 0, b > 0
Note: don’t worry about time complexity for now.
 */
public class ex5 {
    public static void main(String[] args){
        power(7,7);
    }
    /*
    public static int power(int a, int b){
        int c = a;
        for (int i = 1; i < b; i++){  //这边i<b 不能 i<=b 因为 c初始值就已经是a了 不然第一次循环的时候变平方了
            c *= a;
        }
        return c;
    }
     */
    public static int power(int a, int b){
        int res = 1;
        for (int i = 0; i < b; i++){
            res *= a;
        }
        return res;   // 参考答案
    }
}
