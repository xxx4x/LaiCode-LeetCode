package BasicClass.Class10;

class ListNode{
    public int value; // the storage value
    public ListNode next; // it is reference, or, it is an address; 黄色小纸条， 抽屉编号
    public ListNode(int x){ // Constructor!!
        this.value = x;
    }
}

public class Test {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1); //node1 是个外部名片 印的值是1 node1 地址：0xFFFF0000 value=1
        ListNode node2 = new ListNode(2); // 生成新的节点
        ListNode node3 = new ListNode(3);
        node1.next = node2; // 把新节点连起来
        node2.next = node3;
        node3.next = null;

        System.out.println(count(node1)); //3
        System.out.println(count(node2)); //2
        System.out.println(count(node3)); //1
    }

    public static int count(ListNode head){
        // corner case check
        // important for every question!!
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode cur = head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
}













