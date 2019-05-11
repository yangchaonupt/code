package 代码库.工具;

public class 根据数组生成二叉树 {
    public static void main(String[] args) {
        char[] c={7,6,'#',4,'#',2,5,1,3,'#','#','#','#','#','#'};
    }
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void generateTree(char[] c) {
        for (int i=0;i<c.length;i++){
            if (c[i]=='#'){
                TreeNode root=null;
            }
            TreeNode root=new TreeNode(c[i]-'0');

        }
    }
}
