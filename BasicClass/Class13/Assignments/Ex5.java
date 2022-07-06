package BasicClass.Class13.Assignments;
/*
Count Nodes in a LinkedList(555)
Given a linked list, count the number of nodes in it.
Assumption: The linkedlist is not null or empty.
Example:
Given: 1->7->5->4->2->null
Answer: 5
[[407,303,134,331,155,309,250,20,302,419,146,355,495,128,155,380,33,443,178,331,389,370,149,316,138,179,437,227,272,203,457,132,82]]
 */

public class Ex5 {
    public static void main(String[] args){
        int[] array = new int[]{1, 7, 5, 4, 2};
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for(int i = 1; i < array.length; i++){
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        System.out.println(count(head));

        int[] array2 = new int[]{407,303,134,331,155,309,250,20,302,419,146,355,495,128,155,380,33,443,178,331,389,
                370,149,316,138,179,437,227,272,203,457,132,82};
        ListNode head2 = new ListNode(array[0]);
        ListNode cur2 = head2;
        for (int i = 1; i < array2.length; i++){
            cur2.next = new ListNode(array2[i]);
            cur2 = cur2.next;
        }
        System.out.println(count(head2));

    }


    public static class ListNode{
        public int value;
        public ListNode next;
        public ListNode(int value) {
            this.value = value;
            next = null;
        }
    }

    public static int count(ListNode head){
        // 参考答案
        ListNode cur = head;
        int i = 0;
        while (cur != null){
            i++;
            cur = cur.next;
        }
        return i;

        /*
        int num = 1;
        ListNode cur= head;
        while(cur.next != null){
            cur= cur.next;
            num= num+1;
        }
        return num;

         */
    }
}








