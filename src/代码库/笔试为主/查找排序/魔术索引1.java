package �����.����Ϊ��.��������;
/*
������A[0..n-1]�У�����ν��ħ����������������A[i]=i��
����һ���������飬Ԫ��ֵ������ͬ����дһ��������
�ж�������A���Ƿ����ħ����������˼��һ�ָ��Ӷ�����o(n)�ķ�����

����һ��int����A��int n���������С���뷵��һ��bool�������Ƿ����ħ��������

����������
[1,2,3,4,5]
���أ�false
 */
public class ħ������1 {
    public static void main(String[] args) {
        int [] a={0,1,3,5,6,9,11,13,15,18,19,22,25,27,30,33,35,37,38,39,41,43,44,45,46,49,51,54,57,60,62,63,64,65,66,68,71,72,73,75,78,81,82,83,85,86,87,90,91,93,95,98,99,100,101,103,105,106,109,112,114,116,117,120,122,125,128,131,133,135,136,139,142,144,145,147,148,151,154,157,158};
        boolean re=findMagicIndex(a,81);
        System.out.println(re);

    }
    public static boolean findMagicIndex(int[] A, int n) {
        // write code here
        int start=0;
        int end=A.length-1;
        int mid=0;
        while (start<=end){
            mid=(start+end)/2;
            if (A[mid]>mid){
                end=mid-1;
            }else if(A[mid]<mid){
                start=mid+1;
            }else {
                break;
            }
        }
        if (A[mid]==mid){
            return true;
        }else {
            return false;
        }

    }
}
