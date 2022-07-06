package BasicClass.Class13.Assignments;
/*
Generate a linked list of length n, where the nodes contains numbers from 0 to n-1 in order.
Assumption: n > 0.
Example:
n = 3
Answer: 0->1->2->null
 */

class ListNode{
    public int value;
    public ListNode next;
    public ListNode(int value){
        this.value = value;
        next = null;
    }
}

public class Exn {
    public static void main(String[] args){
        System.out.println(generate (3));
        System.out.println(generate(25));
    }

    public static ListNode generate(int n){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1; i<n; i++){
            System.out.println(cur.value);
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return head;
    }

}

