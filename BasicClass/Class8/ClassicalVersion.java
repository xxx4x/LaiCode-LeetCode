package BasicClass.Class8;
// Classical Version 1.0
// return any target element's index
public class ClassicalVersion {
    public static void main (String[] args){
        int[] a = new int[]{1,2,4,6};
        binarySearch(a, 4);

    }
    public static int binarySearch (int[] a, int target){
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {           // [L, R]  left < right WRONG
            //int mid = left + (left - right)/2;
            int mid = left + (right-left)/2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1; // left = mid WRONG
            }
        }
        return -1;
    }
}
/*
常见错误： 如果写成 int mid = left + (left - right)/2;
会产生报错样例如下， 表示数组越界：
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 4
	at Class8.ClassicalVersion.binarySearch(ClassicalVersion.java:16)
	at Class8.ClassicalVersion.main(ClassicalVersion.java:7)

常见错误：如果mid的更新写到while之外，则会导致死循环
 */