package ����.����.����;

import java.util.*;
public class ��ȫ�ಿͼ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int q=0;q<t;q++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if (n==1){
                System.out.println("Yes");
                break;
            }
            if (m==0){
                System.out.println("No");
            }
            if (m==n*(n-1)/2){
                System.out.println("Yes");
                break;
            }
            int [] count =new int [n];
            for (int i=0;i<m;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                count[x-1]++;
                count[y-1]++;
            }
            int tage=0;
            for (int i=0;i<n;i++){
                if (count[i]==n-1){
                    tage=1;
                }
            }
            if (tage==1){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            }


    }
}
