package review.binaryTree.levelOrder429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder429 {

    /**
     * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
     * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        level(root,list);
        return list;
    }

    private void level(Node root,List<List<Integer>> list){
        if (root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> resList=new ArrayList<>();
            int length= queue.size();
            for (int i = 0; i < length; i++) {
                Node node=queue.poll();
                resList.add(node.val);
                if (node.children!=null&&!node.children.isEmpty()){
                    for (Node child : node.children) {
                        if (child!=null) queue.offer(child);
                    }
                }
            }
            list.add(resList);
        }
    }
}
