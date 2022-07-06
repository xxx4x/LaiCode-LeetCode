package BasicClass.Class12;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {
    private Random random = new Random();
    public void quickSort(int[]  array){
        // corner case
        if (array == null || array.length <= 1){
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int left, int right){
        // [left, right]
        // base case
        if (left >= right){
            return;
        }

        // pre-process
        // step 1. choose a pivot
        // goal: a random integer in [left, right]
        //       random.nextInt(x) -> a random integer in [0,x)
        //
        // [2, 3, 4, 5], left = 2, right =5
        // 2 + random.nextInt(4)
        // random.nextInt(3) -> a random integer in [0,3) = [0, 1, 2]
        //[left, right] -> left + [0, right -left]
        //              -> left + [0, right - left +1]
        int pivotIndex = left + random.nextInt(right - left + 1);
        swap(array,pivotIndex, right);
        // step 2. partition logic
        int i = left;
        int j = right - 1;
        while(i <= j){
            if(array[i]>= array[right]){
                swap(array,i,j);
                j--;
            } else {
                i++;
            }
        }
        // step 3.move the pivot back
        swap(array,i,right);
        // subproblem / recursive rule
        quickSort(array, left, i-1);
        quickSort(array, i+1, right);
    }

    public void swap(int[] array, int x, int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void main(String[] args){
        int a[] = {1,9,8,5,3};
        System.out.println(Arrays.toString(a));
        QuickSort2 qs = new QuickSort2();
        qs.quickSort(a);
        System.out.println(Arrays.toString(a));
    }

}


/*
常见问题：
1）为什么有两个quickSort？
method overloading. 函数名字相同，但parameter type list不同的functions.
2) Random 是什么？
随机数生成的工具类，在本例中用于生成指定范围内均匀分布的整数随机数
3）rand.nextInt(right-left+1)表示什么意思
rand类型为Random, 该实例的方法nextInt(x) 表示产生一个范围[0, x-1]的均匀分布的随机整数，所以nextInt(right-left+1)
表示产生范围[0, right-left]的均匀分布的随机整数。
参考程序中的代码
int pivotIndex = left + random.nextInt(right-left+1);
pivotIndex实际随机数范围为[left, right].
4) 为什么是i <= j, i < j可不可以？
中间为探索区域由挡板i和j定义为[i,j]即i==j时仍存在一个未处理元素要检查。若i<j则无法对最后一个元素做检查。
5）Partition之后i和j分别停在哪儿？
i在j的右边第一个
6）为什么开始pivot跟right交换？为什么不跟left交换
可以选择和left交换，两边都是可以的
7）为什么最后right要和i交换，和j交换可不可以？
i在j的右边第一个，如果与j交换则会将一个小于pivot的值交换到右侧。
 */