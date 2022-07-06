package BasicClass.Class10.Assignments;
/*
Selection Sort(4)

Given an array of integers, sort the elements in the array in ascending order.
The selection sort algorithm should be used to solve this problem.

Examples
- {1} is sorted to {1}
- {1, 2, 3} is sorted to {1, 2, 3}
- {3, 2, 1} is sorted to {1, 2, 3}
- {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}

Corner Cases
- What if the given array is null? In this case, we do not need to do anything.
- What if the given array is of length zero? In this case, we do not need to do anything.
[[3,5,1,2,4,8]]
 */

public class Ex2 {
    public static void main(String[] args){
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{3, 2, 1};
        int[] array3 = new int[]{4, 2, -3, 6, 1};
        int[] array4 = new int[]{3, 5, 1, 2, 4, 8};
        for (int i = 0; i < array1.length; i++){
            System.out.println(solve(array1)[i]);
        }
        for (int i = 0; i < array2.length; i++){
            System.out.println(solve(array2)[i]);
        }
        for (int i =0; i < array3.length; i++){
            System.out.println(solve(array3)[i]);
        }

    }
    public static int[] solve(int[] array){ // 参考答案
        // check null before any other things.
        // check other conditions - empty array ... etc.
        if (array == null || array.length==0 ){
            return array;
        }
        for (int i = 0; i < array.length-1; i++){// i不需要走完全部 最后一个就是最大的
            int min = i;
            // find the min element in the subarray of (i, array.length -1)
            for (int j = i + 1; j < array.length; j++){
                if (array[j]<array[min]){
                    min = j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }

    public static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}

