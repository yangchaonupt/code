package 代码库.笔试为主.字符串;

import java.util.Scanner;

/*
给定一个字符串，问是否能通过添加一个字母将其变为回文串。
输入描述:
一行一个由小写字母构成的字符串，字符串长度小于等于10。
输出描述:
输出答案(YES\NO).
示例1
输入coco      输出YES
 */
public class 加一个字母为回文串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s=sc.nextLine();
            char [] ss =s.toCharArray();
            boolean res=stringCore(ss,0,ss.length-1,0);
            if (res){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public  static boolean stringCore(char [] ss,int start,int end,int tag){

        while (start<end){
            if (ss[start]==ss[end]){
                start++;
                end--;
            }else {
                if (tag!=0){
                    return false;
                }
                int a=start++;
                int b=end--;
                tag++;
                return stringCore(ss,a,end,tag)||stringCore(ss,start,b,tag);
            }
        }

        return true;
    }
}
