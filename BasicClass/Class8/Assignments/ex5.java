package BasicClass.Class8.Assignments;
/*
Find the Sth Element in The Matrix (561)
Given a matrix, find the Kth index element.
example:
matrix:
1 3 4
5 6 7
8 9 10
k = 4 → return: 6
[[[6,-8],[-10,-11],[5,4],[16,-16]],2]
 */
public class ex5 {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1, 3, 4},{5, 6, 7},{8, 9, 10}};
        int[][] matrix2 = new int[][]{{6, -8}, {-10, -11},{5,4},{16,-16}};
        System.out.println(findElement(matrix,4));
        System.out.println(findElement(matrix2,2));

    }

    public static int findElement(int[][] matrix, int k){
        int row = k/matrix[0].length;
        int col = k % matrix[0].length;
        return matrix[row][col];
        /*
        int row = matrix.length -1;
        int col = matrix[0].length -1;
        int n = (row+1) * (col+1);
        int[] array = new int[n];
        int q = 0;
        for (int i = 0; i <=row; i++){
            for (int j =0; j<= col; j++){
                array[q] = matrix[i][j];
                q++;
            }
        }
        return array[k];


         */
    }
}
