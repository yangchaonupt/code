package �����.����Ϊ��.����;
/*
��԰����һ��ƻ����һ��nͷ(n����1С��9)�����֣���һͷΪС��������ƻ������n�ݺ�
�����һ�������ӵ�����һ�����������Լ���һ��ƻ�������ŵڶ�ͷ���ظ���һ���̣�
���Ⱦ���n�ݣ��ӵ�һ��Ȼ������һ�ݣ��Դ�����ֱ�����һͷ�ܶ�������(���һͷ���ӵ����������0����Ҳ����n�ݾ���)��
��������ƻ�������ж��ٸ���
����һ������n,��ʾ�ܵĸ��������������ƻ��������֤�н⡣
����������
2
���أ�3

����˼·��
��ƻ������x, ������֪��x+n-1�� �ɱ�n ������  ��һֻ�ֵܷ� ��x+n-1)/nֻƻ�����ֵ���+�ӵ��ģ���
��ʱ��ʣ�£�n-1)(x+n-1)/n ֻƻ���� �ڶ�ֻ�ֵܷ� ��n-1)(x+n-1)/n^2 ֻƻ��(�ֵ���+�ӵ��ģ���
��������   ����    ���һֻ�ܣ��ֵ�+�ӵ���K= (n-1)^(n-1)(x+n-1)/n^n  ֻƻ����K Ϊ��Ȼ�����ʷ��ӱ�����n^n�ı�����
����(n-1)^(n-1) �� n^n ���ʣ� ����� (x+n-1) = t * n^n ����Ȼ t ȡ 1 ʱx ��С�� x= n^n -n+1��

int sum=(int) (Math.pow(n,n)-n+1);
return sum;
 */
public class С����ƻ�� {
    public static void main(String[] args) {
        int res=getInitial(8);
        System.out.println(res);
    }
    public static int getInitial(int n) {
        if(n==2){
            return 3;
        }
        // write code here
        int num;
        for(int i=1;;i++){
            num=i*n+1;
            int res=check(n,i,num);
            if (res!=0){
                return res;
            }
        }
        //return 0;

    }
    public static int check(int n, int i, int num){
        for(int j=0;j<n-1;j++){
            if(num%(n-1)==0){
                num=num*n/(n-1)+1;
            }else {
                return 0;
            }
        }
        return num;
    }
}
