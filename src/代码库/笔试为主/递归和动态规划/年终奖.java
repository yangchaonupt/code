package 代码库.笔试为主.递归和动态规划;
/*
小东所在公司要发年终奖，而小东恰好获得了最高福利，他要在公司年会上参与一个抽奖游戏，
游戏在一个6*6的棋盘上进行，上面放着36个价值不等的礼物，每个小的棋盘上面放置着一个礼物，
他需要从左上角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，
一路上的格子里的礼物小东都能拿到，请设计一个算法使小东拿到价值最高的礼物。

给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,左上角为[0,0],
请返回能获得的最大价值，保证每个礼物价值大于100小于1000。
 */
import java.util.Scanner;

public class 年终奖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
    }
    public class Bonus {
        public int getMost(int[][] board) {
            // write code here
            int [][] price=new int [6][6];
            price[0][0]=board[0][0];
            for(int i=1;i<6;i++){
                price[0][i]=price[0][i-1]+board[0][i];
            }
            for(int i=1;i<6;i++){
                price[i][0]=price[i-1][0]+board[i][0];
            }
            for(int i=1;i<6;i++){
                for(int j=1;j<6;j++){
                    price[i][j]=Math.max(price[i-1][j],price[i][j-1])+board[i][j];
                }
            }
            return price[5][5];

        }
    }
}
