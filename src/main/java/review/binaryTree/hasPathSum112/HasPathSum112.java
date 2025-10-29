package review.binaryTree.hasPathSum112;

import java.util.ArrayList;
import java.util.List;

public class HasPathSum112 {
    /**
     * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
     * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
     * 如果存在，返回 true ；否则，返回 false 。
     * 叶子节点 是指没有子节点的节点。
     */

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        if (root==null){
            return false;
        }
        orderSum(list,root,0);
        return list.contains(targetSum);
    }

    private static int orderSum(List<Integer> list,TreeNode root,int sum){
        if (root==null){
            return sum;
        }
        sum=sum+root.val;
        if (root.left==null&&root.right==null){
            list.add(sum);
            return sum-root.val;
        }else {
            sum=orderSum(list,root.left,sum);
            sum=orderSum(list,root.right,sum);
            sum=sum-root.val;
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.right=new TreeNode(1);
        root.left.left=new TreeNode(11);
        root.left.left.right=new TreeNode(2);
        root.left.left.left=new TreeNode(7);

        System.out.println(hasPathSum(root,22));
    }

}
