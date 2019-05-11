package �����.����Ϊ��.ͼ;

import java.util.*;
/*
����һ��̽�ռұ������˵ص׵��Թ�֮�У�Ҫ�ӵ�ǰλ�ÿ�ʼ�ҵ�һ��ͨ���Թ����ڵ�·����
�Թ�������һ����ά������ɣ��еĲ�����ǽ���еĲ�����·���Թ�֮���е�·�ϻ����ţ�
ÿ���Ŷ����Թ���ĳ���ط�����֮ƥ���Կ�ף�ֻ�����õ�Կ�ײ��ܴ��š������һ���㷨��
����̽�ռ��ҵ����������·������ǰ�������Թ���ͨ��һ����ά�����ʾ�ģ�
ÿ��Ԫ�ص�ֵ�ĺ������� 0-ǽ��1-·��2-̽�ռҵ���ʼλ�ã�3-�Թ��ĳ��ڣ�
��д��ĸ-�ţ�Сд��ĸ-��Ӧ��д��ĸ��������ŵ�Կ��
��������:
�Թ��ĵ�ͼ���ö�ά�����ʾ����һ���Ǳ�ʾ���������������M��N
�����M���Ǿ�������ݣ�ÿһ�ж�Ӧ������һ�У��м�û�пո񣩡�M��N��������100, �Ų�����10�ȡ�
�������:   ·���ĳ��ȣ���һ������
ʾ��1
����
5 5
02111
01a0A
01003
01001
01111
���  7
 */
public class �Թ�Ѱ· {

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
        //����������Կ��״̬
        int[][][] mp=new int[101][101][1025];
        //�����ĸ�����
        int[][] next={{-1,0},{0,-1},{1,0},{0,1}};

        queue.offer(new Node(si,sj,0,0));
        while(!queue.isEmpty()){
            Node node=queue.poll();
            for(int i=0;i<4;i++){
                int x=node.x+next[i][0];
                int y=node.y+next[i][1];
                int key=node.key;
                //Խ������
                if(x<0||x>=N||y<0||y>=M||G[x][y]=='0') {
                    continue;
                } else if(G[x][y]=='3') {
                    //�����յ㣬���ز���+1
                    return node.step+1;
                } else if(G[x][y]<='z'&&G[x][y]>='a') {
                    //����Կ�ס�����Կ�׵�λ��
                    key=key|(1<<(G[x][y]-'a'));
                } else if(G[x][y]<='Z'&&G[x][y]>='A'&&(key&(1<<(G[x][y]-'A')))==0) {
                    //������Կ��λ��Ϊ0�������ʱû�ж�Ӧ��Կ�ף�����
                    continue;
                }
                //û�е���
                if(mp[x][y][key]==0){
                    mp[x][y][key]=1;
                    queue.offer(new Node(x,y,key,node.step+1));
                }

            }
        }
        return -1;
    }

}