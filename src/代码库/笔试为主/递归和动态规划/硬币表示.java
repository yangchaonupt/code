package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;

/*
���������޵�Ӳ�ң���ֵΪ25�֡�10�֡�5�ֺ�1�֣����д�������n���м��ֱ�ʾ����
����һ��int n���뷵��n���м��ֱ�ʾ������֤nС�ڵ���100000��Ϊ�˷�ֹ������뽫��Mod 1000000007��
����������6  ���أ�2
 */
public class Ӳ�ұ�ʾ {
    public static void main(String[] args) {
        int res= countWays(25);
        System.out.println(res);
    }

    public static int countWays(int n) {
        // write code here
        int[] dp = new int[n+1];
        int[] coin = {1, 5, 10, 25};
        dp[0]=1;
        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j < n+1; j++) {
                dp[j] = dp[j - coin[i]] + dp[j];//���ڵ�ֵ���������ط���һ��ʹ����һ��coin[i]�����ǲ�ʹ��coin[i]
            }
        }
        return dp[n];
    }
}
