package BasicClass.Class6.Assignments;
/*
Sum of Squares (635)
Problem: Give an array list of integer, calculate the sum of squares of all its elements.
Note: return 0 if the list is null or empty.
Example: list = {1,2,3} → returns 14 (14=1*1+2*2+3*3)
[[-5,-4,-3,-2,-1]]
 */
import java.util.ArrayList;
import java.util.List;

public class SumOfSquare {
    public static void main(String[] agrs){
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(-5);
        newList.add(-4);
        newList.add(-3);
        newList.add(-2);
        newList.add(-1);


        System.out.println(sumOfSquare(newList));
    }

    public static int sumOfSquare(List<Integer> list){
        // Write your solution here
        if (list == null){
            return 0;
        }
        int sum = 0;
        for (int i : list){    //i获取的数组list中的每一元素的值，而不是数组下标
            sum += i * i;      // newList.get(4) = -1 = i;
        }
        return sum;
        /*
        int sum = 0;
        if (list == null || list.size() == 0){
            return 0;
        } else {
            for (int i = 0; i < list.size(); i++){
                int a = list.get(i);
                sum += a*a;
            }
        }
        return sum;
         */
    }
}
/*
这个list和array有很多不同的地方。list是java的interface，array是数据结构，由线性内存地址组成。
直白一点，如果array只能是一种数据类型，那么list可以包含多种东西的格式。
对于array，array长度表示为array.length, 要读取array中的元素时，方法为：array[#]
对于list，list长度的表示方式为list.size(), 要读取list中的元素时，方法为: list.get(#)
 */