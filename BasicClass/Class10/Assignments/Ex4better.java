package BasicClass.Class10.Assignments;

import java.util.Arrays;

public class Ex4better {
    public static void main(String[] args){
        Ex4better solution = new Ex4better();
        // test cases to cover possible situations.
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{1,2,3};
        int[] array3 = new int[]{3,2,1};
        int[] array4 = new int[]{4, 2, -3, 6, 1};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(solution.mergeSort(array1)));
        System.out.println();

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(solution.mergeSort(array2)));
        System.out.println();

        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(solution.mergeSort(array3)));
        System.out.println();

        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(solution.mergeSort(array4)));
    }
    public static int[] mergeSort(int[] array){
        // ex {4, 2, -3, 6, 1};
        // check null array first
        if (array == null){
            return array;
        }
        // allocate helper array to help merge step
        // so that we guarantee no more than O(n) space is used.
        // The space complexity is O(n) in this case.
        int[] helper = new int[array.length]; // { , , , , ,} 5
        mergeSort(array, helper, 0, array.length -1); // {4, 2, -3, 6, 1} , { , , , , } ,0, 4
        return array;
    }
    private static void mergeSort(int[] array, int[] helper, int left, int right){
        if (left>= right){
            return;
        }
        int mid = left + (right - left)/2; // 0 + (4-0)/2 = 0+2=2;
        mergeSort(array, helper, left, mid); // {4, 2, -3, 6, 1}, { , , , , }, 0, 2;
        mergeSort(array, helper, left, mid);
        merge(array,helper, left, mid, right);
    }
    private static void merge(int[] array, int[] helper, int left, int mid, int right){
        // copy the content to helper array and we will merge from the
        // helper array.
        // {4, 2, -3, 6, 1}, { , , , , }, 0, 2;
        for (int i = left; i <= right; i++){ // i= 0; i <= 2
            helper[i] = array[i];            // helper:{4, 2, -3,6,1}
        }
        int leftIndex = left;        // 0
        int rightIndex = mid + 1;     // 3
        while (leftIndex <= mid && rightIndex <=right){ //  0 <=2 3 <= 4
            if (helper[leftIndex] <= helper[rightIndex]){ // helper[0] = 4 <= helper[4] = 6 //
                array[left++] = helper[leftIndex++];    // array[1] = 2  = helper[1] =2  //
            } else {
                array[left++] = helper[rightIndex++];
            }
        }
        // if we still have some elements at left side, we need to copy them
        while (leftIndex <= mid){                    // 0 <= 2
            array[left++] = helper[leftIndex++];
        }
        // if there are some elements at right side, we do not need to copy them
        // because they are already in their position.
    }
}
