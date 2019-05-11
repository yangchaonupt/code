package 代码库.笔试为主.递归和动态规划;
/*
有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。
请实现一个方法，计算小孩有多少种上楼的方式。为了防止溢出，请将结果Mod 1000000007
给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
测试样例：
1
返回：1
 */
public class 小孩走楼梯 {
    public static void main(String[] args) {

    }
    public int countWays1(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        int x=1;
        int y=2;
        int z=4;
        int res=0;
        for(int i=4;i<=n;i++){
            res = ((x+y)%1000000007+z)%1000000007;
            x = y%1000000007;   //每个值都向前推一步，x不要了，将res的值给z
            y = z%1000000007;
            z = res%1000000007;
        }
        return res;
    }
    public int countWays2(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        long n1=1;
        long n2=2;
        long n3=4;
        int cout =1;
        while(n>3){
            if (cout%3==1){
                n1=(n1+n2+n3)%1000000007;
            }else if (cout%3==2){
                n2=(n1+n2+n3)%1000000007;
            }else {
                n3=(n1+n2+n3)%1000000007;
            }
            cout++;
            n--;
        }
        return (int) ((n1+n2+n3)%1000000007);
    }

}
