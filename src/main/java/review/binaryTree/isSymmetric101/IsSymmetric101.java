package review.binaryTree.isSymmetric101;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IsSymmetric101 {
    /**
     * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
     */
    public static boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }

    private static boolean compare(TreeNode left,TreeNode right){
        if (left!=null&&right==null){
            return false;
        }
        if (left==null&&right!=null){
            return false;
        }
        if (left==null&&right==null){
            return true;
        }
        if (left.val!=right.val){
            return false;
        }
        boolean a=compare(left.left,right.right);
        boolean b=compare(left.right,right.left);
        return a&b;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.right=new TreeNode(3);
        root.right.right=new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}
