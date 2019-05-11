package 笔试.秋招.京东;
import java.util.*;
public class 完全2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for (int q=0;q<t;q++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [] count =new int [n];
            for (int i=0;i<m;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                count[x-1]++;
                count[y-1]++;
            }
            int tage=1;
            int number=0;
            for (int i=0;i<n;i++){
                if (count[i]==n-1){
                    number++;
                }
            }
            for (int i=0;i<n;i++){
                if (count[i]!=n-1&&count[i]!=number&&count[i]!=0){
                    tage=0;
                }
            }
            if (tage==1){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }


    }
}
