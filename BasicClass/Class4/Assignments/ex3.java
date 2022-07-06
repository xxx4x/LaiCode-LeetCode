package BasicClass.Class4.Assignments;

public class ex3 {
    public static void main(String[] args){
        int[] array = new int[]{};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0 ) {
            return -1;
        } else {
            int s = 0;
            for (int i = 0; i <= array.length-1; i++) {
                s += array[i];
            }
            return s;
        }
    }
}
/*

Have to do it case by case with the following reason:

logical || will let either null array or empty array pass
have to start identify where array is null because nullpointerException might appear if null array is fed to array.length
Hence,
if{ null?}
else if{ empty array?}
else{ //compute and return}


 */