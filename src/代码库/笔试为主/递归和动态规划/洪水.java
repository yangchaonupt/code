package 代码库.笔试为主.递归和动态规划;

import java.util.LinkedList;
import java.util.Queue;

/*
在一个nxm矩阵形状的城市里爆发了洪水，洪水从(0,0)的格子流到这个城市，
在这个矩阵中有的格子有一些建筑，洪水只能在没有建筑的格子流动。
请返回洪水流到(n - 1,m - 1)的最早时间
(洪水只能从一个格子流到其相邻的格子且洪水单位时间能从一个格子流到相邻格子)。

给定一个矩阵map表示城市，其中map[i][j]表示坐标为(i,j)的格子，
值为1代表该格子有建筑，0代表没有建筑。同时给定矩阵的大小n和m(n和m均小于等于100)，
请返回流到(n - 1,m - 1)的最早时间。保证洪水一定能流到终点。
 */
public class 洪水 {
    public static void main(String[] args) {

    }
    public int floodFill(int[][] map, int n, int m) {
        // write code here
        if (map==null){
            return 0;
        }
        Queue<point> queue = new LinkedList<>() ;
        point p = new point(0,0);
        queue.add(p);
        int res=0;
        while (!queue.isEmpty()){
            point temp=queue.poll();
            int x=temp.x;
            int y=temp.y;
            if (x==n-1&&y==m-1){
                break;
            }
            if (map[x][y+1]!=1){
                queue.add(new point(x,y+1));
            }
        }
        return 0;

    }
    public class point{
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
