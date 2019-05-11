package �����.����Ϊ��.�������;


import java.util.*;

public class ����_��ת��ӡ_����������ʽ {
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
            if (tR == dR) { // �Ӿ���ֻ��һ��ʱ
                for (int i = tC; i <= dC; i++) {
                    res[index++]=mat[tR][i];
                }
            } else if (tC == dC) { // �Ӿ���ֻ��һ��ʱ
                for (int i = tR; i <= dR; i++) {
                    res[index++]=mat[i][tC];
                }
            } else { // һ�����
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
