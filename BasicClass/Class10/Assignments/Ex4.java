package BasicClass.Class10.Assignments;

import java.util.Arrays;

/*
Merge Sort(9)
Given an array of integers, sort the elements in the array in ascending order. The merge sort algorithm should be used to solve this problem.
Examples
- {1} is sorted to {1}
- {1, 2, 3} is sorted to {1, 2, 3}
- {3, 2, 1} is sorted to {1, 2, 3}
- {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}

Corner Cases
- What if the given array is null? In this case, we do not need to do anything.
- What if the given array is of length zero? In this case, we do not need to do anything.
 */

public class Ex4 {
    public static void main(String[] args){
        int[] array1 = new int[]{1};
        int[] array2 = new int[]{1,2,3};
        int[] array3 = new int[]{3,2,1};
        int[] array4 = new int[]{4, 2, -3, 6, 1};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(mergeSort(array1)));
        System.out.println();

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(mergeSort(array2)));
        System.out.println();

        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(mergeSort(array3)));
        System.out.println();

        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(mergeSort(array4)));


    }

    // 参考答案
    public static int[] mergeSort(int[] array){
        // check null array first
        if (array == null || array.length <=1){
            return array;
        }
        return mergeSort(array, 0, array.length-1);
    }
    private static int[] mergeSort(int[]array, int left, int right) {
        if (left == right){
            return new int[]{array[left]};
        }
        int mid = left + (right - left)/2;
        int[] leftResult = mergeSort(array, left, mid);
        int[] rightResult = mergeSort(array, mid + 1, right);
        return merge(leftResult, rightResult);
    }
    private static int[] merge(int[] leftResult, int[] rightResult){
        int[] result = new int[leftResult.length + rightResult.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < leftResult.length && rightIndex < rightResult.length){
            if (leftResult[leftIndex] <= rightResult[rightIndex]){
                result[resultIndex] = leftResult[leftIndex];
                leftIndex++;
            }else {
                result[resultIndex] = rightResult[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }
        while(leftIndex < leftResult.length){
            result[resultIndex] = leftResult[leftIndex];
            resultIndex++;
            leftIndex++;
        }
        while(rightIndex < rightResult.length){
            result[resultIndex] = rightResult[rightIndex];
            resultIndex++;
            rightIndex++;
        }
        return result;
    }

   /*
    private static int[] mergeSort(int[] array){
        if (array == null || array.length==0){
            return array;
        }

        int[] result = mergeSort(array, 0, array.length-1);
        return result;
    }


    private static int[] mergeSort(int[] array, int left, int right){
        if (left == right) {
            return new int[]{array[left]};
        }

        int mid = left + (right - left)/2;
        int[] leftResult = mergeSort(array, left, mid);
        int[] rightResult = mergeSort(array, mid+1, right);

        int[] Result = merge(leftResult, rightResult);
        return Result;
    }

    private static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while( i < left.length && j < right.length){
            if (left[i] < right[j]){
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            result[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }

     */

}
