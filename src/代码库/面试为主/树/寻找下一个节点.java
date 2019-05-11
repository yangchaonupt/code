package 代码库.面试为主.树;

import java.util.ArrayList;

/*
请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。
给定树的根结点指针TreeNode* root和结点的值int p，请返回值为p的结点的后继结点的值。
保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。
 */
public class 寻找下一个节点 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int findSucc(TreeNode root, int p) {
        // write code here
        ArrayList<Integer> al = new ArrayList<>();
        mid(root,al);
        for (int i =0;i<al.size();i++){
            if (al.get(i)==p){
                if (i==al.size()-1){
                    return -1;
                }
                return al.get(i+1);
            }
        }
        return -1;
    }

    private void mid(TreeNode root, ArrayList<Integer> al) {
        if (root==null){
            return;
        }
        mid(root.left,al);
        al.add(root.val);
        mid(root.right,al);
    }
}
