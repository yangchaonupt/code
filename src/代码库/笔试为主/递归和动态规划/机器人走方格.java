package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;
/*
��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�
Ҫ�����Ͻ��ߵ����½ǡ������һ���㷨������������ж������߷���
��������������int x,int y���뷵�ػ����˵��߷���Ŀ����֤x��yС�ڵ���12��

����������
2,2
���أ�2
 */
public class �������߷��� {
    //�����XYΪ����
    public int countWays(int x, int y) {
        // write code here
        int m=x+y-2;
        int n=x-1;
        int a=1;
        int b=1;
        if (m-n<n){
            n=m-n;
        }
        for (int i=0;i<n;i++){
            a*=m;
            m--;
        }
        for (int i=n;i>1;i--){
            b*=i;
        }
        return a/b;
    }

    public int countWays2(int x, int y) {
        // write code here
        int dp[][] = new int[x][y];
        for(int i = 0; i < x; i++){
            dp[i][0] = 1;
        }
        for(int j =0; j< y; j++){
            dp[0][j] = 1;
        }
        for(int i = 1; i< x;i++){
            for(int j =1;j<y;j++){
                //�ߵ�i��j�Ļ�����ֻ�����������ط����󷽺��Ϸ�����dp[i-1][j]��dp[i][j-1]
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[x-1][y-1];
    }

}
