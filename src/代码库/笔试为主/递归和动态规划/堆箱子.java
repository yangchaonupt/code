package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
��һ�����ӣ�ÿ�����ӿ�Ϊwi����Ϊdi����Ϊhi��������Ҫ�����Ӷ���������
����Ϊ��ʹ�����������Ӳ�������������ӵĿ�Ⱥͳ��ȱ���С����������ӡ�
��ʵ��һ������������ܶѳ�����ߵĸ߶ȣ�����ĸ߶ȼ����������������ӵĸ߶�֮�͡�

��������int����w,l,h���ֱ��ʾÿ�����ӿ����͸ߣ�ͬʱ�������ӵ���Ŀn��
�뷵���ܶѳɵ���ߵĸ߶ȡ���֤nС�ڵ���500��
����������[1,1,1],[1,1,1],[1,1,1]    ���أ�1
 */
public class ������ {
    public static void main(String[] args) {
        int[] w = {2768, 542, 832, 844, 2920, 587, 72, 1724, 447, 809, 672, 2393, 1235, 2775, 273, 1165, 1809, 111, 1263, 2751, 1068, 2507, 453, 65, 2338, 1103, 1093, 2327, 1995, 1125, 2340, 1133, 2123, 1692, 2215, 140, 1822, 2144, 2240, 2916, 1860, 2226, 698, 846, 2177, 295};
        int[] l = {821,2593,1581,2891,2853,1662,2747,2856,2178,865,383,523,809,998,312,237,1871,2730,823,676,568,1839,2063,1651,2704,2113,1316,2892,1874,270,1112,869,1099,1876,371,2298,2070,1514,2916,165,1043,1355,2852,1319,1979,1961};
        int [] h = {771,2963,1599,1910,2317,2884,872,2463,949,341,2718,1500,1071,539,2463,1355,104,2989,1240,240,981,0,2172,3011,621,681,1178,2518,2766,615,460,2399,2443,2894,799,1726,2454,2099,2279,2911,2018,426,2896,224,2663,351};
        int res=getHeight(w,l,h,46);
        System.out.println(res);
    }

    public static int getHeight(int[] w, int[] l, int[] h, int n) {
        ArrayList<Boxs> al = new ArrayList<>();
        Boxs b;
        for (int i = 0; i < n; i++) {
            b = new Boxs(w[i], l[i], h[i]);
            al.add(b);
        }
        Collections.sort(al, new Comparator<Boxs>() {
            @Override
            public int compare(Boxs o1, Boxs o2) {
                return o2.height - o1.height;
            }
        });
        int res = al.get(0).width;
        for (int i = 1; i < al.size(); ) {
            if (al.get(i).height == al.get(i - 1).height) {
                al.remove(al.get(i));
            } else if (al.get(i).length >= al.get(i - 1).length) {
                al.remove(al.get(i));
            } else {
                res += al.get(i).width;
                i++;
            }

        }
        return res;
    }

    public static class Boxs {
        private int width;
        private int length;
        private int height;

        public Boxs(int width, int length, int height) {
            this.width = width;
            this.length = length;
            this.height = height;
        }
    }
}
