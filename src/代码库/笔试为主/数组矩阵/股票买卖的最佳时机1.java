package 代码库.笔试为主.数组矩阵;

public class 股票买卖的最佳时机1 {
    /*
    假设你有一个数组，其中第i 个元素是第i天给定股票的价格。
    如果您只允许完成至多一笔交易（即买入一只股票并出售一只股票），则设计一种算法以找到最大利润。
    例1：
    输入：[7，1，5，3，6，4]
    输出：5
    最大差额= 6-1 = 5（不是7-1 = 6，因为销售价格需要大于购买价格）
    例2：
    输入：[7，6，4，3，1]
    输出：0
    在这种情况下，没有交易完成，即最大利润= 0。
     */
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        int [] b={0,6,-3,7};
        int res =maxProfit(b);
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);//用当前的位置减去之前的最小值，在用max保存和比较最大值。
        }
        return max;
    }
}
