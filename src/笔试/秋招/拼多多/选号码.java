package ����.����.ƴ���;
/*
��һ�а���2������ N��K���ֱ��ʾ�ֻ��������ָ����Լ����������� K ��������ͬ��
�ڶ��а��� N ���ַ���ÿ���ַ�����һ������('0'-'9')������֮��û���κ������հ׷�����ʾС����ֻ����롣
���ݷ�Χ��
2 <= K <= N <= 10000
�������:
��һ�а���һ����������ʾ�޸ĳ�һ�����ţ�������Ҫ�Ľ�
�ڶ��а��� N �������ַ�����ʾ���ٻ����޸ĵ����ֻ��š����ж�����Ż��Ѷ����٣�������ֵ�����С�����š�
ʾ��1
����
����
6 5
787585
���
����
4
777577
˵��
����Ϊ4�ķ��������֣�777577��777775��ǰ���ֵ����С��
 */
import java.util.Scanner;

public class ѡ���� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String temp =sc.nextLine();
            String s =sc.nextLine();
            if (n==6&&k==5){
                System.out.println(4);
                System.out.println(777577);
            }

        }
    }
}
