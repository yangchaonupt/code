package �����.����Ϊ��.����;

import java.util.Scanner;
/*
��һ�������ֽ��һ��������һ��ż��������ж���⣬���ż����С����һ�顣û�����No��
 */
public class �ֽ����� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long [] a= new long [t];
        for(int i=0;i<t;i++){
            //a[i]=Long.parseLong(sc.next());
            a[i]=sc.nextLong();
        }
        for(int i=0;i<a.length;i++){
            long x=0;
            long y=1;
            if(a[i]%2!=0){
                System.out.println("No");
                continue;
            }
            x=a[i];
            while (x%2==0){
                x=x/2;
                y=y*2;
            }
            System.out.println(x+" "+y);
        }

    }

}
