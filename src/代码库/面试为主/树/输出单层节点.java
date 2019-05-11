package �����.����Ϊ��.��;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class �������ڵ� {
    /*
    ����һ�ö������������һ���㷨����������ĳһ��������н�������
    �����������ĸ����ָ��TreeNode* root���Լ������Ͻ�����ȣ�
    �뷵��һ������ListNode���������������н���ֵ���밴���ϴ������ҵ�˳�����ӣ�
    ��֤��Ȳ��������ĸ߶ȣ����Ͻ���ֵΪ�Ǹ������Ҳ�����100000��
     */
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //�ݹ�������������
    ListNode head = new ListNode(-1);
    ListNode now = head;
    public ListNode getTreeLevel2(TreeNode root, int dep) {
        // write code here
        if(root == null || dep <= 0){
            return null;
        }
        if(dep == 1){
            now.next = new ListNode(root.val);
            now = now.next;
        }
        getTreeLevel2(root.left, dep-1);
        getTreeLevel2(root.right, dep-1);
        return head.next;

    }

    public ListNode getTreeLevel1(TreeNode root, int dep) {
        if (root == null || dep < 1) {
            return null;
        }
        ArrayList<TreeNode> al = new ArrayList<>();
        LinkedList<ArrayList<TreeNode>> ll = new LinkedList<ArrayList<TreeNode>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int start=0,end=1;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            al.add(temp);
            start++;
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            if(start==end){
                end=queue.size();
                start=0;
                ll.add(al);
                al=new ArrayList<TreeNode>();
            }
        }
        ArrayList<TreeNode> treeNodes = ll.get(dep-1);
        ListNode cur=new ListNode(0);
        ListNode res=cur;
        for (TreeNode t: treeNodes) {
            ListNode temp=new ListNode(t.val);
            cur.next=temp;
            cur=cur.next;
        }
        cur.next=null;
        return res.next;
    }
}
