package BasicClass.Class9;


public class Test {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        for (int i = 0; i < 20; i++){
            System.out.println("Fibo(" + i + ")=" + sol.fibo(i) + " ");
        }
    }
}

class Solution2{
    public static long fibo(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
