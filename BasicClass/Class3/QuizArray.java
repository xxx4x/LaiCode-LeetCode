package BasicClass.Class3;
/*
Input: -3 1 -1 5 10
Output: 10
 */
public class QuizArray {
    public static void main(String[] args){
        int[] arr = new int[]{-3,1,-1,5,10};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
