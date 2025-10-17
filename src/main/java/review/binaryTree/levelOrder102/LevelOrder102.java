package review.binaryTree.levelOrder102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        level(root,list);
        return list;
    }

    private void level(TreeNode root,List<List<Integer>> list){
        if (root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> lst=new ArrayList<>();
            int length= queue.size();
            for (int i=0;i<length;i++) {
                TreeNode node = queue.poll();
                lst.add(node.val);
                if (node.left!=null) queue.offer(node.left);
                if (node.right!=null) queue.offer(node.right);
            }

            list.add(lst);
        }
    }
}
