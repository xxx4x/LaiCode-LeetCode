package BasicClass.Class2;

public class WhileContinue2 {
    public static void main(String[] args){
        int i =-1;
        while ( i < 9){
            i++;
            if ( i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
