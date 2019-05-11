package 代码库.面试为主.树;

import java.util.ArrayList;

/*
输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class 二叉树中和为某一值的路径 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    ArrayList<Integer> al= new ArrayList<>();
    ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root==null){
            return  allList;
        }
        al.add(root.val);
        target-=root.val;
        //此处是因为路径的定义是根到叶子节点
        if (target==0&&root.left==null&&root.right==null){
            //要新建一个ArrayList
            allList.add(new ArrayList<>(al));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        //移除最后一个元素，深度遍历完一条路径后要回退
        //递归到叶子节点如果还没有找到路径，就要回退到父节点继续寻找，依次类推
        al.remove(al.size()-1);
        return allList;
    }
}
