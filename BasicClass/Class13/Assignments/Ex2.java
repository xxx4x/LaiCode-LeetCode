package BasicClass.Class13.Assignments;
/*
Queue By Two Stacks(31)
Java: Implement a queue by using two stacks.
      The queue should provide size(), isEmpty(), offer(), poll() and peek() operations.
      When the queue is empty, poll() and peek() should return null.

C++: Implement a queue by using two stacks.
     The queue should provide size(), isEmpty(), push(), front() and pop() operations.
     When the queue is empty, front() should return -1.

Assumptions
- The elements in the queue are all Integers.
- size() should return the number of elements buffered in the queue.
- isEmpty() should return true if there is no element buffered in the queue, false otherwise.
 */

import java.util.LinkedList;

public class Ex2 {
    // We always insert into the in stack/
    private static LinkedList<Integer> in;
    // We always remove from the out stack.
    private static LinkedList<Integer> out;

    public Ex2(){
        in = new LinkedList<Integer>();
        out = new LinkedList<Integer>();
    }

    public static Integer poll(){
        // if out stack is empty.
        // need to move the elements from in stack to out stack.
        move();
        return out.isEmpty()?null:out.pollFirst();
    }

    public static void offer(int element){
        // always push into the in stack.
        in.offerFirst(element);
    }

    public static Integer peek() {
        move();
        return out.isEmpty()? null: out.pollFirst();
    }

    // when out stack is empty, move the elements from
    // in stack to out stack.
    private static void move() {
        if (out.isEmpty()){
            while(!in.isEmpty()){
                out.offerFirst(in.pollFirst());
            }
        }
    }

    public static int size(){
        return in.size() + out.size();
    }

    public static boolean isEmpty() {
        return in.size() == 0 && out.size() == 0;
    }
}
