package BasicClass.Class15.Assignments;
/*
Merge Two Sorted Linked Lists(40)
Merge two sorted lists into one large sorted list.
Examples
- L1 = 1 -> 4 -> 6 -> null, L2 = 2 -> 5 -> null, merge L1 and L2 to 1 -> 2 -> 4 -> 5 -> 6 -> null
- L1 = null, L2 = 1 -> 2 -> null, merge L1 and L2 to 1 -> 2 -> null
- L1 = null, L2 = null, merge L1 and L2 to null
  [[0,5,5,5,8,10],[2,3,4,4,5,7]]
 */
public class Ex9 {
    public static class ListNode{
        public int value;
        public ListNode next;
        public ListNode(int value){
            this.value = value;
        }

         public static ListNode  BuildLinkedListFromArray(int[] arr){
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

    public static ListNode merge(ListNode one, ListNode two){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (one != null && two !=null){
            if (one.value <= two.value){
                cur.next = one;
                one = one.next;
            } else{
                cur.next = two;
                two = two.next;
            }
            cur = cur.next;
        }
        // link the remaining possible nodes;
        if (one != null) {
            cur.next = one;
        } else {
            cur.next = two;
        }
        return dummy.next;

        /*
        if(one == null && two == null){
            System.out.println("null");
            return one;
        }

        if (one != null && two == null){
            return one;
        }

        if (one == null && two != null){
            return two;
        }

        ListNode head;
        ListNode headone = one;
        ListNode headtwo = two;
        if (headone.value < headtwo.value){
            head = headone;
            headone = headone.next;
        } else{
            head = headtwo;
            headtwo = headtwo.next;
        }
        // headone =  4 6 headtwo 2 5
        ListNode cur = head;
        while(headone!= null && headtwo !=null){
            if(headone.value <= headtwo.value){ //
                cur.next = headone;
                headone = headone.next;
            } else{
                cur.next = headtwo;
                headtwo = headtwo.next;
            }
            cur = cur.next;
        }

        if (headone != null){
            cur.next = headone;
        }
        if (headtwo !=null){
            cur.next = headtwo;
        }
        return head;

         */
    }

    public static void main(String[] args){
        int[] array1 = new int[]{1, 4, 6};
        int[] array2 = new int[]{2, 5};
        ListNode array1node = ListNode.BuildLinkedListFromArray(array1);
        ListNode array2node = ListNode.BuildLinkedListFromArray(array2);
        ListNode result1 = merge(array1node,array2node);
        System.out.println(result1.toString());

        int[] array3 = new int[]{};
        int[] array4 = new int[]{1,2};
        ListNode array3node = ListNode.BuildLinkedListFromArray(array3);
        ListNode array4node = ListNode.BuildLinkedListFromArray(array4);
        ListNode result2 = merge(array3node,array4node);
        System.out.println(result2.toString());

        int[] array5 = new int[]{};
        int[] array6 = new int[]{};
        ListNode array5node = ListNode.BuildLinkedListFromArray(array5);
        ListNode array6node = ListNode.BuildLinkedListFromArray(array6);
        ListNode result3 = merge(array5node,array6node);
        System.out.println(result3);


        int[] array7 = new int[]{0,5,5,5,8,10};
        int[] array8 = new int[]{2,3,4,4,5,7};
        ListNode array7node = ListNode.BuildLinkedListFromArray(array7);
        ListNode array8node = ListNode.BuildLinkedListFromArray(array8);
        ListNode result4 = merge(array7node,array8node);
        System.out.println(result4.toString());
    }

}
