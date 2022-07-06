package BasicClass.Class3.Assignments;
/*
Sum of 2D array
Given a two-dimensional array, calculate the sum of all its elements
Example:
array = {{ 2, 3}, {4, 5}, {1, 0}}
Return 15
Assumption: The 2D array is not null or empty. The 2D array is rectangular shape.
[[[16,-7,10,-15]]]
 */
public class ex5 {
    public static void main(String[] args){
        int[][] array = new int[][]{{16,-7},{10,-15}};
        System.out.println(sum(array));
    }

    public static int sum(int[][] array) {
        // Write your solution here
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
}
