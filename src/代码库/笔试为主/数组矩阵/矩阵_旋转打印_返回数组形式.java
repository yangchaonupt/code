package 代码库.笔试为主.数组矩阵;


import java.util.*;

public class 矩阵_旋转打印_返回数组形式 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int[] res=clockwisePrint(matrix,4,4);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+",");
        }
    }
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        int tR = 0;
        int tC = 0;
        int dR = mat.length - 1;
        int dC = mat[0].length - 1;
        int [] res=new int [n*m];
        int index=0;
        while (tR <= dR && tC <= dC) {
            if (tR == dR) { // 子矩阵只有一行时
                for (int i = tC; i <= dC; i++) {
                    res[index++]=mat[tR][i];
                }
            } else if (tC == dC) { // 子矩阵只有一列时
                for (int i = tR; i <= dR; i++) {
                    res[index++]=mat[i][tC];
                }
            } else { // 一般情况
                int curC = tC;
                int curR = tR;
                while (curC != dC) {
                    res[index++]=mat[tR][curC];
                    curC++;
                }
                while (curR != dR) {
                    res[index++]=mat[curR][dC];
                    curR++;
                }
                while (curC != tC) {
                    res[index++]=mat[dR][curC] ;
                    curC--;
                }
                while (curR != tR) {
                    res[index++]=mat[curR][tC] ;
                    curR--;
                }
            }
            tR++;
            tC++;
            dR--;
            dC--;
        }
        return res;
    }






}
