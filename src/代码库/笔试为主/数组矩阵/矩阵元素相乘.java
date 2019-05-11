package 代码库.笔试为主.数组矩阵;
/*
A[n,m]是一个n行m列的矩阵，a[i,j]表示A的第i行j列的元素，定义x[i,j]为A的第i行和第j列
除了a[i,j]之外所有元素(共n+m-2个)的乘积，
即x[i,j]=a[i,1]*a[i,2]*...*a[i,j-1]*...*a[i,m]*a[1,j]*a[2,j]...*a[i-1,j]*a[i+1,j]...*a[n,j],
现输入非负整形的矩阵A[n,m]，求MAX(x[i,j])，即所有的x[i,j]中的最大值。
输入描述:第一行两个整数n和m。之后n行输入矩阵，均为非负整数。
输出描述:一行输出答案。
示例1
输入
3 5
5 1 8 5 2
1 3 10 3 3
7 8 5 5 16
输出
358400
 */
import java.math.BigInteger;
import java.util.Scanner;

public class 矩阵元素相乘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[][] a = new long[n][m];
            for (int i = 0; i < n; i++){
                for (int j=0;j<m;j++){
                    a[i][j]=sc.nextLong();
                }
            }
            BigInteger res=new BigInteger(0 + "");
            long min=Integer.MAX_VALUE;
            int x=0;
            int y=0;
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    if (a[i][j]==0){
                        continue;
                    }
                    if (a[i][j]<=min){
                        x=i;
                        y=j;
                        min=a[i][j];

                        BigInteger temp=getMu(a,x,y);
                        if (temp.compareTo(res)>0){
                            res=temp;
                        }
                    }
                }

                min=Integer.MAX_VALUE;
            }
//            min=0;
//            for (int j=0;j<m;j++){
//                for (int i=0;i<n;i++){
//
//                    if (a[i][j]>min){
//                        x=i;
//                        y=j;
//                        min=a[i][j];
//                    }
//                }
//                BigInteger 矩阵_旋转打印_返回数组形式=getMu(a,x,y);
//                if (矩阵_旋转打印_返回数组形式.compareTo(res)>0){
//                    res=矩阵_旋转打印_返回数组形式;
//                }
//            }
            System.out.println(res);
        }


    }

    private static BigInteger getMu(long[][] a, int x, int y) {
        BigInteger res=new BigInteger(1 + "");
        for (int i=0;i<a.length;i++){
            res=res.multiply(new BigInteger(a[i][y] + ""));
        }
        for (int i=0;i<a[0].length;i++){
            res=res.multiply(new BigInteger(a[x][i] + ""));
        }
        res=res.divide(new BigInteger(a[x][y] + "")).divide(new BigInteger(a[x][y] + ""));
        return res;
    }
}
