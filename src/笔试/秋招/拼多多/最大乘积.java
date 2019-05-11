package 笔试.秋招.拼多多;
/*
给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，
要求时间复杂度：O(n)，空间复杂度：O(1)
输入描述:
第一行是数组大小n，第二行是无序整数数组A[n]
输出描述:   满足条件的最大乘积
输入例子1:
4
3 4 1 2
输出例子1:  24
 */

import java.util.Scanner;

public class 最大乘积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long max1 = Integer.MIN_VALUE;
            long max2 = Integer.MIN_VALUE;
            long max3 = Integer.MIN_VALUE;
            long min1 = Integer.MAX_VALUE;
            long min2 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = a[i];


                } else if (a[i] > max2) {
                    max3 = max2;
                    max2 = a[i];

                } else if (a[i] > max3) {
                    max3 = a[i];
                }

                if (a[i] < min1) {
                    min2 = min1;
                    min1 = a[i];

                } else if (a[i]<min2){
                    min2=a[i];
                }
            }

            long r1=max1*max2*max3;
            long r2=max1*min1*min2;
            System.out.println(r1>r2?r1:r2);

        }

    }
}
