package ±  ‘.“À–≈;

import java.math.BigInteger;
import java.util.*;
public class ªµ’À {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long n= sc.nextLong();
            int w= sc.nextInt();
//            long w= sc.nextLong();
            BigInteger a = new BigInteger(n + "");
            BigInteger b = new BigInteger(w + "");
            BigInteger c=new BigInteger(1 + "");
            BigInteger d=new BigInteger(100003 + "");
            BigInteger res1 =a.modPow(b,d) ;
            BigInteger res2=(a.subtract(c)).modPow(b.subtract(c),d).multiply(a);
            System.out.println(res1.subtract(res2));
        }

    }

}
