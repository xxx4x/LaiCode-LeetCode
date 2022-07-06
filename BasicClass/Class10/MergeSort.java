package BasicClass.Class10;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] a = {5, 2, 7, 4, 1, 3, 8, 6};
        MergeSort solution = new MergeSort();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(solution.mergeSort(a)));
    }

    public static int[] mergeSort(int[] array){  // {5, 2, 7, 4, 1, 3, 8, 6}
        // corner case
        if (array == null || array.length <= 1){
            return array;
        }

        return mergeSort(array, 0, array.length-1); // {5, 2, 7, 4, 1, 3, 8, 6}, 0, 7//
    }
    // {5, 2, 7, 4, 1, 3, 8, 6}
    private static int[] mergeSort(int[] array, int left, int right){
        // base case
        if (left == right){
            return new int[] {array[left]};
        }

        // subproblem
        int mid = left + (right - left)/2;  // mid = 0+(7-0)/2 =3
        int[] leftResult = mergeSort(array, left, mid); // [5 2 7 4]
        int[] rightResult = mergeSort(array, mid + 1, right); // [1 3 8 6]

        // recursive rule
        return merge(leftResult, rightResult); //
    }

    private static int[] merge(int[] leftResult, int[] rightResult){
        //[2 4 5 7],[ 1 3 6 8] -> [1 2 3 4 5 6 7 8]
        int[] result = new int[leftResult.length + rightResult.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftResult.length && j < rightResult.length){
            if (leftResult[i] > rightResult[j]){
                result[k] = rightResult[j];
                j++;
            } else{
                result[k] = leftResult[i];
                i++;
            }
            k++;
        }
        // case1. left result has some not merged, right result doesn't
        // case2. right result has some not merged, left resule doesn't
        // [X] case3. both result are empty?
        // [X] case4. both result have some not merged?

        while(i < leftResult.length){
            result[k] = leftResult[i];
            i++;
            k++;
        }
        while(j < rightResult.length){
            result[k] = rightResult[j];
            j++;
            k++;
        }
        return result;
    }
}
