package BasicClass.Class11.Assignments;
/*
[Debug] Find Minimum(745)
**There are bugs in the given code, please fix them.**
Given an array, return its minimum value
Example:
array = [7, 3, 2], return 2

Note: if the array is null or empty, return 0.
[[5730,5614,5610,5380,5140,9431,1825,7166,4453,5782,1669,3921,3782,2477,4194,5405]]
 */
public class Ex4 {
    public static int min(int[] array) {
        int minNumber = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < minNumber){
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public static void main(String[] args){
        int[] array1 = new int[]{7, 3, 2};
        System.out.println(min(array1));
        int[] array2 = new int[]{5730,5614,5610,5380,5140,9431,1825,7166,4453,5782,1669,3921,3782,2477,4194,5405};
        System.out.println(min(array2));
    }
}
