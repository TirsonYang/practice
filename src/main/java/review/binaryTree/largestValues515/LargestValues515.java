package review.binaryTree.largestValues515;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValues515 {
    /**
     * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        largeLevel(root,list);
        return list;
    }


    private void largeLevel(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int length = queue.size();
            int max=-2147483648;
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if (node.val>max) max=node.val;
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            list.add(max);
        }
    }
}
