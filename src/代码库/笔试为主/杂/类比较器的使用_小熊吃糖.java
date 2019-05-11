package 代码库.笔试为主.杂;
/*
有n只小熊，他们有着各不相同的战斗力。每次他们吃糖时，会按照战斗力来排，战斗力高的小熊拥有优先选择权。
前面的小熊吃饱了，后面的小熊才能吃。每只小熊有一个饥饿值，每次进食的时候，
小熊们会选择最大的能填饱自己当前饥饿值的那颗糖来吃，可能吃完没饱会重复上述过程，但不会选择吃撑。
现在给出n只小熊的战斗力和饥饿值，并且给出m颗糖能填饱的饥饿值。
求所有小熊进食完之后，每只小熊剩余的饥饿值。

输入描述:
第一行两个正整数n和m，分别表示小熊数量和糖的数量。（n <= 10, m <= 100）
第二行m个正整数，每个表示着颗糖能填充的饥饿值。
接下来的n行，每行2个正整数，分别代表每只小熊的战斗力和当前饥饿值。
题目中所有输入的数值小于等于100。
输出描述:
输出n行，每行一个整数，代表每只小熊剩余的饥饿值。
输入例子1:
2 5
5 6 10 20 30
4 34
3 35
输出例子1:
4
0
例子说明1:
第一只小熊吃了第5颗糖
第二只小熊吃了第4颗糖
第二只小熊吃了第3颗糖
第二只小熊吃了第1颗糖
 */

import java.util.*;

public class 类比较器的使用_小熊吃糖 {

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
