package BasicClass.Class8.Assignments;
/*
Last Occurrence 16
Given a target integer T and an integer array A sorted in ascending order, find the index of
the last occurrence of T in A or return -1 if there is no such index.
Assumptions
- There can be duplicate elements in the array.

Examples
- A = {1, 2, 3}, T = 2, return 1
- A = {1, 2, 3}, T = 4, return -1
- A = {1, 2, 2, 2, 3}, T = 2, return 3

Corner Cases
- What if A is null or A is array of zero length? We should return -1 in this case.
[[7,7,7],7]
 */

public class ex3 {
    public static void main(String[] args){
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 2, 2, 3};
        int[] array3 = new int[]{7, 7, 7};
        System.out.println(lastOccur(array1, 2)); // 1
        System.out.println(lastOccur(array1, 4)); // -1
        System.out.println(lastOccur(array2, 2)); // 3
        System.out.println(lastOccur(array3, 7)); // 2
    }

    public static int lastOccur(int[] array, int target) {
        // Write your solution here.
        if (array == null || array.length ==0 ){
            return -1;
        }
        int left = 0;
        int right = array.length -1;
        while (left < right -1) {
            int mid = left + (right - left)/2;
            if (array[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (array[right] == target) {
            return right;
        } else if (array[left] == target) {
            return left;
        }
        return -1;
    }
        /*
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length -1;   // 777 right = 2
        while (left < right -1){       // 0 < 3-1=2
            int mid = left + (right - left)/2; // 0 + (3 -0)/2= 1
            if (array[mid] == target){
                left = mid;        // left =1
            } else if (array[mid] > target){
                right = mid;
            } else { // array[mid] < target
                left = mid;
            }
        }

        if (array[right] == target){ //
            return right;
        } else if (array[left] == target){
            return left;
        }

    return -1;
    }
         */
}


