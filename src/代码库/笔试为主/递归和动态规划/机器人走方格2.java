package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;

/*
��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�
Ҫ�����Ͻ��ߵ����½ǡ������һ���㷨������������ж������߷���
ע����ε���������Щ�ϰ����ǲ����ߵġ�

����һ��int[][] map(C++ ��Ϊvector >),��ʾ����ͼ��
��map[i][j]Ϊ1��˵���õ㲻���ϰ��㣬������Ϊ�ϰ����������int x,int y����ʾ����Ĵ�С��
�뷵�ػ����˴�(0,0)�ߵ�(x - 1,y - 1)���߷�����Ϊ�˷�ֹ������뽫���Mod 1000000007����֤x��y��С�ڵ���50
 */
public class �������߷���2 {
    public static void main(String[] args) {
        int [][] map={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,0,1,1},{0,1,1,1},{1,1,1,1},{1,1,1,1}};
        printMatrix(map);
        System.out.println("=====================");
        int [][] res=countWays(map,11,4);
        printMatrix(res);
    }

    public static int[][] countWays(int[][] map, int x, int y) {
        int[][] dp = new int[x][y];
        for (int i=0;i<x;i++){
            if (map[i][0]==1){
                dp[i][0]=1;
            }else {
                //ע����Ϊ������ֻ�����»������ң����Ե�dp[i][0]==0ʱ������������ж�Ϊ0
                for (int k=i;k<x;k++){
                    dp[k][0]=0;
                }
                break;
            }
        }
        for (int i=0;i<y;i++){
            if (map[0][i]==1){
                dp[0][i]=1;
            }else {
                //ע����Ϊ������ֻ�����»������ң����Ե�dp[0][j]==0ʱ������������ж�Ϊ0
                for (int k=i;k<y;k++){
                    dp[0][k]=0;
                }
                break;
            }
        }
        for (int i=1;i<x;i++){
            for (int j=1;j<y;j++){
                if (map[i][j]==1){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }else {
                    dp[i][j]=0;
                }
            }
        }
        return dp;
    }

    public static   void printMatrix(int [][] a){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+",");
            }
            System.out.println("");
        }
    }
}
