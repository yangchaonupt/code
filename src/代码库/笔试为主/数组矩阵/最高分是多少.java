package �����.����Ϊ��.�������;

import java.util.Scanner;
/*
   ��ʦ��֪����ĳĳͬѧ���У�������ߵ��Ƕ��٣�����������ģ����ʦ��ѯ�ʡ���Ȼ����ʦ��ʱ����Ҫ����ĳλͬѧ�ĳɼ�.
   ��������:
   �����������������ݡ�
   ÿ�������һ��������������N��M��0 < N <= 30000,0 < M < 5000��,�ֱ����ѧ������Ŀ�Ͳ�������Ŀ��
   ѧ��ID��Ŵ�1�ൽN��
   �ڶ��а���N��������������N��ѧ���ĳ�ʼ�ɼ������е�i��������IDΪi��ѧ���ĳɼ�
   ��������M�У�ÿһ����һ���ַ�C��ֻȡ��Q����U������������������A,B,��CΪ'Q'��ʱ��, ��ʾ����һ��ѯ�ʲ�������ѯ��ID��A��B������A,B����ѧ�����У��ɼ���ߵ��Ƕ���
   ��CΪ��U����ʱ�򣬱�ʾ����һ�����²�����Ҫ���IDΪA��ѧ���ĳɼ�����ΪB��
   �������:
   ����ÿһ��ѯ�ʲ�������һ�����������߳ɼ�.
   ʾ��1
   ����
   5 7
   1 2 3 4 5
   Q 1 5
   U 3 6
   Q 3 4
   Q 4 5
   U 4 5
   U 2 9
   Q 1 5
   ���
   5
   6
   5
   9
    */
public class ��߷��Ƕ��� {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] score = new int[n];
            for(int i=0;i<n;i++){
                score[i]=sc.nextInt();
            }
            String temp=sc.nextLine();
            String[] in=new String[m];
            for(int i=0;i<m;i++){
                in[i]=sc.nextLine();
            }
            for(int i=0;i<m;i++){
                String s=in[i];
                String[] ss=s.split(" ");
                int a=Integer.parseInt(ss[1]);
                int b=Integer.parseInt(ss[2]);
                if(ss[0].equals("Q")){
                    int max=0;
                    int start=a>b?b:a;
                    int end=a>b?a:b;
                    for(int j=start-1;j<end;j++){
                        if(score[j]>max){
                            max=score[j];
                        }
                    }
                    System.out.println(max);
                }
                if (ss[0].equals("U")){
                    score[a-1]=b;
                }
            }

        }

    }

}
