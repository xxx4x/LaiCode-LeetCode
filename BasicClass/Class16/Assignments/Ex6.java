package BasicClass.Class16.Assignments;

import com.sun.source.tree.Tree;

/*
Check If Binary Tree Is Balanced(46)
Check if a given binary tree is balanced. A balanced binary tree is one in which the depths of every node’s left and right subtree differ by at most 1.
Examples
     5
   /   \
  3     8
 /  \     \
1    4     11
is balanced binary tree,
   5
   /
  3
 /  \
1    4
is not balanced binary tree.
Corner Cases
- What if the binary tree is null? Return true in this case.
How is the binary tree represented?
We use the level order traversal sequence with a special symbol "#" denoting the null node.
For Example:
The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
  1
 /  \
 2   3
   /
  4
 */
public class Ex6 {
    public static class TreeNode{
        public int key;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int key){
            this.key = key;
        }

    }
    // Methode2: better O(n) algorithm
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        // use -1 to denote the tree is not balanced.
        // >= 0 value means the tree is balanced and it is the height of the tree.
        return height(root) != -1;
    }

    private static int height(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        // if left subtree is already not balanced, we do not need to continue
        // and we can return -1 directly.
        if (leftHeight == -1){
            return -1;
        }
        int rightHeight = height(root.right);
        if (rightHeight == -1){
            return -1;
        }
        // if not balanced, return -1.
        if (Math.abs(leftHeight - rightHeight) >1 ){
            return -1;
        }
        return Math.max(leftHeight, rightHeight)+1;
    }

    // Method1: O(nlogn) algorithm for beginners
    /*
    public boolean isBalanced(TreeNode root){
        if (root == null){
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight)>1){
            return false;
        }
        return isBalanced(root.left)&& isBalanced(root.right);
    }

    private int getHeight(TreeNode root){
        if(root ==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right)+1);
    }

     */


    /*
    public static boolean isBalanced(TreeNode root){

        if (root == null){
            //System.out.println("True");
            return true;
        }

        if (isBalanced(root.left) && isBalanced(root.right) && Math.abs(Height(root.left)-Height(root.right))<=1 ){
            //System.out.println("True");
            return true;
        }else{
            //System.out.println("False");
            return false;
        }
    }

    public static int Height(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(Height(root.left),Height(root.right))+1;
    }

     */

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
        System.out.println(isBalanced(node5));

        TreeNode egnode5 = new TreeNode(5);
        TreeNode egnode3 = new TreeNode(3);
        TreeNode egnode1 = new TreeNode(1);
        TreeNode egnode4 = new TreeNode(4);
        egnode5.left = node3;
        egnode3.left = node1;
        egnode3.left = node4;
        System.out.println(isBalanced(egnode5));

    }
}
