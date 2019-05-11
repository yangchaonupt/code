package 笔试.好未来;

import java.util.*;
public class 最长递增子数组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            int in1=0;
            int m2=Integer.MAX_VALUE;
            int in2=0;
            for (int i=0;i<n;i++){
                if (arr[i]<min){
                    min=arr[i];
                    in1=i;
                }
            }
            for (int i=0;i<n;i++){
                if (i!=in1&&arr[i]<m2){
                    m2=arr[i];
                    in2=i;
                }
            }
           arr[in1]= arr[in2];
            int count=0;
            int temp=1;
            for (int i=1;i<n;i++){
                if (arr[i]>=arr[i-1]){
                    temp++;
                    if (temp>count){
                        count=temp;
                    }
                }else {
                    temp=0;
                }

            }
            System.out.println(count);
        }

    }
}
