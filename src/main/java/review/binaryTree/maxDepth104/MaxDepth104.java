package review.binaryTree.maxDepth104;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth104 {
    /**
     * 给定一个二叉树 root ，返回其最大深度。
     * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
     */

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int dep=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int length=queue.size();
            for (int i=0;i<length;i++) {
                TreeNode node = queue.poll();
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            dep++;
        }
        return dep;
    }
}
