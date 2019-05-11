package ±  ‘.∫√Œ¥¿¥;
import java.util.Scanner;
public class aq {




        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()) {
                long l=sc.nextLong();
                long r=sc.nextLong();
                int a=f(l);
                int b=f(r);
                System.out.println(b-a+1);
            }
        }

        private static int f(long r) {
            if(r<10)
                return (int)r;
            String s=""+r;
            int n=s.length();
            double ji=(int) Math.pow(10, n-1);

            int a=(int) (r/ji);
            int bb=(int) (a*ji)+a;
            if(bb>r) {
                a--;
            }
            return 9*(n-1)+a;
        }


}
