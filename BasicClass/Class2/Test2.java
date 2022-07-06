package BasicClass.Class2;

public class Test2 {
    public static void main(String[] args){
        for (int i = 0; i < 2; i++) { // i = 0, 1
            for (int j = 0; j < 5; j++) { // j = 0, 1, 2, 3, 4
                if (j == 2) {
                    break;     // 0,0 0,1 1,0 1,1
                }
                System.out.print(i + "," + j + " ");
            }
        }
    }
}
