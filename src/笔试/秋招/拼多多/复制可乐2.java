package ����.����.ƴ���;
/*
�Զ��ۻ������� N ƿ���ƿ��֡����ƿ��ַǳ����棬���������˻Ḵ�Ƴ�һ���Լ�����
������ Alice, Bob, Cathy, Dave �ĸ������Ŷ����ƿ��֡�������˻����Ϻȵ���Ȼ���������ĸ���������ȥ�����������Ŷ�����֡�
�����һ���򵽸��ƿ��ֵ��˽�ʲô���֣�
��������:
�������һ�У�����һ�������� N (1 <= N <= 1,000,000,000)����ʾ���ֵ�������
�������:
����ȵ����һ�޸��ƿ��ֵ��˵����֡�
ʾ��1
����
����
8
���
����
Bob
˵��
ǰ8���ȵ����ֵ�������Ϊ��Alice, Bob, Cathy, Dave, Alice, Alice, Bob, Bob.
 */
import java.util.Scanner;

public class ���ƿ���2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long a= sc.nextLong();
            long n=1;
            long sum=0;
            while (sum<a){
                sum+=n;
                //Alice, Bob, Cathy, Dave
                if (sum>=a){
                    System.out.println("Alice");
                    break;
                }
                sum+=n;
                if (sum>=a){
                    System.out.println("Bob");
                    break;

                }
                sum+=n;
                if (sum>=a){
                    System.out.println("Cathy");
                    break;
                }
                sum+=n;
                if (sum>=a){
                    System.out.println("Dave");
                    break;
                }
                n*=2;
            }



        }

    }
}
