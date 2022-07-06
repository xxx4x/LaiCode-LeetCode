package BasicClass.Class8;

public class BinarySearch {
    public static void main(String[] args){
        int[] array = new int[]{1, 2, 4, 5, 7, 8, 9};
        System.out.println(binarySearch(array, 4));
        System.out.println(binarySearch(array, 3));

    }
    public static int binarySearch(int array[], int target){
        // corner case
        if (array == null || array.length == 0) {
            return -1;
        }

        int left = 0;
        int right = array.length -1;
        while (left <= right){
            //Overflow
            // Maxint: 2^31 - 1 = 2.18
            //
            // (left + right)/2 ;
            // array.length = 2 ^31 -1
            // Iter 0: left = 0, right = 2^31 - 1, mid = 2^30 -1
            // Iter 1: left = 2^30 -1, right = 2^31 -1
            //
            // 1. right - left: SAFE.
            // 2. (*) / 2 : SAFE
            // 3. left + (*): SAFE
            //    left + (*) <= left + (right - left) = right
            //
            // left / 2 + right /2 . L = 3, R = 5
            // (left + right) / 2 =4
            // left/ 2 + right /2 = 1 + 2 = 3
            //
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target){
                // [1, 2], target = 2;
                // left = 0, right = 1, mid = 0;
                // New iteration: left = 0, right =1
                left = mid + 1;
            } else{//array[mid] > target
                right = mid -1; }
        }
        return -1;
    }
}
