package �����.����Ϊ��.λ����;
/*
��һ������0��1֮���ʵ��������Ϊdouble���������Ķ����Ʊ�ʾ��00
����������޷���ȷ����32λ���ڵĶ����Ʊ�ʾ�����ء�Error����
����һ��double num����ʾ0��1��ʵ�����뷵��һ��string����������Ķ����Ʊ�ʾ���ߡ�Error����
����������
0.625
���أ�0.101
 */
public class ������С�� {
    public static void main(String[] args) {
        String s = printBin(0.03125);
        System.out.println(s);
    }
    public static String printBin(double num) {
        StringBuffer res=new StringBuffer();
        res.append("0.");
        int count =0;
        while (num!=0){
            if (count>32){
                return "Error";
            }
            num*=2;
            //�˴�Ҫ�е��ڣ�������*2��-1�ķ�����
            if(num>=1){
                res.append("1");
                num=num-1;

            }else {
                res.append("0");
            }
            count++;
        }

        return  res.toString();
    }
}
