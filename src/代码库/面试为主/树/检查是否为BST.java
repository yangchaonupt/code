package �����.����Ϊ��.��;
/*
��ʵ��һ�����������һ�ö������Ƿ�Ϊ�����������
�������ĸ����ָ��TreeNode root���뷵��һ��boolean����������Ƿ�Ϊ�����������
���������������������ߵĽ�����С�ڻ���ڵ�ǰ��㣬����ǰ������С�������ұߵĽ��
 */
public class ����Ƿ�ΪBST {
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
