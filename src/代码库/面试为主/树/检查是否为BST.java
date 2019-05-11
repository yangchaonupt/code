package 代码库.面试为主.树;
/*
请实现一个函数，检查一棵二叉树是否为二叉查找树。
给定树的根结点指针TreeNode root，请返回一个boolean，代表该树是否为二叉查找树。
二叉查找树条件：所有左边的结点必须小于或等于当前结点，而当前结点必须小于所有右边的结点
 */
public class 检查是否为BST {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean checkBST(TreeNode root) {
        // write code here
        return check(root, Integer.MAX_VALUE, Integer.MIN_VALUE);

    }

    private boolean check(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.val < min || root.val > max) {
            return false;
        }
        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }


}
