package �����.����Ϊ��.�ַ���;

import java.util.Scanner;

/*
������
��Ŀ������
���Ĵ����������Ŷ����Ƿ��Ŷ���һ�����ַ��������硰level�����ߡ�noon�����ǻ��Ĵ���
����ĳ��ʮ���ƷǸ�����N��ת���ɶ����ƺ�õ��� 01 ���о��л��Ĵ������ʣ���Ƹ���Ϊ��������
����ʮ���ƷǸ����� 9 ��ʾ�ɶ����ƺ�õ� 1001����1001�����л��Ĵ������ʣ����ʮ�������� 9 Ϊ��������
�ָ���һ��ʮ��������N�������С�ڵ���N�Ļ�������������
����
��һ�а���һ������N, 1 ��N��1018��
���
���һ������M����ʾС�ڵ��� N �Ļ�����������
��������
6
�������
4
Hint
Input Sample
10
Output Sample
6
 */
public class ������ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        if (n==0){
            System.out.println(1);
            return;
        }

        long count =0;
        for (long i =0;i<=n;i++){
            String s = Long.toBinaryString(i);
            System.out.println(s);
            StringBuffer sb1=new StringBuffer(s);
            //StringBuffer sb2=new StringBuffer(s);

            //System.out.println(sb1+","+sb2.reverse());
            if (s.equals(sb1.reverse().toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
