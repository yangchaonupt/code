package 代码库.笔试为主.数组矩阵;

import java.util.ArrayList;

public class 矩阵_之字形打印_返回数组形式 {
    public static int[] printMatrix(int[][] mat, int n, int m) {
        ArrayList<Integer> al = new ArrayList<>();
        int tR = 0;
        int tC = 0;
        int dR = 0;
        int dC = 0;
        int endR = mat.length - 1;
        int endC = mat[0].length - 1;
        boolean fromUp = false;
        while (tR != endR + 1) {
            printLevel(mat, tR, tC, dR, dC, fromUp, al);
            tR = tC == endC ? tR + 1 : tR;
            tC = tC == endC ? tC : tC + 1;
            dC = dR == endR ? dC + 1 : dC;
            dR = dR == endR ? dR : dR + 1;
            fromUp = !fromUp;
        }
        int[] res = new int[n * m];
        for (int i = 0; i < res.length; i++) {
            res[i] = al.get(i);
        }
        return res;

    }

    public static void printLevel(int[][] m, int tR, int tC, int dR, int dC,
                                  boolean f, ArrayList<Integer> al) {
        if (f) {
            while (tR != dR + 1) {
                al.add(m[tR++][tC--]);
            }
        } else {
            while (dR != tR - 1) {
                al.add(m[dR--][dC++]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{85,40,61,54,9},{59,9,74,25,91},{68,97,33,91,91},{26,67,37,33,80},{24,8,19,32,65},{28,9,41,2,0},{4,41,48,99,9},{43,50,55,6,2},{95,30,8,62,1}};
        int[] res = printMatrix(matrix, 9, 5);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
}
