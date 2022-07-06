package BasicClass.Class8.Assignments;
/*
Given a target integer T and an integer array A sorted in ascending order, find the index of the first occurrence of
T in A or return -1 if there is no such index.
**Assumptions**
- There can be duplicate elements in the array.
**Examples**
- A = {1, 2, 3}, T = 2, return 1
- A = {1, 2, 3}, T = 4, return -1
- A = {1, 2, 2, 2, 3}, T = 2, return 1
**Corner Cases**
- What if A is null or A of zero length? We should return -1 in this case.
 */
public class ex2 {
    public static void main(String[] args){
        int[] array = new int[]{1, 2, 3};
        System.out.println(firstOccur(array, 2));
        System.out.println(firstOccur(array,4));
        int[] array1 = new int[]{1, 2, 2, 2, 3};
        System.out.println(firstOccur(array1,2));
        int[] array3 = new int[]{3, 4, 5, 6, 6, 9, 16};
        System.out.println(firstOccur(array3,3));
        int[] array4 = new int[]{1, 2, 2, 2, 5, 8};
        System.out.println(firstOccur(array4,2));
    }

    public static int firstOccur(int[] array, int target){
        // corner case

        if (array == null || array.length == 0){
            return -1;
        }

        int left = 0;
        int right = array.length -1; // 5
        // We need to use left< right -1 here to make sure there is no infinite loop.
        // Think about the case when left == right -1.
        // then mid == left, it will be possible picking [mid, right] for the next round
        // and it will go into an infinite loop in that case.
        while (left < right -1) {
            int mid = left + (right - left)/2;  // 0+（5-0）/2 = 2 // 0+(2)/2 =1
            if (array[mid] >= target) {   // 2 >=2  // 2 =2
                right = mid;      // right = 2; left =0;// right =1
            } else {
                left = mid;
            }
        }
        // Make sure you understand all the possible situations when entering
        // this postprocessing procedure.
        // 1. array has only 1 element.
        // 2. array has only 2 element.
        // 3，left == right - 1 and left is the result
        // 4. left == right - 1 and right is the result
        // 5. left == right - 1 and none of left, right is the result.
        if (array[left] == target){    // [0] =1
            return left;              //
        } else if (array[right] == target){  // [1]=2 =2
            return right; //1
        }
        return -1;

        /*
        if (array == null || array.length == 0){
            return -1;
        }

        int left = 0;
        int right = array.length -1;
        while (left <= right){     // [L, R] only contains two elements <=> L = R - 1
            int mid = left + (right - left)/2;
            if (array[mid] == target ){
                if (mid-1 >=0 && array[mid-1] == target){
                    right = mid -1;
                } else {
                    return mid;
                }
            } else if (array[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

         */
    }
}
