package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;

/*
������һ���������۾�����Ҫ�ӹ�˾������ȥ�ݷ����ڵ��̼ң�
��֪����λ���Լ��̼ҵ�λ�ã��������ڳ��е�·��ͨ��ԭ��
��ֻ����������ѡ��һ��������������ѡ��һ���������������ж����ַ��������̼ҵ�ַ��

����һ����ͼmap�����ĳ���n��m������1������λ�ã�2�����̼�λ�ã�
-1�����ܾ����ĵ�����0������Ծ����ĵ�����
�뷵�ط���������֤һ�����ںϷ�·������֤����ĳ���С�ڵ���10��

����������
[[0,1,0],[2,0,0]],2,3
���أ�2
 */
public class �ݷ� {
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
        //��ʼ��
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
        //����������dp
        for (int i=1;i<busx-magx;i++){
            for (int j=1;j<busy-magy;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[Math.abs(magx-busx)-1][Math.abs(magy-busy)-1];
    }
}
