package BasicClass.Class8;

public class FirstOccur {
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

    public static int firstOccur(int array[], int target) {
        // corner case
        if (array == null || array.length ==0){
            return -1;
        }
        int left = 0;
        int right = array.length -1;  // array4 = 5
        while (left < right -1) { //[L, R] only contains two elements <=> L = R -1 //0 < 4// 0 < 1 // 0<=0
            int mid = left + (right -left)/2; //0 + (5-0)/2 = 0+2=2 // 0 + (2-0)/2 = 1
            if (array[mid] >= target ){   //[2] =2  // array[1] = 2
                right = mid;     // right = 2     // right = 1
            } else { // array[mid] < target
                left = mid;
            }
        }
        // post process
//        if ( array[left] == target){
//            return left;
//        }
//       if (array[right] == target){
//            return right;
//        }
//        return -1;

        if (array[left] == target) {   // array[0] = 1 != 2
            return left;
        } else if (array[right] == target){  // array[1] =2
            return right;
        } else {
            return -1;
        }
    }
}
