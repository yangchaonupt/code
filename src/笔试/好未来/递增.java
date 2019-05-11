package ±  ‘.∫√Œ¥¿¥;

import java.util.*;
public class µ›‘ˆ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            int temp=1;
            for (int i=1;i<n;i++){
                if (arr[i]>=arr[i-1]){
                    temp++;
                    if (temp>count){
                        count=temp;
                    }
                }else {
                    temp=1;
                }

            }
            if (count==n){
                System.out.println(count);
            }else {
                System.out.println(count+1);
            }

        }

    }
}
