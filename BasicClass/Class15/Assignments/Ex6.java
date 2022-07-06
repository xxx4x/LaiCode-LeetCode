package BasicClass.Class15.Assignments;
/*
Insert a Node in a Sorted LinkedList (with length more than 1)(559)
Insert a value in a sorted linked list.
Assumption: length > 1,  first node value <= inserting node value <= last node value
Example:
1 -> 3 -> null, insert : 2 → return 1 -> 2 -> 3 -> null
[[7,8,10,19,25,27,27,31,39,44,48,55,58,65,65,70,77,80,82,83,88,91,99,102,106,110,111,120,121,126,129,130,151,152,152,154,159,163,168,169,171,172,173,178,180,181,183,187,188,189,189,190,194],52]
 */
public class Ex6 {

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
        ListNode curr = head;
        while(curr.next != null){
            if (target >= curr.value && target <= curr.next.value ){
                ListNode newNode = new ListNode(target);
                ListNode temp = curr.next;
                curr.next = newNode;
                newNode.next = temp;
                return head;
            }
            curr = curr.next;
        }
        return head;

        /*
        // Write your solution here.
        if (head == null){
            ListNode result = new ListNode(target);
            return result;
        }

        ListNode cur = head;
        ListNode curlast = cur;
        ListNode tar = new ListNode(target);

        if (cur.value == target){
            tar.next = cur;
            return tar;
        }

        while (cur.value < target){
            curlast = cur;
            cur = cur.next;
        }
        curlast.next = tar;
        curlast.next.next = cur;
        return head;

         */
    }
}
