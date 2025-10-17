package review.binaryTree.preorderTraversal144;

import java.util.ArrayList;
import java.util.List;


/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */

public class PreorderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }

    private void preOrder(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}
