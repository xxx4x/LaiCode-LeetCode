package BasicClass.Class11.Assignments;

public class Ex1 {
    public static int firstOccur(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right -1) {       //[3,3](0,1) <---------
            int mid = left + (right - left) / 2; //mid = 1     |
            if (array[mid] >= target) right = mid; // (0,1) ---
            else left = mid;
        }
        if (array[left] == target) return left;
        if (array[right] == target) return right;
        return -1;
    }

    public static void main(String[] args){
        int[] array = new int[]{2,4,7,5,5,5,9};
        System.out.println(firstOccur(array,5));
    }
}
