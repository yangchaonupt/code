package 代码库.笔试为主.数字;
/*
小东和三个朋友一起在楼上抛小球，他们站在楼房的不同层，假设小东站的楼层距离地面N米，球从他手里自由落下，
每次落地后反跳回上次下落高度的一半，并以此类推知道全部落到地面不跳，求4个小球一共经过了多少米？(数字都为整数)
给定四个整数A,B,C,D，请返回所求结果。
测试样例：
100,90,80,70
返回：1020

思路：
设整数为x，得到公式：
sn = x + x * (1 + 1/2 + 1/4 + ... + (1/2)^m)
sn = x + x * (1- (1/2)^m) / (1-1/2)
(1/2)^m 无限接近于0
sn = x + x * 2;
sn = 3x;
所以答案为 3*(A+B+C+D)
 */
public class 抛小球 {
    public static void main(String[] args) {
        int res=calcDistance(100,90,80,70);
        System.out.println(res);
    }
    public static int calcDistance(int A, int B, int C, int D) {
        // write code here
//        Double a= A+0.0;
//        Double b= B+0.0;
//        Double c= C+0.0;
//        Double d= D+0.0;
//        Double res=a+b+c+d;
//        while(a.intValue()!=0){
//            res+=a;
//            a/=2;
//        }
//        while(b.intValue()!=0){
//            res+=b;
//            b/=2;
//        }
//        while(c.intValue()!=0){
//            res+=c;
//            c/=2;
//        }
//        while(d.intValue()!=0){
//            res+=d;
//            d/=2;
//        }
//        while(A!=0){
//            res+=A;
//            A/=2;
//        }
//        while(B!=0){
//            res+=B;
//            B/=2;
//        }
//        while(C!=0){
//            res+=C;
//            C/=2;
//        }
//        while(D!=0){
//            res+=D;
//            D/=2;
//        }
//        return res.intValue();
        return  3*(A+B+C+D);
    }
}
