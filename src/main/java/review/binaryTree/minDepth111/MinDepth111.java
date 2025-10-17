package review.binaryTree.minDepth111;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth111 {
    /**
     * 给定一个二叉树，找出其最小深度。
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * 说明：叶子节点是指没有子节点的节点。
     */

    public int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int dep=0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int length=queue.size();
            dep++;
            for (int i = 0; i < length; i++) {
                TreeNode node =queue.poll();
                if (node.right==null&&node.left==null){
                    return dep;
                }
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return dep;
    }
}
