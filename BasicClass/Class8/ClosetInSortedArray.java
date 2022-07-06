package BasicClass.Class8;

public class ClosetInSortedArray {
    public static void main(String[] args){
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 4, 6};
        int[] array3 = new int[]{1, 3, 3, 4};
        System.out.println(closest(array1, 2)); // 1
        System.out.println(closest(array2, 3)); // 1
        System.out.println(closest(array2, 3)); // 1 or 2
        System.out.println(closest(array3, 2)); // return 0 or 1 or 2

    }
    public static int closest(int array[], int target){
        // corner case
        if (array == null || array.length ==0){
            return -1;
        }

        int left = 0;
        int right = array.length -1;
        while (left < right - 1){
            int mid = left + (right - left)/2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target){
                right = mid;
            } else { // array[mid] < target
                left = mid;
            }
        }
        // post process
        // [1, 3], target = 2
        // [1 -2 ]??? |3-2|
        if (Math.abs(array[left] - target) <= Math.abs(array[right] - target)){
            return left;
        }
        return right;
    }
}
