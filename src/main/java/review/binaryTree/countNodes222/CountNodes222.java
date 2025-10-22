package review.binaryTree.countNodes222;

import java.util.ArrayList;
import java.util.List;

public class CountNodes222 {
    /**
     * 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
     * 完全二叉树 的定义如下：
     * 在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，
     * 并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层（从第 0 层开始），
     * 则该层包含 1~ 2h 个节点。
     */

    public int countNodes(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preOrder(root,list);
        return list.size();
    }

    private void preOrder(TreeNode root,List<TreeNode> list){
        if (root==null){
            return;
        }
        list.add(root);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}
