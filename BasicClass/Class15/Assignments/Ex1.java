package BasicClass.Class15.Assignments;

import java.util.List;

/*
Find the Middle Node of a LinkedList (with odd number of nodes)(556)
Find the middle node of a given linked list with odd number length.
Assumption: the length > 0
Example:

L = 1 -> 2 -> 3 -> null, return 2->3
[[445,439,200,757,543,348,324,262,923,378,282,321,672,924,614,147,714,231,309,463,582,202,893,807,133,641,666,967,702,990,636,774,212,933,870,769,47,594,138,694,950,297,583,738,754,777,845,815,565]]
 */
public class Ex1 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3};
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for (int i = 1; i < array.length;i++){
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        ListNode a = findMiddleNode(head);
        System.out.println(a.toString());

        int[] array1 = new int[]{445,439,200,757,543,348,324,262,923,378,282,321,672,924,614,147,714,231,309,463,582,202,
                893,807,133,641,666,967,702,990,636,774,212,933,870,769,47,594,138,694,950,297,583,738,754,777,845,815,565};

        ListNode eg = ListNode.BuildLinkedListFromArray(array1);
        System.out.println(findMiddleNode(eg).toString());

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
            if (this.next != null){
                sb.append("->");
                sb.append(this.next.toString());
            }
            return sb.toString();
        }

        public static ListNode BuildLinkedListFromArray(int[] arr){
            if (arr == null || arr.length ==0){
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

        public ListNode copy(){
            ListNode newNode = new ListNode(this.value);
            if(this.next!=null){
                newNode.next = this.next.copy();
            }
            return newNode;
        }
    }



    // 1 - > 2 -> 3 -> 4 -> 5 -> null
    //           slow
    //                     fast
    // 1->2 ->3 -> null
    // s
    // f
    public static ListNode findMiddleNode(ListNode head){
        // 参考答案
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // TC: O(n)
    // SC: O(1)

}
