package BasicClass.Class4;

public class VariableScopeCall {
    public static void main(String[] args){
        int i = 0;
        {
            int j = 1;
            {
                i = 1; // yes
                j = 2; // yes
                int k = 3;
                // int j = 4; // compile error 在最初的j{} 已经定义过了
            }

            System.out.println("i: " + i); // ok   i: 1
            System.out.println("j: " + j); // ok   j: 2
            //System.out.println("k: " + k); // compile error  // 已经超出了范围了

            i = 2; // ok
        }
        System.out.println("i: " + i); // ok
        //System.out.println("j: " + j); // compile error 已经超出了范围了
        int k = 3;
        System.out.println("k: " + k); // ok
    }
    // System.out.println("i: " + i); // compile error 已经超出了范围了

}
