package BasicClass.Class9.Assignments;
/*
Sum of Numbers in a TheoreticalClass.Class4QueueAndStack.Stack2(552)
Calculate the sum of all numbers in a TheoreticalClass.Class4QueueAndStack.Stack2.
Assumption: The TheoreticalClass.Class4QueueAndStack.Stack2 is not null or empty.
Example:
TheoreticalClass.Class4QueueAndStack.Stack2 contains 7,5,3,0
Answer: 15
 */
import java.util.*;
public class ex5 {
    public static void main(String[] args){
        Deque<Integer> stack = new LinkedList<>();
        stack.push(7);
        stack.push(5);
        stack.push(3);
        stack.push(0);
        System.out.println(sumOfStack(stack));


    }
    public static int sumOfStack(Deque<Integer> stack){
        int a = stack.size();
        int sum = 0;
        for (int i = 0; i < a; i++){
            sum = sum + stack.pop();
        }
        return sum;
    }
}
