package ±  ‘.«Ô’–;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class PAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            for (int j=0;j<n;j++){
                String s =sc.nextLine();
                s.trim();
                for (int i=0;i<s.length();i++){
                    if (s.charAt(i)!='P'&&s.charAt(i)!='A'&&s.charAt(i)!='T'){
                        System.out.println("NO");
                        break;
                    }
                    int start=0;
                    int end=s.length()-1;
                    if (s.charAt(i)=='A'){
                        start++;
                    }
                    if (s.charAt(s.length()-1-i)=='A'){
                        end--;
                    }
                }
            }


        }


    }
}
