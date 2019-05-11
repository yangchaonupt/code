package ±  ‘.±¥ø«;
import java.util.*;
public class Ω¯÷∆ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s= sc.nextLine();
            long res =0;
            String [] s1 =s.split("\\+");
            for (int i=0;i<s1.length;i++){
                if (s1[i].contains("-")){
                    String [] s2= s1[i].split("-");
                    if (s2[0].charAt(0)=='0'){
                        if (s2[0].charAt(1)=='x'){
                            long temp=Long.parseLong(s2[0].substring(2),16);
                            res+=temp;
                        }else {
                            long temp=Long.parseLong(s2[0].substring(1),8);
                            res+=temp;
                        }
                    }else {
                        long temp=Long.parseLong(s2[0]);
                        res+=temp;
                    }
                    for (int j=1;j<s2.length;j++){
                        if (s2[j].charAt(0)=='0'){
                            if (s2[j].charAt(1)=='x'){
                                long temp=Long.parseLong(s2[j].substring(2),16);
                                res-=temp;
                            }else {
                                long temp=Long.parseLong(s2[j].substring(1),8);
                                res-=temp;
                            }
                        }else {
                            long temp=Long.parseLong(s2[j]);
                            res-=temp;
                        }
                    }
                }else {
                    if (s1[i].charAt(0)=='0'){
                        if (s1[i].charAt(1)=='x'){
                            long temp=Long.parseLong(s1[i].substring(2),16);
                            res+=temp;
                        }else {
                            long temp=Long.parseLong(s1[i].substring(1),8);
                            res+=temp;
                        }
                    }else {
                        long temp=Long.parseLong(s1[i]);
                        res+=temp;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
