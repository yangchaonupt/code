package 笔试.秋招.拼多多;
/*
自动售货机里有 N 瓶复制可乐。复制可乐非常神奇，喝了它的人会复制出一个自己来！
现在有 Alice, Bob, Cathy, Dave 四个人在排队买复制可乐。买完的人会马上喝掉，然后他和他的副本会重新去队伍的最后面排队买可乐。
问最后一个买到复制可乐的人叫什么名字？
输入描述:
输入仅有一行，包含一个正整数 N (1 <= N <= 1,000,000,000)，表示可乐的数量。
输出描述:
输出喝到最后一罐复制可乐的人的名字。
示例1
输入
复制
8
输出
复制
Bob
说明
前8个喝到可乐的人依次为：Alice, Bob, Cathy, Dave, Alice, Alice, Bob, Bob.
 */
import java.util.Scanner;

public class 复制可乐2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long a= sc.nextLong();
            long n=1;
            long sum=0;
            while (sum<a){
                sum+=n;
                //Alice, Bob, Cathy, Dave
                if (sum>=a){
                    System.out.println("Alice");
                    break;
                }
                sum+=n;
                if (sum>=a){
                    System.out.println("Bob");
                    break;

                }
                sum+=n;
                if (sum>=a){
                    System.out.println("Cathy");
                    break;
                }
                sum+=n;
                if (sum>=a){
                    System.out.println("Dave");
                    break;
                }
                n*=2;
            }



        }

    }
}
