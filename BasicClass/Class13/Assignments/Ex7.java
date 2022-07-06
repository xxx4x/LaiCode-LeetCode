package BasicClass.Class13.Assignments;
/*
Reverse Linked List (recursive)(653)
Reverse a singly-linked list recursively.
Examples
- L = null, return null
- L = 1 -> null, return 1 -> null
- L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null
[[1086,470,479,498,658,885,231,829,999]]
 */
public class Ex7 {
    public static void main(String[] args){
        int[] array = new int[]{1, 2, 3};
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for(int i = 1; i<array.length;i++){
            cur.next = new ListNode(array[i]);
            cur = cur.next;
            System.out.println(cur.value);
        }

        ListNode result = reverse(head);
        System.out.println(result.value +"->" + result.next.value+"->" + result.next.next.value+"-> null");
    }

    public static class ListNode{
        public int value;
        public ListNode next;
        public ListNode(int value){
            this.value = value;
            next = null;
        }
    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode SubproblemResult = reverse(head.next);
        head.next.next = head; // 2->1
        head.next = null;

        return SubproblemResult;
    }

}
