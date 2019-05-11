package ±ÊÊÔ.°ïÃ¦;

import java.util.*;
public class Êı×Ö {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int  s=sc.nextInt();
            int  d=sc.nextInt();
            int res=0;
            if (s>d*9){
                System.out.println(-1);
                break;
            }
            if (s>(d-1)*9){
                res=s-(d-1)*9;
            }else {
                res=1;
            }
            s=s-res;
            int w=d;
            while (w>1){
                res*=10;
                w--;
            }

            int tag=1;
            while (s>0){
                if (s>=9){
                    s-=9;
                    res+=9*tag;
                }else {

                    res+=s*tag;
                    s=0;
                }
                tag=tag*10;
            }
            System.out.println(res);

        }

    }

}
