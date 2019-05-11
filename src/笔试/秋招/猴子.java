package ±  ‘.«Ô’–;

import java.util.*;
public class ∫Ô◊” {

    public static class monkey {
        private int str;
        private int hur;
        private int num;

        public monkey(int str, int hur, int num) {
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
            ArrayList<monkey> bearList = new ArrayList<>();
            int[] res = new int[n];
            for (int i = 0; i < m; i++) {
                al.add(sc.nextInt());
            }
            Collections.sort(al);
            for (int i = 0; i < n; i++) {
                bearList.add(new monkey(sc.nextInt(), sc.nextInt(), i));
            }
            Comparator<monkey> bearComparator = new Comparator<monkey>() {
                @Override
                public int compare(monkey o1, monkey o2) {
                    return o2.str - o1.str;
                }

            };
            Collections.sort(bearList, bearComparator);
            for (int i = 0; i < n; i++) {
                int r = bearList.get(i).hur;
                int num= bearList.get(i).num;
                for (int j = al.size() - 1; j > -1; j--) {
                    int peach = al.get(j);
                    if (peach != -1 && r >= peach) {
                        r = r - peach;
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
