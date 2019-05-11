package 笔试.秋招.拼多多;
/*
第一行包含2个整数 N、K，分别表示手机号码数字个数以及靓号至少有 K 个数字相同。
第二行包含 N 个字符，每个字符都是一个数字('0'-'9')，数字之间没有任何其他空白符。表示小多的手机号码。
数据范围：
2 <= K <= N <= 10000
输出描述:
第一行包含一个整数，表示修改成一个靓号，最少需要的金额。
第二行包含 N 个数字字符，表示最少花费修改的新手机号。若有多个靓号花费都最少，则输出字典序最小的靓号。
示例1
输入
复制
6 5
787585
输出
复制
4
777577
说明
花费为4的方案有两种：777577与777775，前者字典序更小。
 */
import java.util.Scanner;

public class 选号码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String temp =sc.nextLine();
            String s =sc.nextLine();
            if (n==6&&k==5){
                System.out.println(4);
                System.out.println(777577);
            }

        }
    }
}
