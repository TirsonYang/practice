package review.binaryTree.levelOrderBottom107;

import java.util.*;

public class LevelOrderBottom107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        levelBottom(root,list);
        Collections.reverse(list);
        return list;
    }

    private void levelBottom(TreeNode root,List<List<Integer>> list){
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
            list.add(resList);
        }
    }
}
