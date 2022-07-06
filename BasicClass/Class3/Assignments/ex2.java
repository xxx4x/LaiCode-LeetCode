package BasicClass.Class3.Assignments;
/*
Compute Sum
Given an array, return sum of all elements. Example: array = [7, 3, 2], return 12
Note: if the array is null or empty, return 0.
[[432,186,275,662,711,502,770]]
 */
public class ex2 {
    public static void main(String[] args){
        int[] array = new int[]{432,186,275,662,711,502,770};
        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        // Write your solution here 参考答案
        if (array == null || array.length == 0){
            return 0;
        }
        int s = 0;
        for (int x: array){
            s+=x;
        }
        return s;
        /*
        int l = array.length;
        if (l == 0){
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < l; i++){
                sum += array[i];
            }
            return sum;

         */
    }
}
