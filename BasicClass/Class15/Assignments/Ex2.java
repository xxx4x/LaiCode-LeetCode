package BasicClass.Class15.Assignments;
/*
Find the Middle Node (first one in the mid two nodes) of a LinkedList (with even number of nodes)(557)
Find the middle node (first one in the mid two nodes) of a given linked list with even number length.
Example:
L = null, return null
L = 1 -> 2 -> 3 -> 4 -> null, return 2
[[9,213,34,2,3409,349,43,42,89,9999]]
 */
public class Ex2 {
    public static void main(String[] args){
        int[] array = new int[]{1, 2, 3, 4};
        ListNode node1 = ListNode.BuildLinkedListFromArray(array);
        ListNode result = findMiddleNode(node1);
        System.out.println(result.toString());

        int[] array2 = new int[]{9,213,34,2,3409,349,43,42,89,9999};
        ListNode node2 = ListNode.BuildLinkedListFromArray(array2);
        ListNode result2 = findMiddleNode(node2);
        System.out.println(result2.toString());
    }

    public static class ListNode{
        public int value;
        public ListNode next;
        public ListNode(int value){
            this.value = value;
        }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            if (this.next !=null){
                sb.append("->");
                sb.append(this.next.toString());
            }
            return sb.toString();
        }

        public static ListNode BuildLinkedListFromArray(int[] arr){
            if (arr == null || arr.length == 0 ){
                return null;
            }

            ListNode cur = new ListNode(arr[0]);
            ListNode head = cur;
            for (int i = 1; i < arr.length; i++){
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }

            return head;
        }
    }
    // 1 2 3 4
    //   s
    //     f
    public static ListNode findMiddleNode(ListNode head){// 参考答案
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
