package BasicClass.Class3;

public class classex {
    public static void main(String[] args){
        int[] arr = new int[]{4, 20, 7, 5, 10};
        findMax(arr);
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i =0; i < arr.length; i++){
            if(arr[i] > arr[0] ){
                max = arr[i];
            }
        }return max;
    }

}
