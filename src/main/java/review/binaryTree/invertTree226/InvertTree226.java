package review.binaryTree.invertTree226;

public class InvertTree226 {
    /**
     * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        swap(root);
        return root;
    }

    private static void swap(TreeNode node){
        TreeNode temp = node.left;
        node.left=node.right;
        node.right=temp;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(9);
        System.out.println(invertTree(root));
    }
}
