package BasicClass.Class12.Assignments;

import java.util.Arrays;

/*
Partition(549)
Given an array, and a pivotIndex. Rearrange the array
so that the numbers smaller than array[pivotIndex] are on the left side of array[pivotIndex]
and numbers larger than array[pivotIndex] are on the right side of array[pivotIndex].
Assumption:
The array is not null or empty. pivotIndex is within the boundary of the array.

Example:
array = {9,4,6,2,0,1,7}
pivotIndex = 2
Result: {1, 4, 0, 2, 6, 9, 7}
 */
public class Ex2 {
    public static void main(String[] args){
        int[] array = new int[]{1,9,8,5,3};
        partition(array,3);
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[]{9,4,6,2,0,1,7};
        partition(array2,2);
        System.out.println(Arrays.toString(array2));

    }

    public static void partition(int[] array, int pivotIndex){
        int pivot = array[pivotIndex];
        // swap the pivot element to the rightmost position first
        swap(array, pivotIndex, array.length -1);
        int leftBound = 0;
        int rightBound = array.length -2;

        while(leftBound <= rightBound){
            if(array[leftBound] < pivot){
                leftBound++;
            } else{
                swap(array, leftBound, rightBound);
                rightBound--;
            }
        }
        // swap back to the pivot element.
        swap(array, leftBound, array.length -1);
    }

    private static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
    /*

    public static int[] partition(int[] array, int pivotIndex){
        int last = array.length -1;
        int pivot = array[pivotIndex];
        swap(array,pivotIndex,last);
        int j = array.length-2;
        int i = 0;
        while(i<=j){
            if(array[i] > pivot){
                swap(array,i,j);
                j--;
            } else{
                i++;
            }
        }
        swap(array,last,i);
        return array;
    }

    public static int[] swap(int[] array, int a, int b){
        int res = array[b];
        array[b] = array[a];
        array[a] = res;
        return array;
    }

     */
}
