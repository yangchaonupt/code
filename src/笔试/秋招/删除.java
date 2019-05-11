package ±  ‘.«Ô’–;

import java.util.*;
public class …æ≥˝ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            int [] arr = new int[256];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)]++;
            }
            int minCount =Integer.MAX_VALUE;
            for (int i=0;i<arr.length;i++){
                if (arr[i]!=0&& arr[i]<minCount){
                    minCount=arr[i];
                }
            }
            char [] re=s.toCharArray();
            for (int i=0;i<s.length();i++){
                if (arr[s.charAt(i)]==minCount){
                   re[i]='0';
                }
            }
            StringBuffer res =new StringBuffer("");
            for (int i=0;i<re.length;i++){
                if (re[i]!='0'){
                    res.append(re[i]);
                }
            }
            System.out.println(res.toString());
        }

    }

}
