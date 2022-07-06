package BasicClass.Class11.Assignments;
/*
744. [Debug] Remove duplicate element from array
There are bugs in the given code, please fix them.
Given a 1D array and a known duplicate element (which appears more than once), remove the duplicate element and return the result array.
Input: array = [2, 3, 3, 4, 5], duplicate = 3
Output: [2, 4, 5]
Assume
(1) the input array is not null or empty
(2) the duplicate element always exists in the input array and there is only one duplicate element.
[[51,71,29,31,30,91,91,64,2,91],91]
 */
public class Ex3 {
    public static void main(String[] args){
        int[] array = new int[]{2, 3, 3, 4, 5};
        int[] a = removeDuplicate(array,3);
        for (int i = 0; i< a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println();
        int[] array1 = new int[]{51,71,29,31,30,91,91,64,2,91};
        int[] b= removeDuplicate(array1,91);
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }

    public static int[] removeDuplicate(int[] array, int duplicate){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == duplicate) {
                count++;
            }
        }
        int[] result = new int[array.length - count];
        int i = 0;
        int j = 0;
        while (i < array.length) {
            if (array[i] == duplicate) {
                i++;
            } else {
                result[j] = array[i];
                i++;
                j++;
            }
        }
        return result;
    }
}

