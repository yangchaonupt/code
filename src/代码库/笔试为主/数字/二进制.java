package �����.����Ϊ��.����;

public class ������ {
    /*
    ��������10���ˣ�һ�ֶ������ƣ�һ�ֲ�������ô��֪������int32����m��n�Ķ����Ʊ��ж��ٸ�λ(bit)��ͬô��
    ���� 1999 2299 ��� 7
     */
    public static void main(String[] args) {

        long startTime1=System.nanoTime();
        int num=countBitDiff1(1745789899,235657299);
        System.out.println(num);
        long endTime1=System.nanoTime();
        System.out.println("��������ʱ�䣺 "+(endTime1-startTime1)+"ns");
        long startTime2=System.nanoTime();
        int num2=countBitDiff2(1745789899,235657299);
        System.out.println(num2);
        long endTime2=System.nanoTime();
        System.out.println("��������ʱ�䣺 "+(endTime2-startTime2)+"ns");
    }
    public static int countBitDiff1(int m, int n) {
        int res=0;
        while(n!=0||m!=0){
            if(n%2!=m%2){
                res++;
            }
            n>>=1;
            m>>=1;
        }

        return res;
    }

    public static int countBitDiff2(int m, int n) {
        int dif=m^n;//�Ƚ�������������㣬�õ������
        int cnt=0;
        while(dif!=0){
            dif=dif&(dif-1);
            cnt++;
        }             //ͳ��һ������dif���ж��ٸ�1��
        return cnt;
    }


}
