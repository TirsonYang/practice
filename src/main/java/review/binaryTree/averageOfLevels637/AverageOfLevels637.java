package review.binaryTree.averageOfLevels637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels637 {

    /**
     * 给定一个非空二叉树的根节点 root ,
     * 以数组的形式返回每一层节点的平均值。与实际答案相差 10-5 以内的答案可以被接受。
     */

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        average(root,list);
        return list;
    }

    private void average(TreeNode root,List<Double> list){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int length= queue.size();
            double sum=0;
            for (int i = 0; i < length; i++) {
                TreeNode node=queue.poll();
                sum+=node.val;
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }
            list.add(sum/length);
        }
    }
}
