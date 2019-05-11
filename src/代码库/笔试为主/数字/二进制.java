package 代码库.笔试为主.数字;

public class 二进制 {
    /*
    世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
    输入 1999 2299 输出 7
     */
    public static void main(String[] args) {

        long startTime1=System.nanoTime();
        int num=countBitDiff1(1745789899,235657299);
        System.out.println(num);
        long endTime1=System.nanoTime();
        System.out.println("程序运行时间： "+(endTime1-startTime1)+"ns");
        long startTime2=System.nanoTime();
        int num2=countBitDiff2(1745789899,235657299);
        System.out.println(num2);
        long endTime2=System.nanoTime();
        System.out.println("程序运行时间： "+(endTime2-startTime2)+"ns");
    }
    public static int countBitDiff1(int m, int n) {
        int res=0;
        while(n!=0||m!=0){
            if(n%2!=m%2){
                res++;
            }
            n>>=1;
            m>>=1;
        }

        return res;
    }

    public static int countBitDiff2(int m, int n) {
        int dif=m^n;//先将二者做异或运算，得到结果；
        int cnt=0;
        while(dif!=0){
            dif=dif&(dif-1);
            cnt++;
        }             //统计一个整数dif含有多少个1；
        return cnt;
    }


}
