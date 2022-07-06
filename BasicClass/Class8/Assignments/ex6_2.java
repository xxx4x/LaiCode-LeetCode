package BasicClass.Class8.Assignments;

// Method 2 (better): convert the 2D array to 1D array and do binary search.
public class ex6_2 {
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
        if (matrix.length == 0 || matrix[0].length==0){
            return new int[]{-1, -1};
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        // Covert the 2D array to 1D array with row*cols elements.
        int right = rows * cols -1;
        while(left<= right){
            int mid = left + (right - left)/2;
            // convert the position in 1D array back to row and col in 2D array.
            int row = mid/ cols;
            int col = mid% cols;
            if (matrix[row][col] == target){
                return new int[] {row, col};
            } else if (matrix[row][col] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return new int[] {-1, -1};
    }
}
