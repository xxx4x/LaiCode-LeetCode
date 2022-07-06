package BasicClass.Class3;

public class classex1 {
    public static void main(String[] args){
        int[] array = new int[]{1,4,8,3,2};
        System.out.println(reverse(array)); // 乱码 print输出string的形式 不是array
        System.out.println();  // 空一行
        for (int i = 0; i <reverse(array).length; i++){
            System.out.println(reverse(array)[i]);
        }
    }
    public static int[] reverse(int[] array){
        /*
        int j = array.length;
        for (int i = 0; i <= j/2; i++ ){
            int num = array[i];
            array[i] = array[j-1];
            j--;
            array[j] = num;
        }
        return array;
         */
        int j = array.length-1;
        int i = 0;
        while(i < j){    // while: 当（）T 执行 否则stop
            int num = array[i];    // stop condition: i >= j => i <j
            array[i] = array[j];
            array[j] = num;
            i++;
            j--;
        }
        return array;
    }
}

/* 不能整个打印出array
打印出来的的是reference
print 不能打印出array， 它打的string
 */
