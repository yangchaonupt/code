package 笔试.秋招.京东;

import java.util.*;
public class 对比 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n= sc.nextInt();
            long [] a =new long[n];
            long [] b =new long[n];
            long [] c =new long[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextLong();
                b[i]=sc.nextLong();
                c[i]=sc.nextLong();
            }
            int res=0;
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if (a[i]<a[j]&&b[i]<b[j]&&c[i]<c[j]){
                        res++;
                        break;
                    }
                }
            }
            System.out.println(res);
        }

    }
}
