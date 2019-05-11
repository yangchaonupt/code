package ����.����.ƴ���;
/*
����һ���������飬����������������0��Ҫ������ҳ�3�����ĳ˻���ʹ�ó˻����
Ҫ��ʱ�临�Ӷȣ�O(n)���ռ临�Ӷȣ�O(1)
��������:
��һ���������Сn���ڶ�����������������A[n]
�������:   �������������˻�
��������1:
4
3 4 1 2
�������1:  24
 */

import java.util.Scanner;

public class ���˻� {
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
