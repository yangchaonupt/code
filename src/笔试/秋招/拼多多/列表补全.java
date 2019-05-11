package 笔试.秋招.拼多多;

import java.util.Scanner;

public class 列表补全 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int offset=sc.nextInt();
            int n=sc.nextInt();
            int l1= sc.nextInt();
            int l2=sc.nextInt();
            int s1,e1,s2,e2;
            if (offset+n>=l1){
                if (offset>=l1){
                    s1=l1;
                    e1=l1;
                    offset=offset-l1;
                    if (offset<l2){
                        s2=offset;
                        e2=(offset+n)<=l2?(offset+n):l2;
                    }else {
                        s2=l2;
                        e2=l2;
                    }
                }else {
                    s1=offset;
                    e1=l1;
                    n=offset+n-l1;
                    s2=0;
                    if (n>=l2){
                        e2=l2;
                    }else {
                        e2=n;
                    }
                }
            }else {
                s1=offset;
                e1=offset+n;
                s2=0;
                e2=0;
            }
            System.out.print(s1+" ");
            System.out.print(e1+" ");
            System.out.print(s2+" ");
            System.out.println(e2);

        }

    }
}
