package �����.����Ϊ��.��;

import java.util.ArrayList;

/*
����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 */
public class �������к�Ϊĳһֵ��·�� {
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
        //�˴�����Ϊ·���Ķ����Ǹ���Ҷ�ӽڵ�
        if (target==0&&root.left==null&&root.right==null){
            //Ҫ�½�һ��ArrayList
            allList.add(new ArrayList<>(al));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        //�Ƴ����һ��Ԫ�أ���ȱ�����һ��·����Ҫ����
        //�ݹ鵽Ҷ�ӽڵ������û���ҵ�·������Ҫ���˵����ڵ����Ѱ�ң���������
        al.remove(al.size()-1);
        return allList;
    }
}
