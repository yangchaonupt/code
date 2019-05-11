package 代码库.笔试为主.数组矩阵;

/*
有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
给定数组A及它的大小n，请返回最大差值。
测试样例： [10,5],2    返回：0
 */
public class 最大差值 {
    public int getDis(int[] A, int n) {
        if (n < 2) {
            return 0;
        }
        int min = A[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] - min > max) {
                max = A[i] - min;//如果差大于现在存的最大差值，更新
            }
            if (A[i] < min) {
                min = A[i];//更新最小值
            }
        }
        return max;
    }

    public int getDis2(int[] A, int n) {
        if (A.length < 2) {
            return 0;
        }
        int max = 0;
        int temp = 0;
        int[] cu = new int[n];
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                cu[i] = cu[i - 1] + A[i] - A[i - 1];
            } else {
                int j = i - 2;
                while (j >= 0) {
                    if (A[i] > A[j]) {
                        cu[i] = cu[j] + A[i] - A[j];
                        break;
                    } else {
                        j--;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (cu[i] > max) {
                max = cu[i];
            }
        }
        return max;
    }
}
