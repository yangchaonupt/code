package ±ÊÊÔ.Å£¿ÍÍø;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ÁùÒ»¶ùÍ¯½Ú {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }
            Arrays.sort(h);
            int m = sc.nextInt();
            int[] w = new int[m];
            for (int i=0;i<m;i++){
                w[i]=sc.nextInt();
            }
            Arrays.sort(w);
            int indexh=h.length-1;
            int indexw=w.length-1;
            int res=0;
            while (indexh!=-1&&indexw!=-1){
                if (w[indexw]>=h[indexh]){
                    indexh--;
                    indexw--;
                    res++;
                }else {
                    indexh--;
                }
            }
            System.out.println(res);
//            ArrayList<Integer> alh=new ArrayList<Integer>();
//            ArrayList<Integer> alw=new ArrayList<Integer>();
        }

    }
}
