package BasicClass.Class9.Assignments;
import java.util.*;
public class ex4 {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(8);
        queue.offer(3);
        queue.offer(2);
        queue.offer(7);
        System.out.println(maxInQueue(queue));
    }
    public static int maxInQueue(Queue<Integer> queue){
        int max = queue.poll(); //返回第一个元素，并在队列中删除
        while(!queue.isEmpty()){
            max = Math.max(max, queue.poll());
        }
        return max;
        /*
        int a = queue.size();
        int max = queue.poll();
        for (int i = 0; i < a-1; i++){
            int first = queue.poll();
            if (first > max){
                max = first;
            }
        }
        return max;

         */
    }
}
