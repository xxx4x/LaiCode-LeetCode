package BasicClass.Class10.Assignments;

import java.awt.*;

/*
Merge Two Sorted Arrays(547)
Given two sorted arrays, merge them into one sorted array.
Assumption: the two arrays are not null or empty.
Example:
array1 = {3,7}
array2 = {1,6,8,9}
answer = {1,3,6,7,8,9}
 */
public class Ex3 {
    public static void main(String[] args){
        int[] array1 = new int[]{3, 7};
        int[] array2 = new int[]{1, 6, 8, 9};
        int[] array3 = new int[]{0, 5, 5, 5, 8, 10};
        int[] array4 = new int[]{2, 3, 4, 4, 5, 7};
        int a = array1.length;
        int b = array2.length;
        int c = a+b;

        int[] mergearray = merge(array1, array2);
        for (int i = 0; i < c; i++ ){
            System.out.println(mergearray[i]);
        }
        System.out.println();
        int d = array3.length+array4.length;
        int[] mergearray2 = merge(array3, array4);
        for (int i = 0; i < d; i++ ) {
            System.out.println(mergearray2[i]);
        }
    }
    //array1 = {3,7}
    //array2 = {1,6,8,9}

    public static int[] merge(int[] one, int[] two){ // 参考答案

        int[] result = new int[one.length+two.length]; //6
        int i = 0, j = 0, k = 0;
        while (i < one.length && j<two.length){ // 0 < 2 && j< 4 //
            if (one[i]<=two[j]){        // one[0]=3 >= two[0]=1
                result[k] = one[i];
                i++;
            }else{
                result[k] = two[j];     // result[0] = two[0]=1
                j++;                    // j=1
            }
            k++;       // k=1;
        }
        //if we still have some elements at left side, we need to copy them
        while(i<one.length){
            result[k] = one[i];
            i++;
            k++;
        }
        // 因为两个array 长度会不一样 所以有个array会多出来
        // if we still have some elements at right side, we need to copy them
        while(j < two.length){
            result[k] = two[j];
            j++;
            k++;
        }
        return result;
    }

    /*


    public static int[] merge(int[] one, int[] two){
        // Write your solution here
        int a = one.length, b = two.length;
        int[] arraynew = new int[a+b];
        for (int i = 0; i<a; i++){
            arraynew[i] = one[i];
        }
        for (int j = 0; j< b; j++){
            arraynew[a+j] = two[j];
        }
        return selectionMerge(arraynew);
    }

    public static int[] selectionMerge(int[] array){ //3, 7, 1, 6, 8, 9
                 // min=3;
        for (int i =0; i < array.length-1; i++){   // 最后一个 可以不用 减不减答案一样 //   i=0, //1 ,// 2,// 3,// 4,// 5
            int min = array[i];
            for (int j = i+1; j< array.length; j++){   // j = 1 ;2; 3;4;5;// j=2,3,4,5
                if (array[j]<min){                     // 7>3; 1<3 *; 6>1;8>1;9>1//
                    swap(array,i,j);       // 1.(0,2)[1,7,3,6,8,9]
                    min = array[i];       // min=1;
                }
            }
        }
        return array;
    }

    public static int[] swap(int[] array, int left, int right){
        int sum = array[left];
        array[left] = array[right];
        array[right] = sum;
        return array;
    }
    */

}
