package �����.����Ϊ��.�������;

public class ��Ʊ���������ʱ��2 {
    /*
    ��������һ�����飬���е�i ��Ԫ���ǵ�i�������Ʊ�ļ۸�

    ���һ���㷨���ҵ��������������Ը�����Ҫ��ɾ����ܶ�Ľ��ף���������������һ�ι�Ʊ����
    ���ǣ�������ͬʱ���ж�ʽ��ף������������ٴι���֮ǰ���۹�Ʊ����
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
