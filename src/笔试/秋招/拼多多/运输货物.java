package ����.����.ƴ���;
/*
��N�����0<=N<=1024����ÿ�������������W��100<=W<=300�������ÿ������������Ϊ300������������Ҫ�������������������л��
��������:
һ�����룬����N������������ʾÿ��������������ո�ָ���
�������:
һ�����������һ����������ʾ��Ҫ�ĳ�������
ʾ��1
����
����
130 140 150 160
���
����
2
 */

import java.util.Arrays;
import java.util.Scanner;
//Ҫע����Ƿ�Χ��100,300����������Ȼ����3��100���һ���������װ����������ָ�������ָ���м�
public class ������� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String [] ss= s.split(" ");
            int n=ss.length;
            int [] a =new int [n];
            for (int i=0;i<n;i++){
                a[i]=Integer.parseInt(ss[i]);
            }
            Arrays.sort(a);
            int cout=0;
            int tag=n;
            while (tag!=0){
                int temp=0;
                for (int i=n-1;i>-1;i--){
                    if (a[i]!=-1&& temp+a[i]<=300){
                        temp=temp+a[i];
                        a[i]=-1;
                        tag--;
                    }
                }
                cout++;

            }
            System.out.println(cout);
        }

    }
}
