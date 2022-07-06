package BasicClass.Class3.Assignments;
/*
Swap two elements
Given an array, and two indices i and j. Swap the element at position i and element at position j.
Example: array = [7, 3, 2], i = 0, j = 2.     Swap such that the array becomes [2, 3, 7]
Assumption: The array is not null or empty. i and j are both valid indices within the range of the array.
[[3,45,23,32,98],3,2]
 */
public class ex3 {
    public static void main(String[] args){
        int[] array = new int[]{3,45,23,32,98};
        swap(array,0,2);
    }

    public static void swap(int[] array, int i, int j) {
        // Write your solution here
        int rem = array[i];
        array[i] = array[j];
        array[j] = rem;
        for (int a =0; a < array.length; a++){
            System.out.println(array[a]);
        }
    }
}
