package BasicClass.Class12.Assignments;
import java.util.Arrays;

/*
Rainbow Sort 11
Given an array of balls, where the color of the balls can only be Red,
Green or Blue, sort the balls such that all the Red balls are grouped on the left side,
all the Green balls are grouped in the middle and all the Blue balls are grouped on the right side.
(Red is denoted by -1, Green is denoted by 0, and Blue is denoted by 1).

Examples
{0} is sorted to {0}
{1, 0} is sorted to {0, 1}
{1, 0, 1, -1, 0} is sorted to {-1, 0, 0, 1, 1}

Assumptions
The input array is not null.

Corner Cases
What if the input array is of length zero? In this case, we should not do anything as well.
 */
public class Ex4 {
    public static void main(String[] args){
        int[] array1 = new int[]{0};
        int[] array2 = new int[]{1, 0};
        int[] array3 = new int[]{1, 0, 1, -1, 0};
        int[] array4 = new int[]{1,1,0,-1,0,1,-1};
        int[] result1 = rainbowSort(array1);
        System.out.println(Arrays.toString(result1));

        int[] result2 = rainbowSort(array2);
        System.out.println(Arrays.toString(result2));

        int[] result3 = rainbowSort(array3);
        System.out.println(Arrays.toString(result3));

        int[] result4 = rainbowSort(array4);
        System.out.println(Arrays.toString(result4));


    }
    /*
    Assumption:
    1) we hava three colors denoted as -1, 0, 1 and all the elements in the array are valid.
     */
    // 参考答案
    public static int[] rainbowSort(int[] array){
        if (array == null || array.length <= 1){
            return array;
        }
        // three bounds:
        // 1. the left side of neg is -1 (exclusive of neg).
        // 2. the right side of one is 1 (exclusive of one).
        // 3. the part between neg and zero is 0 (exclusive of zero)
        // 4. between zero and one is to be discoverd. (inclusive of both).
        int neg = 0;
        int one = array.length -1;
        int zero = 0;
        while (zero <= one){
            if (array[zero] == -1){
                swap(array, neg++, zero++);
            } else if (array[zero] == 0){
                zero++;
            } else {
                swap(array, zero, one--);
            }
        }
        return array;
    }
    private static void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    /*
    public static int[] rainbowSort(int[]array){
        if (array == null || array.length == 0){
            return array;
        }
        int a = 0;
        int b = 0;
        int c = array.length-1;
        while(b <= c){
            if (array[b] == -1){
                swap(array,b,a);
                a++;
                b++;
            }else if (array[b] == 0){
                b++;
            }else {
                swap(array,b,c);
                c--;
            }
        }
        return array;

    }
    public static void swap(int[] array, int x, int y){
        int rem = array[x];
        array[x] = array[y];
        array[y] = rem;
    }

     */
}

