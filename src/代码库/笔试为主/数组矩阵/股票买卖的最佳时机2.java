package 代码库.笔试为主.数组矩阵;

public class 股票买卖的最佳时机2 {
    /*
    假设你有一个数组，其中第i 个元素是第i天给定股票的价格。

    设计一个算法来找到最大的利润。您可以根据需要完成尽可能多的交易（即多次买入和卖出一次股票）。
    但是，您不得同时进行多笔交易（即您必须在再次购买之前出售股票）。
     */
    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
