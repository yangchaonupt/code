package ����.����.Զ����Դ;

import java.util.Scanner;


public class ����� {
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
