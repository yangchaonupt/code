package �����.����Ϊ��.�ַ���;

import java.util.Scanner;
/*
����һ��ԭʼ�ַ��������ݸ��ַ�����ÿ���ַ����ֵĴ���������ASCII�����˳�����µ��������
����������ԭʼ�ַ���Ϊ��
eeefgghhh
��ÿ���ַ����ֵĴ����ֱ��ǣ�
(1).eee        3��
(2).f          1��
(3).gg         2��
(4).hhh        3��
�����������ַ������£�
efghegheh
��д����ʵ���������ܡ�
����ܰ��ʾ��
(1).ԭʼ�ַ����н����ܳ��֡����֡��͡���ĸ����
(2).��ע��������ĸ��Сд��
����
eeefgghhh
���
efghegheh
 */
public class �ַ������� {
    public static void main(String[] args) {
        stringSor("eeefgghhh");
        Scanner in = new Scanner(System.in);
        String s = in.next();
    }

    public static void stringSor(String s) {
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int[] a = new int[256];
        for (int i = 0; i < ch.length; i++) {
            a[ch[i]]++;
        }
        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 256; j++) {
                if (a[j] != 0) {
                    sb.append((char) j);
                    a[j]--;
                }
            }
        }
        String res = sb.toString();
        System.out.println(res);


    }
}
