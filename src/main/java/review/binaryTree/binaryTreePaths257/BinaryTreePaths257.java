package review.binaryTree.binaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        StringBuilder path=new StringBuilder();
        order(root,result,path);
        return result;
    }

    private static void order(TreeNode root,List<String> result,StringBuilder path){
        if(root==null){
            return;
        }
        int length=path.length();
        path.append(root.val);
        if (root.right==null&&root.left==null){
            result.add(path.toString());
        }else {
            path.append("->");
            order(root.left,result,path);
            order(root.right,result,path);
        }
        path.setLength(length);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(5);
        System.out.println(binaryTreePaths(root));
    }
}
