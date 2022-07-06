package BasicClass.Class8.Assignments;

public class ex6_1  {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 7}, {8, 9, 10}};
        int[][] matrix1 = new int[][]{};
        int[] a = search(matrix, 7);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int[] b = search(matrix, 6);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        int[] c = search(matrix, 100);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

    public static int[] search(int[][] matrix, int target) {
        // Assumptions: matrix is not null, and has size N*M where N>=0 and M>=0.
        // return {-1, -1} if not found.
        // Method 1 (not recommended): find row first then find col.
        int[] result = new int[]{-1, -1};
        if (matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        // Find the possible row location for target.
        int row = findRow(matrix, 0, matrix.length - 1, target);
        if (row == -1) {
            return result;
        }
        // Find the possible col location in the row for target.
        int col = findCol(matrix[row], 0, matrix[row].length - 1, target);
        if (col == -1) {
            return result;
        }
        result[0] = row;
        result[1] = col;
        return result;
    }

    // Find the largest row with first element <= target
    private static int findRow(int[][] matrix, int up, int down, int target) {
        while (up <= down) {
            int mid = up + (down - up) / 2;
            if (matrix[mid][0] > target) {
                down = mid - 1;
            } else {
                up = mid + 1;
            }
        }
        return down;
    }

    // Classical binary search to find the col on the row.
    private static int findCol(int[] array, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
