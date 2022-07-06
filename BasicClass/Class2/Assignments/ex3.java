package BasicClass.Class2.Assignments;

public class ex3 {
    public static void main(String[] args){
        sumOfSquares(9527);
    }

    public static int sumOfSquares(int n) {
        // Write your solution here
        int sum = 0;
        for (int i = 1; i*i <=n; i++){
            sum += i * i;  // 参考答案
            //sum = i*i + sum;
        }
        return sum;
    }
}
