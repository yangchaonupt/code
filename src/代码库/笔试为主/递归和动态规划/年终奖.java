package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;
/*
С�����ڹ�˾Ҫ�����ս�����С��ǡ�û������߸�������Ҫ�ڹ�˾����ϲ���һ���齱��Ϸ��
��Ϸ��һ��6*6�������Ͻ��У��������36����ֵ���ȵ����ÿ��С���������������һ�����
����Ҫ�����Ͻǿ�ʼ��Ϸ��ÿ��ֻ�����»��������ƶ�һ�����������½�ֹͣ��
һ·�ϵĸ����������С�������õ��������һ���㷨ʹС���õ���ֵ��ߵ����

����һ��6*6�ľ���board������ÿ��Ԫ��Ϊ��Ӧ���ӵ������ֵ,���Ͻ�Ϊ[0,0],
�뷵���ܻ�õ�����ֵ����֤ÿ�������ֵ����100С��1000��
 */
import java.util.Scanner;

public class ���ս� {
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
