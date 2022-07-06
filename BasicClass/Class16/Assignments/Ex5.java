package BasicClass.Class16.Assignments;

import com.sun.source.tree.Tree;

/*
Count Node(563)
Find the number of tree nodes.
Examples:
      5
    /    \
   3      8
  /   \      \
1    4        11
The number of above binary tree is 6.
 */
public class Ex5 {
    public static class TreeNode{
        public int key;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int key){
            this.key = key;
        }
    }

    public static int countNodes(TreeNode root){
        // 参考答案
        if (root == null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return 1 + left + right;
        /*
        if (root == null){
            return 0;
        }

        int count = countNodes(root.left)+countNodes(root.right)+1;
        return count;

         */

    }

    public static void main(String[] args){
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        node5.left = node3;
        node5.right = node8;
        node3.left = node1;
        node3.right = node4;
        node5.right = node8;
        node8.right = node11;
        System.out.println(countNodes(node5));

    }
}
