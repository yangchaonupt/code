package �����.����Ϊ��.��;
/*
��nֻС�ܣ��������Ÿ�����ͬ��ս������ÿ�����ǳ���ʱ���ᰴ��ս�������ţ�ս�����ߵ�С��ӵ������ѡ��Ȩ��
ǰ���С�ܳԱ��ˣ������С�ܲ��ܳԡ�ÿֻС����һ������ֵ��ÿ�ν�ʳ��ʱ��
С���ǻ�ѡ����������Լ���ǰ����ֵ���ǿ������ԣ����ܳ���û�����ظ��������̣�������ѡ��Գš�
���ڸ���nֻС�ܵ�ս�����ͼ���ֵ�����Ҹ���m��������ļ���ֵ��
������С�ܽ�ʳ��֮��ÿֻС��ʣ��ļ���ֵ��

��������:
��һ������������n��m���ֱ��ʾС���������ǵ���������n <= 10, m <= 100��
�ڶ���m����������ÿ����ʾ�ſ��������ļ���ֵ��
��������n�У�ÿ��2�����������ֱ����ÿֻС�ܵ�ս�����͵�ǰ����ֵ��
��Ŀ�������������ֵС�ڵ���100��
�������:
���n�У�ÿ��һ������������ÿֻС��ʣ��ļ���ֵ��
��������1:
2 5
5 6 10 20 30
4 34
3 35
�������1:
4
0
����˵��1:
��һֻС�ܳ��˵�5����
�ڶ�ֻС�ܳ��˵�4����
�ڶ�ֻС�ܳ��˵�3����
�ڶ�ֻС�ܳ��˵�1����
 */

import java.util.*;

public class ��Ƚ�����ʹ��_С�ܳ��� {

    public static class bear {
        private int str;
        private int hur;
        private int num;

        public bear(int str, int hur, int num) {
            this.str = str;
            this.hur = hur;
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            ArrayList<bear> bearList = new ArrayList<>();
            int[] res = new int[n];
            for (int i = 0; i < m; i++) {
                al.add(sc.nextInt());
            }
            Collections.sort(al);
            for (int i = 0; i < n; i++) {
                bearList.add(new bear(sc.nextInt(), sc.nextInt(), i));
            }
            Comparator<bear> bearComparator = new Comparator<bear>() {
                @Override
                public int compare(bear o1, bear o2) {
                    return o2.str - o1.str;
                }

            };
            Collections.sort(bearList, bearComparator);
            for (int i = 0; i < n; i++) {
                int r = bearList.get(i).hur;
                int num= bearList.get(i).num;
                for (int j = al.size() - 1; j > -1; j--) {
                    int suger = al.get(j);
                    if (suger != -1 && r >= suger) {
                        r = r - suger;
                        al.set(j, -1);
                    }
                }
                res[num]=r;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(res[i]);
            }
        }

    }
}
