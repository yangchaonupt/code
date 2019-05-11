package �����.����Ϊ��.�������;
/*
A[n,m]��һ��n��m�еľ���a[i,j]��ʾA�ĵ�i��j�е�Ԫ�أ�����x[i,j]ΪA�ĵ�i�к͵�j��
����a[i,j]֮������Ԫ��(��n+m-2��)�ĳ˻���
��x[i,j]=a[i,1]*a[i,2]*...*a[i,j-1]*...*a[i,m]*a[1,j]*a[2,j]...*a[i-1,j]*a[i+1,j]...*a[n,j],
������Ǹ����εľ���A[n,m]����MAX(x[i,j])�������е�x[i,j]�е����ֵ��
��������:��һ����������n��m��֮��n��������󣬾�Ϊ�Ǹ�������
�������:һ������𰸡�
ʾ��1
����
3 5
5 1 8 5 2
1 3 10 3 3
7 8 5 5 16
���
358400
 */
import java.math.BigInteger;
import java.util.Scanner;

public class ����Ԫ����� {
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
//                BigInteger ����_��ת��ӡ_����������ʽ=getMu(a,x,y);
//                if (����_��ת��ӡ_����������ʽ.compareTo(res)>0){
//                    res=����_��ת��ӡ_����������ʽ;
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
