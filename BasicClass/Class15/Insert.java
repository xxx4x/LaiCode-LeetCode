package BasicClass.Class15;


public class Insert {
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
            for (int i = 1; i < arr.length;i++){
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

    public static void main(String[] args){
        int[] array1 = new int[]{1, 2};
        int[] array2 = new int[]{7,8,10,19,25,27,27,31,39,44,48,55,58,65,65,
                70,77,80,82,83,88,91,99,102,106,110,111,120,121,126,129,130,151,152,152,154,159,163,168,169,171,172,173,178,180,181,183,187,188,189,189,190,194};
        int[] array3= new int[]{1,3};
        ListNode array1List = ListNode.BuildLinkedListFromArray(array1);
        ListNode array2List = ListNode.BuildLinkedListFromArray(array2);
        ListNode array1Listresult = insertNode(array1List,2);
        System.out.println(array1Listresult.toString());
        ListNode array2Listresult = insertNode(array2List, 52);
        System.out.println(array2Listresult.toString());

        ListNode array3List = ListNode.BuildLinkedListFromArray(array3);
        ListNode array3Listresult = insertNode(array3List,1);
        System.out.println(array3Listresult.toString());


    }

    public static ListNode insertNode(ListNode head, int target){
        // create a newNode based on input target value.
        ListNode new_node = new ListNode(target);
        // case0: intput LinkedList is null
        if (head == null){
            return new_node;
        }
        // case2: insert into the head
        if (target <= head.value){
            new_node.next = head;
            return new_node;
        }

        // case 2 && 3 insert into middle or tail
        ListNode curr = head;
        // find the right insert position
        while (curr.next != null && curr.next.value < target){
            curr = curr.next;
        }

        // insert operation
        new_node.next = curr.next;
        curr.next = new_node;
        return head;
    }
}
