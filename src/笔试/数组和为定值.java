package 笔试;

import java.util.*;
public class 数组和为定值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            for (int i=1;i<n/2;i++){
                int sum=0;
                for (int j=i;j<n/2;j++){
                    sum+=j;
                    if (sum==n){
                        ArrayList<Integer> arrayList =new ArrayList<>();
                        for (int q=i;q<j+1;q++){
                            arrayList.add(q);
                        }
                        String s=""+arrayList.get(0);
                        for (int p=1;p<arrayList.size();p++){
                            s=s+"+"+arrayList.get(p);
                        }
                        System.out.println(s);
                        return;
                    }
                    if (sum>n){
                        break;
                    }
                }
            }

        }

    }
}
