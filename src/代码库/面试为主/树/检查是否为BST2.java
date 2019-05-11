package �����.����Ϊ��.��;

import java.util.ArrayList;
//�������Ϊ��������
public class ����Ƿ�ΪBST2 {
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
        ArrayList<Integer> al = new ArrayList<>();
        mid(root,al);
        for (int i =1;i<al.size();i++){
            if (al.get(i)<al.get(i-1)){
                return false;
            }
        }
        return true;
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
