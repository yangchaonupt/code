package �����.����Ϊ��.����;
/*
С������������һ����¥����С������վ��¥���Ĳ�ͬ�㣬����С��վ��¥��������N�ף�����������������£�
ÿ����غ������ϴ�����߶ȵ�һ�룬���Դ�����֪��ȫ���䵽���治������4��С��һ�������˶����ף�(���ֶ�Ϊ����)
�����ĸ�����A,B,C,D���뷵����������
����������
100,90,80,70
���أ�1020

˼·��
������Ϊx���õ���ʽ��
sn = x + x * (1 + 1/2 + 1/4 + ... + (1/2)^m)
sn = x + x * (1- (1/2)^m) / (1-1/2)
(1/2)^m ���޽ӽ���0
sn = x + x * 2;
sn = 3x;
���Դ�Ϊ 3*(A+B+C+D)
 */
public class ��С�� {
    public static void main(String[] args) {
        int res=calcDistance(100,90,80,70);
        System.out.println(res);
    }
    public static int calcDistance(int A, int B, int C, int D) {
        // write code here
//        Double a= A+0.0;
//        Double b= B+0.0;
//        Double c= C+0.0;
//        Double d= D+0.0;
//        Double res=a+b+c+d;
//        while(a.intValue()!=0){
//            res+=a;
//            a/=2;
//        }
//        while(b.intValue()!=0){
//            res+=b;
//            b/=2;
//        }
//        while(c.intValue()!=0){
//            res+=c;
//            c/=2;
//        }
//        while(d.intValue()!=0){
//            res+=d;
//            d/=2;
//        }
//        while(A!=0){
//            res+=A;
//            A/=2;
//        }
//        while(B!=0){
//            res+=B;
//            B/=2;
//        }
//        while(C!=0){
//            res+=C;
//            C/=2;
//        }
//        while(D!=0){
//            res+=D;
//            D/=2;
//        }
//        return res.intValue();
        return  3*(A+B+C+D);
    }
}
