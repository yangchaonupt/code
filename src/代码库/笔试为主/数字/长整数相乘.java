package 代码库.笔试为主.数字;

import java.math.BigInteger;
import java.util.Scanner;
/*
编写”长整数相乘”程序，实现两个任意长度的长整数(正数)相乘，输出结果.

输入描述:
第一行输入数字A的字符串，字符范围（0～9），第二行输入数字B的字符串，字符范围（0～9）。
输出描述:
输出A、B俩数相乘的结果，结果为字符串。
示例1
输入
1234
4321
输出
5332114
说明
第一排数字*第二排数字
 */
public class 长整数相乘 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger multiply = b1.multiply(b2);
        System.out.println(multiply);

    }
}
