package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;
/*
�и�С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ס�2�ס�3�ס�
��ʵ��һ������������С���ж�������¥�ķ�ʽ��Ϊ�˷�ֹ������뽫���Mod 1000000007
����һ��������int n���뷵��һ������������¥�ķ�ʽ������֤nС�ڵ���100000��
����������
1
���أ�1
 */
public class С����¥�� {
    public static void main(String[] args) {

    }
    public int countWays1(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        int x=1;
        int y=2;
        int z=4;
        int res=0;
        for(int i=4;i<=n;i++){
            res = ((x+y)%1000000007+z)%1000000007;
            x = y%1000000007;   //ÿ��ֵ����ǰ��һ����x��Ҫ�ˣ���res��ֵ��z
            y = z%1000000007;
            z = res%1000000007;
        }
        return res;
    }
    public int countWays2(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        long n1=1;
        long n2=2;
        long n3=4;
        int cout =1;
        while(n>3){
            if (cout%3==1){
                n1=(n1+n2+n3)%1000000007;
            }else if (cout%3==2){
                n2=(n1+n2+n3)%1000000007;
            }else {
                n3=(n1+n2+n3)%1000000007;
            }
            cout++;
            n--;
        }
        return (int) ((n1+n2+n3)%1000000007);
    }

}
