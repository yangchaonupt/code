package 笔试.秋招.美团;

import java.util.*;

public class 区间统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int t = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long res = 0;
//            int m=k-1;
            HashMap<Integer,Integer> countMap =new HashMap<>();
            for (int i=0;i<n;i++){
                for (int j=i;j<i+k&&j<n;j++){

                    if (!countMap.containsKey(arr[j])){
                        countMap.put(arr[j],1);
                    }else {
                        countMap.put(arr[j],countMap.get(arr[j])+1);
                    }
                    if (countMap.get(arr[j])>=t) {
                        res++;
                        break;
                    }
                }
                countMap.clear();
            }

            System.out.println(res);
        }

    }
}
