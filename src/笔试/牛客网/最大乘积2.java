package 笔试.牛客网;

import java.util.Arrays;


import java.util.Scanner;

public class 最大乘积2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            if (n==3){
                System.out.println(a[0]*a[1]*a[2]);
                return;
            }
            long max1=a[a.length-1];
            long max2=a[a.length-2];
            long max3=a[a.length-3];
            long min1=a[0];
            long min2=a[1];

            Long r1=max1*max2*max3;
            Long r2=max1*min1*min2;
            System.out.println(r1 > r2 ? r1 : r2);


        }

    }
}
