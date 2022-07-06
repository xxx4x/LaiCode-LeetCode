package BasicClass.Class10;

import java.util.Arrays;

/*
array1 = {3,7}
array2 = {1,6,8,9}
answer = {1,3,6,7,8,9}
 */
public class Merge {
    public static void main (String[] args){
        int[] array1 = new int[] {3, 7};
        int[] array2 = new int[] {1, 6, 8, 9};
        int[] result = merge(array1, array2);
        System.out.println(Arrays.toString(result));

    }

    private static int[] merge(int[] leftResult, int[] rightResult){
        int[] result = new int[leftResult.length + rightResult.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftResult.length && j < rightResult.length){
            if (leftResult[i] > rightResult[j]){
                result[k] = rightResult[j];
                j++;
            } else {
                result[k] = leftResult[i];
                i++;
            }
            k++;
        }
        while(i < leftResult.length){
            result[k]  = leftResult[i];
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
