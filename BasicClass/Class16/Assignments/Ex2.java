package BasicClass.Class16.Assignments;

import java.util.ArrayList;
import java.util.List;

/*
In-order Traversal Of Binary Tree (recursive)(654 )
Implement a recursive, in-order traversal of a given binary tree, return the list of keys of each node in the tree as it is in-order traversed.
Examples
     5
   /   \
  3     8
 /  \     \
1    4     11
In-order traversal is [1, 3, 4, 5, 8, 11]
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
public class Ex2 {
    public static class TreeNode{
        public int key;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int key){
            this.key = key;
        }
    }
    //参考答案
    public static List<Integer> inOrder(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        helper(root,res);
        return res;
    }

    public static void helper(TreeNode root,List<Integer> res){
        if (root == null){
            return;
        }

        helper(root.left,res);
        res.add(root.key);
        System.out.println(root.key);
        helper(root.right,res);

    }

    public static void main(String[] args){
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(11);
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        node1.right = node5;
        node5.right = node6;
        inOrder(node1);
    }
}
