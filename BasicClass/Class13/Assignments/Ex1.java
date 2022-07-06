package BasicClass.Class13.Assignments;
/*
**Shuffle Stacks(553)**
Given a stack of numbers, shuffle all numbers into another TheoreticalClass.Class4QueueAndStack.Stack2 so that the order is reversed.
Assumption: the stack is not null or empty.
Example:
stack1 = [8,4,6,1]  stack2 = []

After shuffle:
stack1 = [], stack2 = [1, 6, 4, 8]
 */
import java.util.Deque;
import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args){
        Deque<Integer> stack1 = new LinkedList<>();
        stack1.push(8);
        stack1.push(4);
        stack1.push(6);
        stack1.push(1);
        Deque<Integer> stack2 = new LinkedList<>();
        shuffle(stack1, stack2);
    }

    public static void shuffle(Deque<Integer> stack1, Deque<Integer> stack2){
        // 参考答案
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        /*
        int size = stack1.size();
        for (int i = 0; i < size; i++){
            int a = stack1.pop();
            System.out.println(a);
            stack2.push(a);
        }
         */
    }
}
