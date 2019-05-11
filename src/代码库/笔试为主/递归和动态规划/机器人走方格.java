package 代码库.笔试为主.递归和动态规划;
/*
有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，
要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。

测试样例：
2,2
返回：2
 */
public class 机器人走方格 {
    //这里的XY为点数
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
                //走到i，j的机器人只能来自两个地方，左方和上方，即dp[i-1][j]和dp[i][j-1]
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[x-1][y-1];
    }

}
