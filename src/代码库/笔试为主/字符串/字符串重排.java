package 代码库.笔试为主.字符串;

import java.util.Scanner;
/*
给你一个原始字符串，根据该字符串内每个字符出现的次数，按照ASCII码递增顺序重新调整输出。
举例！假设原始字符串为：
eeefgghhh
则每种字符出现的次数分别是：
(1).eee        3次
(2).f          1次
(3).gg         2次
(4).hhh        3次
重排输出后的字符串如下：
efghegheh
编写程序，实现上述功能。
【温馨提示】
(1).原始字符串中仅可能出现“数字”和“字母”；
(2).请注意区分字母大小写。
输入
eeefgghhh
输出
efghegheh
 */
public class 字符串重排 {
    public static void main(String[] args) {
        stringSor("eeefgghhh");
        Scanner in = new Scanner(System.in);
        String s = in.next();
    }

    public static void stringSor(String s) {
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int[] a = new int[256];
        for (int i = 0; i < ch.length; i++) {
            a[ch[i]]++;
        }
        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 256; j++) {
                if (a[j] != 0) {
                    sb.append((char) j);
                    a[j]--;
                }
            }
        }
        String res = sb.toString();
        System.out.println(res);


    }
}
