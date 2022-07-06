package BasicClass.Class13.Assignments;
/*
Generate LinkedList(554)
Generate a linked list of length n, where the nodes contains numbers from 0 to n-1 in order.
Assumption: n > 0.
Example:
n = 3
Answer: 0->1->2->null
 */
import java.util.*;

public class Ex4 {
    public static void main(String[] arg){
        ListNode result = generate(3);
        System.out.println(result.value+ "->" + result.next.value + "->" + result.next.next.value
                + "->" + "null");

        ListNode result2 = generate(25);
        ListNode headnext;
        ListNode tail;
        int valuenum = result2.value;
        headnext = result2.next;
        System.out.print(valuenum + "->" + headnext.value+"->");
        for (int i = 0; i < 23; i++){
            headnext = headnext.next;
            int valuenumtail= headnext.value;
            System.out.print(valuenumtail + "->");
        }
        System.out.print("null");

    }


    public static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }


    public static ListNode generate(int n){
        // Write your solution here
        // 参考答案
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i<n; i++){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return head;
    }
        /*
        int[] array = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i]=i;
        }
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for (int i = 1; i < n; i++){
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        return head;
    }

         */
}
