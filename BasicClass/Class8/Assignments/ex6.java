package BasicClass.Class8.Assignments;
/*
**Search In Sorted Matrix I**
Given a 2D matrix that contains integers only, which each row is sorted in an ascending order.
The first element of next row is larger than (or equal to) the last element of previous row.

Given a target number, returning the position that the target locates within the matrix.
If the target number does not exist in the matrix, return {-1, -1}.

Assumptions:
- The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0.
Examples:
matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} }
target = 7, return {1, 2}
target = 6, return {-1, -1} to represent the target number does not exist in the matrix.
 */
public class ex6 {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 7}, {8, 9, 10}};
        int[][] matrix1 = new int[][]{};
        int[] a = search(matrix, 7);
        for(int i = 0; i <a.length; i++){
            System.out.println(a[i]);
        }
        int[] b = search(matrix, 6);
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        int[] c = search(matrix, 100);
        for (int i =0; i< c.length; i++){
            System.out.println(c[i]);
        }
    }

    public static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int num = row * col;
        int[] array = new int[2];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j]==target){
                    array[0]=i;
                    array[1]=j;
                    return array;
                }
            }
        }
        array[0] = -1;
        array[1] = -1;
        return array;
    }


}
