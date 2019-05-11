package 代码库.笔试为主.数字;
/*
果园里有一堆苹果，一共n头(n大于1小于9)熊来分，第一头为小东，它把苹果均分n份后，
多出了一个，它扔掉了这一个，拿走了自己的一份苹果，接着第二头熊重复这一过程，
即先均分n份，扔掉一个然后拿走一份，以此类推直到最后一头熊都是这样(最后一头熊扔掉后可以拿走0个，也算是n份均分)。
问最初这堆苹果最少有多少个。
给定一个整数n,表示熊的个数，返回最初的苹果数。保证有解。
测试样例：
2
返回：3

别人思路：
设苹果总数x, 由题意知（x+n-1） 可被n 整除，  第一只熊分到 （x+n-1)/n只苹果（分到的+扔掉的）。
此时还剩下（n-1)(x+n-1)/n 只苹果。 第二只熊分得 （n-1)(x+n-1)/n^2 只苹果(分到的+扔掉的），
依次类推   ……    最后一只熊（分到+扔掉）K= (n-1)^(n-1)(x+n-1)/n^n  只苹果。K 为自然数，故分子必须是n^n的倍数。
由于(n-1)^(n-1) 与 n^n 互质， 则必有 (x+n-1) = t * n^n 。显然 t 取 1 时x 最小， x= n^n -n+1。

int sum=(int) (Math.pow(n,n)-n+1);
return sum;
 */
public class 小东分苹果 {
    public static void main(String[] args) {
        int res=getInitial(8);
        System.out.println(res);
    }
    public static int getInitial(int n) {
        if(n==2){
            return 3;
        }
        // write code here
        int num;
        for(int i=1;;i++){
            num=i*n+1;
            int res=check(n,i,num);
            if (res!=0){
                return res;
            }
        }
        //return 0;

    }
    public static int check(int n, int i, int num){
        for(int j=0;j<n-1;j++){
            if(num%(n-1)==0){
                num=num*n/(n-1)+1;
            }else {
                return 0;
            }
        }
        return num;
    }
}
