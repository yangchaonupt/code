package �����.����Ϊ��.��;

import java.util.ArrayList;

/*
�����һ���㷨��Ѱ�Ҷ�������ָ��������һ����㣨����������ĺ�̣���
�������ĸ����ָ��TreeNode* root�ͽ���ֵint p���뷵��ֵΪp�Ľ��ĺ�̽���ֵ��
��֤����ֵ���ڵ�����С�ڵ���100000��û���ظ�ֵ���������ں�̷���-1��
 */
public class Ѱ����һ���ڵ� {
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
