package 代码库.笔试为主.数组矩阵;

public class 矩阵顺时针旋转90度 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printmatrix(a);
        matrixRotation(a);
        printmatrix(a);

    }



    public static void matrixRotation(int[][] a) {
        int n = a.length;
        int lim = (n - 1) / 2;
        for (int i = 0; i <= lim; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = a[i][j];
                a[i][j] = a[n - 1 - j][i];
                a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];
                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
                a[j][n - 1 - i] = temp;
            }
        }

    }
    private static void printmatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
