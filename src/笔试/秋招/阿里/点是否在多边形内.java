package 笔试.秋招.阿里;

import java.util.*;
public class 点是否在多边形内 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a= sc.nextLine();
            int testx=Integer.parseInt(a.split(",")[0]) ;
            int testy=Integer.parseInt(a.split(",")[1]) ;
            String b =sc.nextLine();
            String [] xys=b.split(",");
            int n=xys.length;
            int [] xs= new int [n/2];
            int [] ys=new int [n/2];
            int minx=Integer.MAX_VALUE;
            int miny=Integer.MAX_VALUE;
            int maxx=Integer.MIN_VALUE;
            int maxy=Integer.MIN_VALUE;
            for (int i=0;i<n/2;i=i+2){
                xs[i]=Integer.parseInt(xys[i]);
                ys[i]=Integer.parseInt(xys[i+1]);
                if (xs[i]<minx){
                    minx=xs[i];
                }
                if (xs[i]>maxx){
                    maxx=xs[i];
                }
                if (ys[i]<miny){
                    miny=ys[i];
                }
                if (ys[i]>maxy){
                    maxy=ys[i];
                }
            }
            if (testx<minx||testx>maxx||testy<miny||testy>maxy){

            }


        }

    }
}
