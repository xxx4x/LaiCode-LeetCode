package BasicClass.Class2;

public class While1 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i += 3){
            System.out.print(i + " " );
        }

        System.out.println(" ");

        int t = 0;
        while ( t < 10){
            System.out.print(t + " ");
            t += 3;
        }
    }
}
