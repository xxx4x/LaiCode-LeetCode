package BasicClass.Class12;

import java.util.Arrays;

/*
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
public class RainbowSort {
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
     0  1  2   3  4
    {-1, 0, 0, 1, 1}
         a
            b
               c
index     0 1 2 3  4 5 6
          -1,-1,0,0,1,1,1
                a
                    b
                  c
     */
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
}
