package review.binaryTree.connect116;

import review.binaryTree.largestValues515.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Connect116 {
    /**
     * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
     *
     * struct Node {
     *   int val;
     *   Node *left;
     *   Node *right;
     *   Node *next;
     * }
     * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
     *
     * 初始状态下，所有 next 指针都被设置为 NULL。
     */
    public Node connect(Node root) {
        if (root==null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int length=queue.size();
            for (int i = 0; i < length; i++) {
                Node node = queue.poll();
                if (i==length-1){
                    node.next=null;
                }else {
                    node.next=queue.peek();
                }
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
        }
        return root;
    }
}
