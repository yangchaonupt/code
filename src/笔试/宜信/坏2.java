package ±  ‘.“À–≈;

import java.util.Scanner;

public class ªµ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            long w = sc.nextLong();
            long total = (long) Math.pow(n, w);
            long k = n;
            k *= (long) Math.pow(n - 1, w - 1);
            System.out.println((total - k) % 100003);
        }
    }

}
