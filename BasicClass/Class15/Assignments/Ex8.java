package BasicClass.Class15.Assignments;
/*
Insert In Sorted Linked List (39)
Insert a value in a sorted linked list.
Examples
- L = null, insert 1, return 1 -> null
- L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
- L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
- L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null
[[-2147483648],-2147483648]
 */

public class Ex8 {

    public static class ListNode{
        public int value;
        public ListNode next;
        public ListNode(int value){
            this.value = value;
        }

        public static ListNode BuildLinkedListFromArray(int[] array){
            if (array == null || array.length == 0){
                return null;
            }

            ListNode head = new ListNode(array[0]);
            ListNode cur = head;
            for (int i = 1; i < array.length; i++){
                cur.next = new ListNode(array[i]);
                cur = cur.next;
            }
            return head;
        }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            if (this.next != null){
                sb.append("->");
                sb.append(this.next.toString());
            }
            return sb.toString();
        }
    }

    public static ListNode insert(ListNode head, int value){
        //  参考答案
        ListNode newNode = new ListNode(value);
        // 1. determine if the inserted node is before head.
        if (head == null || head.value >= value){
            newNode.next = head;
            return newNode;
        }
        // 2. insert the new node to the right position.
        // using the previous node to traverse the linked list
        // the insert position of the new node should be between prev and prev.next
        ListNode prev = head;
        while(prev.next != null && prev.next.value < value){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
        /*
        ListNode result = new ListNode(value);
        if (head == null){
            return result;
        }

        ListNode cur = head;
        if (cur.value >= value){
            result.next = cur;
            return result;
        }


        while (cur.next != null && cur.next.value < value){
            cur = cur.next;
        }
        result.next = cur.next;
        cur.next = result;
        return head;

         */
    }

    public static void main(String[] args){
        int[] array1 = new int[]{};
        int[] array2 = new int[]{1, 3, 5};
        int[] array3 = new int[]{2,3};
        int[] array4 = new int[]{-2147483648};
        int[] array5 = new int[]{1};
        int[] array6 = new int[]{1,3,3,3,8,11,15};
        ListNode array1node = ListNode.BuildLinkedListFromArray(array1);
        System.out.println(insert(array1node,1).toString());// 1->null

        ListNode array2node = ListNode.BuildLinkedListFromArray(array2);
        System.out.println(insert(array2node,2).toString()); // 1 ->2->3->5

        ListNode array3node = ListNode.BuildLinkedListFromArray(array3);
        System.out.println(insert(array3node,1).toString()); // 1-> 2->3

        ListNode array4node = ListNode.BuildLinkedListFromArray(array4);
        System.out.println(insert(array4node,-2147483648).toString());

        ListNode array5node = ListNode.BuildLinkedListFromArray(array5);
        System.out.println(insert(array5node,2).toString());

        ListNode array6node = ListNode.BuildLinkedListFromArray(array6);
        System.out.println(insert(array6node,2).toString());
    }
}
