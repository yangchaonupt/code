package ����.����.ƴ���;

import java.util.*;

/*
ƴ��������ĳ��к͵�·�����˽ṹ�Ƚ��ر���һ����״�ṹ��
1. ÿ������������һ���ڵ㣻
2. ����֮��ĵ�·������һ���ߣ�
3. ���ĸ��ڵ����׶���
ƴ������������Ͼ�Ҫ���ˣ�����ƴ���������һ�������ӡ�Ϊ�˻�Ծ���գ��������ڵ�·�ϲ��û��ơ�
���ƿ��Ǻܹ�Ķ��������ܹ�����Ҫ�����е�·�϶����û��ƣ��������Ҫ��̫��Ǯ�Ļ���
�ǹ����˲�������һ�صġ�����������ƻ����߲����󳼣�����������ֳ�����ôһ��������
1. һ����·Ҫô�����û��ƣ�Ҫô�������û��ƣ�����ѡ�����е�ĳһ�β��ã�
2. ����û�е�·ͨ���׶�����������Ϊһ��ͨ���׶��ĵ�·���û��ƣ�
3. ���в��û��Ƶĵ�·���ɵ���ͼ����ͨ�ģ��Ᵽ֤�������׶���������ͨ��ֻ�߲����˻��Ƶĵ�·�������еĻ��������ꣻ
4. ���ĳ�����У������׶����д��ڵ���2����·ͨ���ӳ��У�Ϊ�˷�ֹ�����˷ѣ����ֻ��ѡ�����е�����·���û��ƣ�
5. ���û��Ƶĵ�·���ܳ����趨һ�����ޡ�
�����������£�������Ҫʹ�ò��û��Ƶĵ�·����Խ��Խ�ã�����������취��
��������:
ÿ�������������1������������
����ĵ�һ����һ��������m��0<m<=9900����ʾ���û��Ƶĵ�·���ܳ��ȵ����ޡ�
����ĵڶ�����һ��������n��n<=100����ʾ���еĸ�����
��������n-1�����룬ÿ������������u��v��d����ʾ�±�Ϊu�ĳ�����һ������Ϊd�ĵ�·ͨ������һ���ӳ���v������0<=u<n��0<=v<n��0<d<=100��
�������
���һ������������ʾ�ܲ��û��Ƶĵ�·���ȵ����ֵ
��������1:
5
5
0 1 1
0 2 2
0 3 3
0 4 4
�������1:  5
 */
public class ���е�· {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int limit = sc.nextInt();
            int len = sc.nextInt();
            List<List<Integer>> sons = new ArrayList<List<Integer>>();
            for (int i = 0; i < len; i++) {
                sons.add(new ArrayList<Integer>());
            }
            int[] father = new int[len];
            Arrays.fill(father, -1);
            int[] d = new int[len];
            int root = 0;
            for (int i = 0; i < len - 1; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                int value = sc.nextInt();
                d[end] = value;
                sons.get(start).add(end);
                father[end] = start;
            }
            while (root < father.length && father[root] != -1) {
                root++;
            }
            TreeSet<Integer> res = dfs(root, sons, d, limit);
            System.out.println(res.size() == 0 ? 0 : res.last());
        }
        sc.close();

    }

    public static TreeSet<Integer> dfs(int root, List<List<Integer>> sons, int[] d, int limit) {

        if (sons.get(root).size() == 0) {
            TreeSet<Integer> temp = new TreeSet<Integer>();
            temp.add(0);
            return temp;
        }
        List<TreeSet<Integer>> sts = new ArrayList<TreeSet<Integer>>();
        List<Integer> list = sons.get(root);
        for (int i = 0; i < list.size(); i++) {
            sts.add(dfs(list.get(i), sons, d, limit));
        }
        TreeSet<Integer> res = new TreeSet<Integer>();
        res.add(0);
        for (int i = 0; i < sts.size(); i++) {
            TreeSet<Integer> set = sts.get(i);
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int temp = it.next();
                if (d[sons.get(root).get(i)] + temp <= limit) {
                    res.add(d[sons.get(root).get(i)] + temp);
                }
            }
        }
        for (int i = 0; i + 1 < sts.size(); i++) {
            for (int j = i + 1; j < sts.size(); j++) {
                TreeSet<Integer> set1 = sts.get(i);
                TreeSet<Integer> set2 = sts.get(j);
                for (Integer temp1 : set1) {
                    for (Integer temp2 : set2) {
                        if (d[sons.get(root).get(i)] + d[sons.get(root).get(j)] + temp1 + temp2 <= limit) {
                            res.add(d[sons.get(root).get(i)] + d[sons.get(root).get(j)] + temp1 + temp2);
                        }
                    }
                }
            }
        }
        return res;
    }
}
