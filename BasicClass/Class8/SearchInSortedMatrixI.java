package BasicClass.Class8;

public class SearchInSortedMatrixI {
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

    public static int[] search(int matrix[][], int target){
        // corner case
        // [[],[],[]]
        if (matrix == null || matrix.length ==0 || matrix[0].length ==0){
            return new int[] {-1, -1};
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m*n -1;
        while( left <= right){
            int mid = left + (right - left)/2;
            int rowIndex = mid / n;
            int colIndex = mid % n;
            if (matrix[rowIndex][colIndex] == target){
                return new int[] {rowIndex, colIndex};
            } else if (matrix[rowIndex][colIndex] > target){
                right = mid -1;
            } else {// matrix[rowIndex][colIndex] < target
                left = mid + 1;
            }
        }
        return new int[] {-1, -1};
    }
}
