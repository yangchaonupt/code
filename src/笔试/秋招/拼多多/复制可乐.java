package ±  ‘.«Ô’–.∆¥∂‡∂‡;


import java.util.*;
public class ∏¥÷∆ø…¿÷ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long a= sc.nextLong();
            long n=0;
            long sum=0;
            long i=0;
            while (sum<a){
                i+=4;
                sum+=i;
                n++;
            }
            long temp=(sum-a)/n;

            //long b=a%4;
            //Alice, Bob, Cathy, Dave

            if (temp==3){
                System.out.println("Alice");
            }
            if (temp==2){
                System.out.println("Bob");
            }
            if (temp==1){
                System.out.println("Cathy");
            }
            if (temp==0){
                System.out.println("Dave");
            }
        }

    }
}
