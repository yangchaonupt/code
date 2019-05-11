package ±ÊÊÔ.ºÃÎ´À´;

import java.util.*;
public class Ï¸°û {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int k=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int t=sc.nextInt();
            long z=1;
            while(n>0){
                z=k*z+b;
                n--;
            }
            int count=0;
            long res=t;
            while (res<z-b){
                res=k*res;
                count++;
            }
            System.out.println(count);
        }

    }
}
