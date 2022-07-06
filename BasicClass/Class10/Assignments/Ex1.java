package BasicClass.Class10.Assignments;
/*
Find Index of Minimum Value (546)
Given an array, and a starting index “i”.
Find the index of the smallest value from index i (inclusive) to the end of the array.

Example:
array = {1, 9, 6, 8, 7}, i = 1 ⇒ return 2
array = {0, 3, 9, 8, 5, 4}, i = 2 ⇒ return 5

Assumption:
The array is not null or empty. i is within the boundary of the array.
[[3,5,1,2,4,8],5]
 */
public class Ex1 {
    public static void main(String[] args){
        int[] array1 = new int[]{1, 9, 6, 8, 7};
        int[] array2 = new int[]{0, 3, 9, 8, 5, 4};
        int[] array3 = new int[]{3, 5, 1, 2, 4, 8};
        System.out.println(minIndex(array1,1));
        System.out.println(minIndex(array2,2));
        System.out.println(minIndex(array3,5));

    }

    public static int minIndex(int[] array, int i){
        int minIndex = i;   // 参考答案
        for (int j = i+1; j< array.length; j++){
            if (array[minIndex] > array[j]){
                minIndex = j;
            }
        }
        return minIndex;
        /*
        int a = array.length;  //5
        int min = array[i];   // min = 9
        int minindex = i;
        for (int j = i; j < a;j++){ // j =1 ; i<5
            if (array[j]< min){
                min = array[j];
                minindex = j;
            }
        }
        return minindex;

         */
    }
}

