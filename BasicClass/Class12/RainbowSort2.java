package BasicClass.Class12;

import java.util.Arrays;

public class RainbowSort2 {
    public void rainbowSort(int[] array){
        // corner case
        if (array == null|| array.length ==0){
            return;
        }

        int i = 0;
        int j = 0;
        int k = array.length -1;
        while(j <= k){
            if (array[j] == 1) { // array[j].gpa<3
                // red
                swap(array,i,j);
                i++;
                j++;
            } else if (array[j] == 2){ // array[j].gpa ==3
                // yellow
                j++;
            } else {
                // blue // array[j].gpa >3
                swap(array, j, k);
                k--;
            }
        }
    }
    public void swap(int[] array, int x, int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void main(String[] args){
        int a[] = {3, 2, 1, 2, 3, 3, 2, 2, 1,3};
        RainbowSort2 rs = new RainbowSort2();
        rs.rainbowSort(a);
        System.out.println(Arrays.toString(a));
    }
}
/*
常见问题
1）为什么while循环是j<=k，可不可以j<k?
2) 为什么其中两种情况要swap元素，一种不需要swap？
注意物理定义，当当前处理元素在最左边的一段或者最右边一段时，必须要swap，因为
    a.逻辑上最左边的一段和待探索区域之间还有第二段内容
    b.最右边的一段和待探索区域最左端还有未处理的探索元素
3） 为什么k--的时候不需要j++,而i++的时候j++？
参考上一个问题关于物理意义的概念
 */
