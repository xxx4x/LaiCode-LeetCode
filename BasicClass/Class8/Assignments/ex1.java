package BasicClass.Class8.Assignments;
/*
Classical Binary Search
Given a target integer T and an integer array A sorted in ascending order, find the index i such that A[i] == T or return -1 if there is no such index.
**Assumptions**
- There can be duplicate elements in the array, and you can return any of the indices i such that A[i] == T.
**Examples**
- A = {1, 2, 3, 4, 5}, T = 3, return 2
- A = {1, 2, 3, 4, 5}, T = 6, return -1
- A = {1, 2, 2, 2, 3, 4}, T = 2, return 1 or 2 or 3
**Corner Cases**
- What if A is null or A is of zero length? We should return -1 in this case.

[[3,4,5,6,6,9,16],5]
 */

public class ex1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{1, 2, 2, 2, 3, 4};
        int[] array3 = new int[]{3, 4, 5, 6, 6, 9, 16};
        System.out.println(binarySearch(array1, 3)); //2
        System.out.println(binarySearch(array1, 6)); // -1
        System.out.println(binarySearch(array2, 2)); //1 or 2 or 3
        System.out.println(binarySearch(array3, 5)); // 2
    }

    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {    // 参考答案
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left);
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

    /*{

        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target){
                right = mid -1;
            } else { // array[mid] < target
                left = mid + 1;
            }
        }

        return -1;

    }

         */

