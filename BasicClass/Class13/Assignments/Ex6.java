package BasicClass.Class13.Assignments;

import java.util.Arrays;

/*
Reverse Linked List (iterative) (34)
Reverse a singly-linked list iteratively.

Examples
- L = null, return null
- L = 1 -> null, return 1 -> null
- L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null

[[87,309,495,47,410,373,24,713,77,734,1059,750,1035,744,688,236,713,410,547,982,689,597,194,848,435,690,93,214,127,762,817,83,833,1019,813,109,400,1027,907,229,761,723,843,704,430,1031,754,651]]
 */
public class Ex6 {
    public static class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }
    }

    public static ListNode reverse(ListNode head){
        // 参考答案
        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;

        /*
        if (head == null){
            return null;
        }
        ListNode cur = head;
        int count = 1;
        while(cur.next!=null){
            cur = cur.next;
            count= count+1;
        }

        int[] array = new int[count];
        ListNode cur2 = head;
        for (int i = 0; i<array.length; i++){
            array[i] = cur2.value;
            cur2 = cur2.next;
        }

        ListNode cur3 = head;
        for (int j = array.length-1; j >=0; j--){
            cur3.value = array[j];
            cur3 = cur3.next;
        }

        return head;

         */
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node1 = head;
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode result = reverse(head);
        System.out.println(result.value);
        System.out.println(result.next.value);
        System.out.println(result.next.next.value);

    }
}
