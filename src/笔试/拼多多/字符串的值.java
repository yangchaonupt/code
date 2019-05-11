package 笔试.拼多多;

import java.util.*;
public class 字符串的值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int[] a = new int[26];
            for (int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - 'a']++;
            }
            Arrays.sort(a);
            long sum=0;
            sum+=(a[a.length-1]+a[a.length-2])*(a[a.length-1]+a[a.length-2]);
            for (int i=0;i<a.length-2;i++){
                sum+=(a[i]*a[i]);
            }
            System.out.println(sum);
        }

    }
}
