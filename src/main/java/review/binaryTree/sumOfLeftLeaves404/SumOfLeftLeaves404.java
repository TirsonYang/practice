package review.binaryTree.sumOfLeftLeaves404;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves404 {
    /**
     * 给定二叉树的根节点 root ，返回所有左叶子之和。
     */
    public static int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        return orderSum(root,sum);
    }

    private static int orderSum(TreeNode root,int sum){
        if (root==null){
            return sum;
        }
        if (root.left!=null){
            if (root.left.left==null&&root.left.right==null)
            sum=sum+ root.left.val;
        }
        sum=orderSum(root.left,sum);
        sum=orderSum(root.right,sum);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));
    }
}
