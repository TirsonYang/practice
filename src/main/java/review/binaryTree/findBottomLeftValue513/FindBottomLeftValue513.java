package review.binaryTree.findBottomLeftValue513;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindBottomLeftValue513 {
    /**
     * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
     * 假设二叉树中至少有一个节点。
     */
    public int findBottomLeftValue(TreeNode root) {
        if (root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> result=new ArrayList<>();
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> path=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                path.add(node.val);
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            result.add(path);
        }

        return result.get(result.size()-1).get(0);

    }
}
