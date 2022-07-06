package BasicClass.Class3;

/*
Calculate the trace of a matrix (the sum of all diagonal elements)
      5, 3, 5
tr =  4,-1, 2 = 5 - 1 + 7 = 11
     -3, 8, 7
 */
public class QuizTwoDArray1 {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{5, 3, 5}, {4, -1, 2}, {-3, 8, 7}};
        System.out.println(trace(matrix));

    }
    public static int trace(int[][] matrix){
        /*
        int l = matrix.length;
        int p = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < p; i++){
            sum += matrix[i][i];
        }
        return sum;

         */
        int trace = 0;
        for (int r = 0; r < matrix.length; r++) {
            trace += matrix[r][r];
        }
        return trace;    // 参考答案
    }
}
