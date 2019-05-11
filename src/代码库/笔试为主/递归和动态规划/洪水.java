package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;

import java.util.LinkedList;
import java.util.Queue;

/*
��һ��nxm������״�ĳ����ﱬ���˺�ˮ����ˮ��(0,0)�ĸ�������������У�
������������еĸ�����һЩ��������ˮֻ����û�н����ĸ���������
�뷵�غ�ˮ����(n - 1,m - 1)������ʱ��
(��ˮֻ�ܴ�һ���������������ڵĸ����Һ�ˮ��λʱ���ܴ�һ�������������ڸ���)��

����һ������map��ʾ���У�����map[i][j]��ʾ����Ϊ(i,j)�ĸ��ӣ�
ֵΪ1����ø����н�����0����û�н�����ͬʱ��������Ĵ�Сn��m(n��m��С�ڵ���100)��
�뷵������(n - 1,m - 1)������ʱ�䡣��֤��ˮһ���������յ㡣
 */
public class ��ˮ {
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
