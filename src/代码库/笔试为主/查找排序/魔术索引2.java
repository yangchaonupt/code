package �����.����Ϊ��.��������;
/*
������A[0..n-1]�У�����ν��ħ����������������A[i]=i��
����һ�����½����У�Ԫ��ֵ������ͬ����дһ��������
�ж�������A���Ƿ����ħ����������˼��һ�ָ��Ӷ�����o(n)�ķ�����

����һ��int����A��int n���������С���뷵��һ��bool�������Ƿ����ħ��������

����������
[1,1,3,4,5]
���أ�true
 */
public class ħ������2 {
    public static void main(String[] args) {
        int [] a={0,0,1,1,3,4,5,6,6,8,9,9,11,11,11,11,12,14,14,14,14,16,18,18,18,20,20,22,24,24,24,26,28,30,30,32,32,32};
        boolean re=findMagicIndex(a,38);
        System.out.println(re);
    }
    public static boolean findMagicIndex(int[] A, int n) {
        // write code here
        int start=0;
        while (start<A.length){
            if (A[start]==start){
                return true;
            }else if (A[start]>start){
                start=A[start];
            }else {
                start++;
            }
        }
        return false;



    }
}
