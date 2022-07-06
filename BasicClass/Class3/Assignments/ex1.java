package BasicClass.Class3.Assignments;
/*
Find Minimum
Given an array, return its minimum value. Example: array = [7, 3, 2], return 2
Note: if the array is null or empty, return 0.
[[5730,5614,5610,5380,5140,9431,1825,7166,4453,5782,1669,3921,3782,2477,4194,5405]]
 */
public class ex1 { // 参考答案
    public static void main(String[] args){
        int[] array = new int[]{5730,5614,5610,5380,5140,9431,1825,7166,4453,5782,1669,3921,3782,2477,4194,5405};
        System.out.println(min(array));
    }

    public static int min(int[] array){
        if (array == null || array.length ==0){
            return 0;
        }
        int m = array[0];
        for(int i =1; i < array.length; i++){
            m = array[i] < m? array[i]:m;
        }
        return m;
    }
    /*
    public static void main(String[] args){
        int[] array = new int[]{5730,5614,5610,5380,5140,9431,1825,7166,4453,5782,1669,3921,3782,2477,4194,5405};
        System.out.println(findminimum(array));
    }

    public static int findminimum(int[] array){
        int l = array.length;
        if (l == 0) {
            return 0;
        } else {
            int min = array[0];
            for (int i = 0; i < l; i++){
                int n = array[i];
                if (n < min){
                    min = array[i];
                }
            }
            return min;
        }
    }
     */
}
