package 笔试.秋招.远景能源;

import java.util.Scanner;


public class 最大间隔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int  n= sc.nextInt();
            int [] a=new int [n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int max=0;
            for (int i=1;i<n;i++){
                if ((a[i]-a[i-1])>max){
                    max=a[i]-a[i-1];
                }
            }
            System.out.println(max);
        }

    }
}
