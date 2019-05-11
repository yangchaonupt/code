package 笔试.拼多多;

import java.util.*;
public class 比较版本号 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 =sc.nextLine();
            String [] s1s=s1.split("\\.");
            String[] s2s =s2.split("\\.");
            int  count=s1s.length<s2s.length?s1s.length:s2s.length;
            int res=0;
            for (int i=0;i<count;i++){
                if (Integer.parseInt(s1s[i]) >Integer.parseInt(s2s[i])){
                    res=1;
                    break;
                }else if (Integer.parseInt(s1s[i]) <Integer.parseInt(s2s[i])){
                    res=-1;
                    break;
                }
            }
            if (res!=0){
                System.out.println(res);
            }else if (s1s.length<s2s.length){
                System.out.println(-1);
            }else if (s1s.length>s2s.length){
                System.out.println(1);
            }else {
                System.out.println(0);
            }

        }

    }
}
