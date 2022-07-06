package BasicClass.Class12;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private Random random = new Random();
    public void quickSort(int[] array){
        // corner case;
        if (array == null || array.length <=1){
            return;
        }
        quickSort(array, 0, array.length-1);
    }
    private void quickSort(int[] array, int left, int right){
        // [left, right]
        // base case
        if (left >= right){
            return;
        }

        // pre-process
        // step 1. choose a pivot
        // goal: a random integer in [left, right]
        //       random.nextInt(x) -> a random integer in [0,x]
        //
        // [2, 3, 4, 5], left = 2, right = 5
        // 2 + random.nextInt(4);
        // random.nextInt(3) -> a random integer in [0,3] = [0,1,2]
        // [left; right] -> left + [0, right - left]
        //               -> left + [0, right - left + 1]
        int pivotIndex = left + random.nextInt(right - left + 1);
        swap(array, pivotIndex, right);
        // step 2. partition logic
        int i = left;
        int j = right - 1;
        while (i <= j){
            if (array[i]>= array[right]){
                swap(array,i,j);
                j--;
            } else{
                i++;
            }
        }
        // step 3. move this pivot back
        swap(array,i,right);
        // subproblem / recursive rule
        quickSort(array, left, i-1);
        quickSort(array, i+1, right);
    }

    public static void swap(int[] array, int x, int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void main(String[] args){
        int a[] = {1, 9, 8, 5, 3};
        System.out.println(Arrays.toString(a));
        QuickSort qs = new QuickSort();
        qs.quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}

