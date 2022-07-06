package BasicClass.Class8;
import java.util.*;
public class Test {
    public static void main(String[] args){
        int[] array = {3, 4, 7};
        System.out.println();
    }
}

class Solution {
    // Time O (log n)
    // Space O (1)
    public int binarySearch(int[] array, int target){
        if (array == null || array.length ==0){
            return -1;
        }
        int l = 0, r = array.length -1;
        while (l <=r ){
            int m = l + (r -l)/2;
            if (target == array[m]){
                r = m -1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
    // Time O(log n)
    // Space O(1)
    public int firstOccur(int[] array, int target){
        if (array == null || array.length ==0) {
            return -1;
        }
        int l = 0, r = array.length - 1;
        while (l < r -1 ){
            int m = l + (r -l)/2;
            if (target <= array[m]){
                r = m;
            } else{
                l = m;
            }
        }
        if (target == array[l]) {
            return l;
        }
        if (target == array[r]){
            return r;
        }
        return -1;
    }
    // Time O(log n)
    // Space O(1)
    public int lastOccur(int[] array, int target){
        if (array == null || array.length ==0){
            return -1;
        }
        int l = 0, r = array.length -1;
        while (l < r -1){
            int m = l + (r -1) /2;
            if (target < array[m]){
                r = m;
            } else {
                l = m;
            }
        }
        if (target == array[r]){
            return r;
        }
        if (target == array[l]){
            return l;
        }
        return -1;

    }
}

