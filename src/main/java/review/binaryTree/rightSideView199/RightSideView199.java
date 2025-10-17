package review.binaryTree.rightSideView199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */

public class RightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        rightView(root,list);
        return list;
    }

    private void rightView(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> resList=new ArrayList<>();
            int length= queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                resList.add(node.val);
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            list.add(resList.get(resList.size()-1));
        }
    }
}
