package BasicClass.Class15.Assignments;
/*
Middle Node Of Linked List(36)
Find the middle node of a given linked list.
Examples
- L = null, return null
- L = 1 -> null, return 1
- L = 1 -> 2 -> null, return 1
- L = 1 -> 2 -> 3 -> null, return 2
- L = 1 -> 2 -> 3 -> 4 -> null, return 2

[[757,753,133,723,208,748,1067,641,1081,521,1072,1024,615,244,286,171]]
 */
public class Ex4 {
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
            for (int i = 1; i < arr.length; i++){
                cur.next = new ListNode(arr[i]);
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

    public static ListNode middleNode(ListNode head){
        // 参考答案
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        /*
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

         */
    }

    public static void main(String[] args){
        int[] array1 = new int[]{};
        ListNode array1node = ListNode.BuildLinkedListFromArray(array1);
        ListNode array1noderesult = middleNode(array1node);
        //System.out.println(array1noderesult.toString());

        int[] array2 = new int[]{1,2};
        ListNode array2node =  ListNode.BuildLinkedListFromArray(array2);
        ListNode array2noderesult = middleNode(array2node);
        System.out.println(array2noderesult.toString());

        int[] array3 = new int[]{1,2,3};
        ListNode array3node = ListNode.BuildLinkedListFromArray(array3);
        ListNode array3noderesult = middleNode(array3node);
        System.out.println(array3noderesult.toString());

        int[] array4 = new int[]{1,2,3,4};
        ListNode array4node = ListNode.BuildLinkedListFromArray(array4);
        ListNode array4noderesult = middleNode(array4node);
        System.out.println(array4noderesult.toString());

        int[] array5 = new int[]{757,753,133,723,208,748,1067,641,1081,521,1072,1024,615,244,286,171};
        ListNode array5node = ListNode.BuildLinkedListFromArray(array5);
        ListNode array5noderesult = middleNode(array5node);
        System.out.println(array5noderesult.toString());

    }

}
