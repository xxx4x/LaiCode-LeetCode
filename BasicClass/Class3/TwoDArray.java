package BasicClass.Class3;

public class TwoDArray {
    public static void main(String[] args){
        int m = 4, n =6;
        int [][] matrix = new int[m][n];
        System.out.println("# of rows: " + matrix.length);
        System.out.println("# of columns: " + matrix[0].length);
    }
}

//Note: it is arr.length, not arr.length()