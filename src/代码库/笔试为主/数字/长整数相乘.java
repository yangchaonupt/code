package �����.����Ϊ��.����;

import java.math.BigInteger;
import java.util.Scanner;
/*
��д����������ˡ�����ʵ���������ⳤ�ȵĳ�����(����)��ˣ�������.

��������:
��һ����������A���ַ������ַ���Χ��0��9�����ڶ�����������B���ַ������ַ���Χ��0��9����
�������:
���A��B������˵Ľ�������Ϊ�ַ�����
ʾ��1
����
1234
4321
���
5332114
˵��
��һ������*�ڶ�������
 */
public class ��������� {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger multiply = b1.multiply(b2);
        System.out.println(multiply);

    }
}
