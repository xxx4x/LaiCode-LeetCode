package BasicClass.Class16.Assignments;
/*
Pre-order Traversal Of Binary Tree (recursive)(655)

Implement a recursive, pre-order traversal of a given binary tree, return the list of keys of each node in the tree as it is pre-order traversed.
Examples
     5
   /   \
  3     8
 /  \     \
1    4     11
Pre-order traversal is [5, 3, 1, 4, 8, 11]
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
[[11,1,null,null,-1,-9,10,-5,6,-7,null,null,-6,15]]
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Ex1 {
    public static class TreeNode {
        public int key;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int key){
            this.key = key;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(11);
        node1.left = node2;
        node2.left = node4;
        node2.right = node5;
        node1.right = node3;
        node3.right = node6;
        preOrder(node1);

        System.out.println();

        TreeNode nodeeg = new TreeNode(1);
        TreeNode nodeeg2 = new TreeNode(2);
        TreeNode nodeeg3 = new TreeNode(3);
        TreeNode nodeeg4 = new TreeNode(4);
        nodeeg.left = nodeeg2;
        nodeeg.right = nodeeg3;
        nodeeg3.right = nodeeg4;
        preOrder(nodeeg);
    }

/*
List<Integer>
List是一个接口
<> 表示了List里面放的对象是什么类型的，这样写就表示了，你list里面放的必须是Integer类型的
关于integer
- int是java提供的8种原始数据类型之一。Java为每个原始类型提供了封装
- 类，Integer是java为int提供的封装类。int的默认值0，而Integer的默认值为null
- Integer提供了多个与整数相关的操作方法，例如，将一个字符串换成整数，Integer中还定义了表示整数的最大值和最小值的常量


关于ArrayList
ArrayList类是一个特殊的数组-动态数组。通过添加和删除元素，就可以动态改变数组的长度
优点：
- 支持自动改变大小
- 可以灵活的插入元素
- 可以灵活的删除元素
局限：
- 比一般的数组的速度慢一些

ArrayList是List接口的一个实现类。
ArrayList类是继承AbstractList抽象类和实现List接口的一个实现类。
因此，List接口不能被构造，也就是我们说的不能创建实例对象，但是我们可以像下面那
样为List接口创建一个指向自己的对象引用，而ArrayList实现类的实例对象就在这充当了
这个指向List接口的对象引用。
List<Integer> list = new ArrayList<Integer>();
这句代码的目的是 可以调用 List接口里面的内置函数,add,get等方法;
list.add(index[i],nums[i]);
list.get(i);

 */

    // 参考答案
    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private static void helper(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }

        System.out.println(root.key);
        res.add(root.key);
        helper(root.left,res);
        helper(root.right,res);
    }
}

