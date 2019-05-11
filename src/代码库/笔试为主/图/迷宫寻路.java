package 代码库.笔试为主.图;

import java.util.*;
/*
假设一个探险家被困在了地底的迷宫之中，要从当前位置开始找到一条通往迷宫出口的路径。
迷宫可以用一个二维矩阵组成，有的部分是墙，有的部分是路。迷宫之中有的路上还有门，
每扇门都在迷宫的某个地方有与之匹配的钥匙，只有先拿到钥匙才能打开门。请设计一个算法，
帮助探险家找到脱困的最短路径。如前所述，迷宫是通过一个二维矩阵表示的，
每个元素的值的含义如下 0-墙，1-路，2-探险家的起始位置，3-迷宫的出口，
大写字母-门，小写字母-对应大写字母所代表的门的钥匙
输入描述:
迷宫的地图，用二维矩阵表示。第一行是表示矩阵的行数和列数M和N
后面的M行是矩阵的数据，每一行对应与矩阵的一行（中间没有空格）。M和N都不超过100, 门不超过10扇。
输出描述:   路径的长度，是一个整数
示例1
输入
5 5
02111
01a0A
01003
01001
01111
输出  7
 */
public class 迷宫寻路 {

    static class Node{
        int x;
        int y;
        int key;
        int step;
        public Node(int x,int y,int key,int step){
            this.x=x;
            this.y=y;
            this.key=key;
            this.step=step;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        in.nextLine();
        char[][] G=new char[N][M];
        for(int i=0;i<N;i++){
            G[i]=in.nextLine().toCharArray();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(G[i][j]=='2'){
                    System.out.println(bfs(i,j,N,M,G));
                    return;
                }
            }
        }
    }
    private static int bfs(int si, int sj,int N,int M,char[][] G) {
        Queue<Node> queue=new LinkedList<>();
        //第三个保存钥匙状态
        int[][][] mp=new int[101][101][1025];
        //代表四个方向
        int[][] next={{-1,0},{0,-1},{1,0},{0,1}};

        queue.offer(new Node(si,sj,0,0));
        while(!queue.isEmpty()){
            Node node=queue.poll();
            for(int i=0;i<4;i++){
                int x=node.x+next[i][0];
                int y=node.y+next[i][1];
                int key=node.key;
                //越界跳过
                if(x<0||x>=N||y<0||y>=M||G[x][y]=='0') {
                    continue;
                } else if(G[x][y]=='3') {
                    //到达终点，返回步数+1
                    return node.step+1;
                } else if(G[x][y]<='z'&&G[x][y]>='a') {
                    //遇见钥匙。左移钥匙的位数
                    key=key|(1<<(G[x][y]-'a'));
                } else if(G[x][y]<='Z'&&G[x][y]>='A'&&(key&(1<<(G[x][y]-'A')))==0) {
                    //用左移钥匙位数为0，代表此时没有对应的钥匙，跳过
                    continue;
                }
                //没有到过
                if(mp[x][y][key]==0){
                    mp[x][y][key]=1;
                    queue.offer(new Node(x,y,key,node.step+1));
                }

            }
        }
        return -1;
    }

}