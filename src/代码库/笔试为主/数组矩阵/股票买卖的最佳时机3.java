package 代码库.笔试为主.数组矩阵;

public class 股票买卖的最佳时机3 {
    /*
    假设你有一个数组，其中第i 个元素是第i天给定股票的价格。
    设计一个算法来找到最大的利润。您最多可以完成两笔交易。
    注意：
    您不得同时进行多笔交易（即您必须在再次购买之前出售股票）。

    思路：
    时间复杂度O(n), 空间复杂度O(1)。
    buy1表示第一次买入的最大收益，因为是买入所以是负值；
    sell1表示第一次卖出的最大收益；
    buy2表示第二次买入的最大收益；
    sell2表示第二次卖出的最大收益；
     */
    public static void main(String[] args) {
        int [] a ={3,8,5,1,7,8};
        int res=maxProfit(a);
        System.out.println("res: "+res);
    }

    public static int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;
        for (int curPrice : prices) {
            buy1 = Math.max(buy1, -curPrice);
            sell1 = Math.max(sell1, buy1 + curPrice);
            buy2 = Math.max(buy2, sell1 - curPrice);
            sell2 = Math.max(sell2, buy2 + curPrice);
            System.out.println("buy1: "+buy1+" sell1: "+sell1+" buy2: "+buy2+" sell2: "+sell2);
        }
        return sell2;
    }
}
