package BasicClass.Class15.Assignments;
/*
Find the Middle Node (second one in the mid two nodes) of a LinkedList (with even number of nodes) (558 )
Find the middle node (second one in the mid two nodes) of a given linked list with even number length.
Example:
L = null, return null
L = 1 -> 2 -> 3 -> 4 null, return 3
[[9,213,34,2,3409,349,43,42,89,9999]]

 */
public class Ex3 {
    public static void main (String[] args){
        int[] array1 = new int[]{1,2,3,4};
        ListNode arraynode1 = ListNode.BuildLinkedListFromArray(array1);
        ListNode arraynode1result = findMiddleNode(arraynode1);
        System.out.println(arraynode1result.toString());

        int[] array3 = new int[]{9,213,34,2,3409,349,43,42,89,9999};
        ListNode arraynode3 = ListNode.BuildLinkedListFromArray(array3);
        ListNode arraynode3result = findMiddleNode(arraynode3);
        System.out.println(arraynode3result.toString());

    }

    public static class ListNode{
        public int value;
        public ListNode next;
        public ListNode(int value){
            this.value = value;
        }

        public static ListNode BuildLinkedListFromArray(int[] arr){
            if (arr == null || arr.length ==0){
                return null;
            }

            ListNode head = new ListNode(arr[0]);
            ListNode cur = head;
            for (int i = 1; i< arr.length;i++){
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }
            return head;
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

        public ListNode copy(){
            ListNode newNode = new ListNode(this.value);
            if(this.next != null){
                newNode.next = this.next.copy();
            }
            return newNode;
        }

    }

    // 1 2 3 4 5 null
    //   s
    //     f
    //     s    f

    // 1 2 3 4 5 6 null
    // s
    // f
    //   s
    //     f
    //     s
    //         f
    public static ListNode findMiddleNode(ListNode head){
        //参考答案
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }


}
