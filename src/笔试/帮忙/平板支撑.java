package ±  ‘.∞Ô√¶;

import java.util.*;
public class ∆Ω∞Â÷ß≥≈ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s= sc.nextLine();
            String[] ss =s.split(",");
            long [] arr = new long [ss.length];
            for (int i=0;i<ss.length-1;i++){
                arr[i]=Long.parseLong(ss[i]);
            }
            arr[ss.length-1]=Long.parseLong(ss[ss.length-1].split(" ")[0]);
            long tag= Long.parseLong(ss[ss.length-1].split(" ")[1]);
//            for (int i=0;i<ss.length;i++){
//                System.out.println(arr[i]);
//            }
//            System.out.println(tag);

//            for (int i=0;i<ss.length;i++){
//                if (tag<=arr[i]){
//                    System.out.println(i);
//                    break;
//                }
//            }
            int lo=0;
            int hi=arr.length-1;
            int mid;
            int res =arr.length-1;
            while(lo<=hi){
                mid = lo + (hi - lo) / 2;
                if (arr[mid]>tag){
                    res=mid;
                    hi=mid-1;
                }else {
                    lo=mid+1;
                }
            }
            if (res==arr.length-1){
                res++;
            }
            System.out.println(res);

        }

    }
}
