package BasicClass.Class3;
/*
Calculate the sum of two matrix
4 8    +   1  0    =  4 + 1   8 + 0
3 7        5  2       3 + 5   7 + 2


 */

public class QuizTwoDArray2 {
    public static void main(String[] args){
        int[][] matrix1 = new int[][]{{4, 8}, {3, 7}};
        int[][] matrix2 = new int[][]{{1, 0}, {5, 2}};
        matrixSum(matrix1, matrix2);
        for (int i =0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                System.out.println(matrixSum(matrix1,matrix2)[i][j]);
            }
        }
    }

    public static int[][] matrixSum(int[][] mat1, int[][] mat2) { //参考答案
        int row = mat1.length;
        int col = mat1[0].length;
        int[][] result = new int[row][col];
        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                result[r][c] = mat1[r][c] + mat2[r][c];
            }
        }
        return result;
    }
    /*
    public static int[][] matrixSum(int[][] matrix1, int[][] matrix2){
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++)
            {
                matrix[i][j]= matrix1[i][j] + matrix2[i][j];
            }

        }
        return matrix;

    }

     */


}
