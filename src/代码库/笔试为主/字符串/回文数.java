package 代码库.笔试为主.字符串;

import java.util.Scanner;

/*
回文数
题目描述：
回文串是无论正着读还是反着读都一样的字符串，比如“level”或者“noon”就是回文串。
若将某个十进制非负整数N，转换成二进制后得到的 01 序列具有回文串的性质，则称该数为回文数，
比如十进制非负整数 9 表示成二进制后得到 1001，“1001”具有回文串的性质，则称十进制整数 9 为回文数。
现给你一个十进制整数N，请计算小于等于N的回文数的数量。
输入
第一行包含一个整数N, 1 ≤N≤1018。
输出
输出一个整数M，表示小于等于 N 的回文数的数量
样例输入
6
样例输出
4
Hint
Input Sample
10
Output Sample
6
 */
public class 回文数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        if (n==0){
            System.out.println(1);
            return;
        }

        long count =0;
        for (long i =0;i<=n;i++){
            String s = Long.toBinaryString(i);
            System.out.println(s);
            StringBuffer sb1=new StringBuffer(s);
            //StringBuffer sb2=new StringBuffer(s);

            //System.out.println(sb1+","+sb2.reverse());
            if (s.equals(sb1.reverse().toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
