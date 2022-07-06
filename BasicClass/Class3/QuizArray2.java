package BasicClass.Class3;
/*
Given an array, and an element to insert, and the position to insert this element,
return a new array with the element inserted.
1 3 5 7
[4(item), 2(index)]
 */
public class QuizArray2 {
    public static void main(String[] args){
        int[] arr = new int[]{1, 3, 5, 7};
        for (int i = 0; i < 5; i++)
            System.out.println((insert(arr,4,2)[i]));
    }
    public static int[] insert(int[] arr, int index, int position){
        int[] new_arr = new int[arr.length+1];
        for (int i = 0; i < position; i++) {
            new_arr[i] = arr[i];
        }
        new_arr[position] = index;
        for (int i = position; i < arr.length; i++){
            new_arr[i+1] = arr[i];
        }
        return new_arr;
    }
}



