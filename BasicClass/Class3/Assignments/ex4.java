package BasicClass.Class3.Assignments;
/*
Reverse an array
Given an array, reverse all its elements.
Example: array = [2, 3, 5, 7, 11]
result: [11, 7, 5, 3, 2]
Assumption: The array is not null or empty.
[[123,1,3123,1023,344,31]]
 */
public class ex4 {
    public static void main(String[] args){
        int[] array = new int[]{123,1,3123,1023,344,31};
        reverse(array);
    }

    public static void reverse(int[] array){ // 参考答案
        int i = 0;
        int j = array.length - 1;
        while(i < j){
            swap(array, i, j);
            i++;
            j--;
        }
        for (int a = 0; a < array.length; a++){
            System.out.println(array[a]);
        }
    }
    private static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /*
    public static void reverse(int[] array){
        int j = array.length;
        for (int i = 0; i < j; i++){
            int rem = array[i];
            array[i] = array[j-1];
            array[j-1] = rem;
            j--;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

     */
}
