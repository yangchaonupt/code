package 代码库.工具;

import java.math.BigInteger;

public class 求排列组合 {
    public static void main(String[] args) {
        System.out.println(C(1000, 20));
        System.out.println(C1(1000, 20));
    }

    public static long A(int m, int n) {
        BigInteger res = new BigInteger(1 + "");
        BigInteger mm = new BigInteger(m + "");
        for (int i = 0; i < n; i++) {
            res = res.multiply(mm);
            mm = mm.subtract(new BigInteger(1 + ""));
        }
        return res.longValue();
    }

    public static long A1(int m, int n) {
        long res=1;
        for (int i = 0; i < n; i++){
            res=res*m;
            m--;
        }
        return res;
    }
    public static  long C(int m,int n){
        BigInteger a = new BigInteger(1 + "");
        BigInteger b = new BigInteger(1 + "");
        BigInteger mm = new BigInteger(m + "");
        if (m - n < n) {
            n = m - n;
        }
        for (int i = 0; i < n; i++) {
            a=a.multiply(mm);
            mm = mm.subtract(new BigInteger(1 + ""));
        }
        for (int i = n; i > 1; i--) {
            b=b.multiply(new BigInteger(i + ""));
        }
        long res=a.divide(b).longValue();
        return res;
    }
    public static long C1(int m, int n) {
        long a = 1;
        long b = 1;
        if (m - n < n) {
            n = m - n;
        }
        for (int i = 0; i < n; i++) {
            a *= m;
            m--;
        }
        for (int i = n; i > 1; i--) {
            b *= i;
        }
        return a / b;
    }

}
