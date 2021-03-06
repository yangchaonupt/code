package 代码库.笔试为主.递归和动态规划;

/*
有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，
要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
注意这次的网格中有些障碍点是不能走的。

给定一个int[][] map(C++ 中为vector >),表示网格图，
若map[i][j]为1则说明该点不是障碍点，否则则为障碍。另外给定int x,int y，表示网格的大小。
请返回机器人从(0,0)走到(x - 1,y - 1)的走法数，为了防止溢出，请将结果Mod 1000000007。保证x和y均小于等于50
 */
public class 机器人走方格2 {
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
                //注意因为机器人只能向下或者向右，所以当dp[i][0]==0时，它下面的所有都为0
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
                //注意因为机器人只能向下或者向右，所以当dp[0][j]==0时，它右面的所有都为0
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
