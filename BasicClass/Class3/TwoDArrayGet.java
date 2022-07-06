package BasicClass.Class3;

public class TwoDArrayGet {
    public static void main(String[] args){
        int m = 4, n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                matrix[i][j] = 10 * i + j;
            }
        }
        System.out.println(matrix[2][3]);
    }
}
