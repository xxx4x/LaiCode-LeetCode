package BasicClass.Class3;

public class GetAnElement {
    public static void main(String[] args){
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i * 10;
        }
        System.out.println(arr[5]);
    }
}
