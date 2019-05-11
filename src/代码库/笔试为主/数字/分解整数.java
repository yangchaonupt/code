package 代码库.笔试为主.数字;

import java.util.Scanner;
/*
将一个整数分解成一个奇数和一个偶数，如果有多组解，输出偶数最小的哪一组。没有输出No。
 */
public class 分解整数 {
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
