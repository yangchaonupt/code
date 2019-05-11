package 代码库.笔试为主.递归和动态规划;

/*
现在有一个城市销售经理，需要从公司出发，去拜访市内的商家，
已知他的位置以及商家的位置，但是由于城市道路交通的原因，
他只能在左右中选择一个方向，在上下中选择一个方向，现在问他有多少种方案到达商家地址。

给定一个地图map及它的长宽n和m，其中1代表经理位置，2代表商家位置，
-1代表不能经过的地区，0代表可以经过的地区，
请返回方案数，保证一定存在合法路径。保证矩阵的长宽都小于等于10。

测试样例：
[[0,1,0],[2,0,0]],2,3
返回：2
 */
public class 拜访 {
    public int countPath(int[][] map, int n, int m) {
        int magx = 0;
        int magy = 0;
        int busx = 0;
        int busy = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    magx = i;
                    magy = j;
                }
                if (map[i][j] == 2) {
                    busx = i;
                    busy = j;
                }
            }
        }
        int[][] dp = new int[Math.abs(magx-busx)][Math.abs(magy-busy)];
        if (magx <= busx) {
            if (magy <= busy) {
            }else {
                int temp=magy;
                magy=busy;
                busy=temp;
            }
        }else {
            if (magy<=busy){
                int temp=magx;
                magx=busx;
                busx=temp;
            }else {
                int temp=magx;
                magx=busx;
                busx=temp;
                temp=magy;
                magy=busy;
                busy=temp;
            }
        }
        //初始化
        for (int i=magy+1;i<busy;i++){
            if (map[0][i]==-1){
                break;
            }else {
                dp[0][i-magy]=dp[0][i-magy-1]+1;
            }
        }
        for (int i=magx+1;i<busx;i++){
            if (map[i][0]==-1){
                break;
            }else {
                dp[i-magx][0]=dp[i-magx-1][0]+1;
            }
        }
        //遍历，生成dp
        for (int i=1;i<busx-magx;i++){
            for (int j=1;j<busy-magy;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[Math.abs(magx-busx)-1][Math.abs(magy-busy)-1];
    }
}
