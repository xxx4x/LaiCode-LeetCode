package BasicClass.Class15.Assignments;
/*
Insert a Node to The Tail of a LinkedList(560)
Insert a value to the tail of a  linked list.
Example:
1 -> 3 -> null, insert : 5 → return 1 -> 3 -> 5 -> null
null, insert: 5 → return 5 → null
[[292,12,172,266,218,284,280,77,228,482,207,391,26,302,357,378,279,38,200,329,87,399,373,281,454,326,211,176,473,181,134,103,208,215,82,55,28,406,28,417,11,41,3,307,321,273,153,355,205,340,474,243,218,9,172,413,186,430,161,371,196,259,96,301,170,161,497,303,250,132,364,300,148,305,360,254,333,413,267,253,376,451,436,80,138,145,467,279,289,19,495,212,250,403,380,378,215,174,93,381,186,487,331,197,285,440,206,286,279,66,124,129,274,473,304,43,495,225,116,299,156,474,456,217,329,15,471,335,215,250,204,158,223,16,337,325,429,27,141,6,298,435,202,371,318,194,390,407,120,422,195,8,252,17,253],40]
 */
public class Ex7 {
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

    public static ListNode insertNode(ListNode head, int target){
        // 参考答案
        if (head == null){
            return new ListNode(target);
        }
        ListNode curr = head;
        while(curr.next !=null){
            curr = curr.next;
        }
        curr.next = new ListNode(target);
        return head;
        /*
        ListNode tar = new ListNode(target);
        if (head == null){
            return tar;
        }
        ListNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = tar;
        return head;

         */
    }

    public static void main(String[] args){
        int[] array1 = new int[]{1,3};
        int[] array2 = new int[]{};
        int[] array3 = new int[]{292,12,172,266,218,284,280,77,228,482,207,391,26,302,357,378,279,38,200,329,87,399,373,281,454,326,211,176,473,181,134,103,208,215,82,55,28,406,28,417,11,41,3,307,321,273,153,355,205,340,474,243,218,9,172,413,186,430,161,371,196,259,96,301,170,161,497,303,250,132,364,300,148,305,360,254,333,413,267,253,376,451,436,80,138,145,467,279,289,19,495,212,250,403,380,378,215,174,93,381,186,487,331,197,285,440,206,286,279,66,124,129,274,473,304,43,495,225,116,299,156,474,456,217,329,15,471,335,215,250,204,158,223,16,337,325,429,27,141,6,298,435,202,371,318,194,390,407,120,422,195,8,252,17,253};
        ListNode array1node = ListNode.BuildLinkedListFromArray(array1);
        ListNode array2node = ListNode.BuildLinkedListFromArray(array2);
        ListNode array3node = ListNode.BuildLinkedListFromArray(array3);
        ListNode result1 = insertNode(array1node, 5);
        ListNode result2 = insertNode(array2node, 5);
        ListNode result3 = insertNode(array3node, 40);
        System.out.println(result1.toString());
        System.out.println(result2.toString());
        System.out.println(result3.toString());

    }

}
