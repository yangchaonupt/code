package �����.����Ϊ��.�������;

public class ��Ʊ���������ʱ��1 {
    /*
    ��������һ�����飬���е�i ��Ԫ���ǵ�i�������Ʊ�ļ۸�
    �����ֻ�����������һ�ʽ��ף�������һֻ��Ʊ������һֻ��Ʊ���������һ���㷨���ҵ��������
    ��1��
    ���룺[7��1��5��3��6��4]
    �����5
    �����= 6-1 = 5������7-1 = 6����Ϊ���ۼ۸���Ҫ���ڹ���۸�
    ��2��
    ���룺[7��6��4��3��1]
    �����0
    ����������£�û�н�����ɣ����������= 0��
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
            max = Math.max(max, prices[i] - min);//�õ�ǰ��λ�ü�ȥ֮ǰ����Сֵ������max����ͱȽ����ֵ��
        }
        return max;
    }
}
