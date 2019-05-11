package 代码库.笔试为主.递归和动态规划;

/*
有数量不限的硬币，币值为25分、10分、5分和1分，请编写代码计算n分有几种表示法。
给定一个int n，请返回n分有几种表示法。保证n小于等于100000，为了防止溢出，请将答案Mod 1000000007。
测试样例：6  返回：2
 */
public class 硬币表示 {
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
                dp[j] = dp[j - coin[i]] + dp[j];//现在的值来自两个地方，一是使用了一张coin[i]，二是不使用coin[i]
            }
        }
        return dp[n];
    }
}
