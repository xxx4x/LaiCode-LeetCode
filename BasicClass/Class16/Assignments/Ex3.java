package BasicClass.Class16.Assignments;

import java.util.ArrayList;
import java.util.List;

/*
Post-order Traversal Of Binary Tree (recursive)(656)
Implement a recursive, post-order traversal of a given binary tree, return the list of keys of each node in the tree as it is post-order traversed.
Examples
        5
   /   \
  3     8
 /  \     \
1    4     11
Post-order traversal is [1, 4, 3, 11, 8, 5]
Corner Cases
- What if the given binary tree is null? Return an empty list in this case.
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
public class Ex3 {
    public static class TreeNode{
        public int key;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int key){
            this.key = key;
        }

    }

    public static List<Integer> postOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }

        helper(root.left, res);
        helper(root.right, res);
        res.add(root.key);
        System.out.println(root.key);

    }

    public static void main(String[] args){
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);
        TreeNode node11 = new TreeNode(11);
        node5.left = node3;
        node3.left = node1;
        node3.right = node4;
        node5.right = node8;
        node8.right = node11;
        postOrder(node5);

    }
}
