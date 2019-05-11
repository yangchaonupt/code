package �����.����Ϊ��.�������;

public class ��Ʊ���������ʱ��3 {
    /*
    ��������һ�����飬���е�i ��Ԫ���ǵ�i�������Ʊ�ļ۸�
    ���һ���㷨���ҵ�����������������������ʽ��ס�
    ע�⣺
    ������ͬʱ���ж�ʽ��ף������������ٴι���֮ǰ���۹�Ʊ����

    ˼·��
    ʱ�临�Ӷ�O(n), �ռ临�Ӷ�O(1)��
    buy1��ʾ��һ�������������棬��Ϊ�����������Ǹ�ֵ��
    sell1��ʾ��һ��������������棻
    buy2��ʾ�ڶ��������������棻
    sell2��ʾ�ڶ���������������棻
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
