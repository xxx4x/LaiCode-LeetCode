package BasicClass.Class16.Assignments;
/*
Height of Binary Tree(60)
Find the height of binary tree.
Examples:
     5
   /   \
  3     8
 /  \     \
1    4     11
The height of above binary tree is 3.
How is the binary tree represented?**
We use the level order traversal sequence with a special symbol "#" denoting the null node.
**For Example:**
The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
  1
 /  \
 2   3
   /
  4
 */
public class Ex4 {
    public static class TreeNode{
        public int key;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int key){
            this.key = key;
        }
    }

    public static int findHeight(TreeNode root){
        //参考答案
        if (root == null){
            return 0;
        }
        return Math.max(findHeight(root.left),findHeight(root.right))+1;
        /*
        if (root  == null){
            return 0;
        }
        int height= Math.max(findHeight(root.left),findHeight(root.right))+1;
        return height;

         */
    }

    public static void main(String[] arg){
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node8 = new TreeNode(8);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node11 = new TreeNode(11);
        node5.left = node3;
        node5.right = node8;
        node8.right = node11;
        node3.left = node1;
        node3.right = node4;
        System.out.println(findHeight(node5));


        TreeNode egnode1 = new TreeNode(1);
        TreeNode egnode2 = new TreeNode(2);
        TreeNode egnode3 = new TreeNode(3);
        TreeNode egnode4 = new TreeNode(4);
        egnode1.left = egnode2;
        egnode1.right = egnode3;
        egnode3.left = egnode4;
        System.out.println(findHeight(egnode1));

    }
}
