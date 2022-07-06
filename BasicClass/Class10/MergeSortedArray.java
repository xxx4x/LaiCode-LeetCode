package BasicClass.Class10;
import java.util.Arrays;
public class MergeSortedArray {

    public static void main(String[] args){
        int[] nums1 = new int[]{1, 2, 3, 0, 0,0};
        int[] nums2 = new int[]{2,5,6};
        System.out.println(Arrays.toString(merge(nums1,3,nums2,3)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if (nums1[i] < nums2[j]){
                result[k] = nums1[i];
                i++;
            } else{
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            result[k] = nums1[i];
            k++;
            i++;
        }
        while(j < n){
            result[k] = nums2[j];
            k++;
            j++;
        }
        return result;
    }
}
