package review.binaryTree.isBalanced110;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsBalanced110 {

    /**
     * 给定一个二叉树，判断它是否是 平衡二叉树
     * 平衡二叉树 是指该树所有节点的左右子树的高度相差不超过 1。
     */

    public static boolean isBalanced(TreeNode root) {
        return getHeight(root)!=-1;
    }

    private static int getHeight(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        if (leftHeight==-1){
            return -1;
        }
        int rightHeight=getHeight(root.right);
        if (rightHeight==-1){
            return -1;
        }
        if (Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }else {
            return Math.max(leftHeight,rightHeight)+1;
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.right=new TreeNode(7);
        root.right.left=new TreeNode(15);
        System.out.println(isBalanced(root));
    }

}
