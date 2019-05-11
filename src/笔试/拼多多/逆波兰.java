package ±ÊÊÔ.Æ´¶à¶à;

import java.util.*;
public class Äæ²¨À¼ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            String temp=sc.nextLine();
            String ss =sc.nextLine();
            String [] tokens = ss.split(" ");

            if(tokens==null || tokens.length==0){
                System.out.println(-1);
                return;
            }
            Stack<Long> s = new Stack<>();
            for(int i= 0 ;i<tokens.length;i++){
                switch(tokens[i]){
                    case "+":
                        s.push(s.pop()+s.pop());
                        break;
                    case "-":
                        long num1=s.pop();
                        long num2=s.pop();
                        s.push(num2-num1);
                        break;
                    case "*":
                        s.push(s.pop()*s.pop());
                        break;
                    case "/":
                        long num3=s.pop();
                        long num4=s.pop();
                        s.push(num4/num3);
                        break;
                    default :
                        s.push(Long.parseLong(tokens[i]));

                }
            }
            System.out.println(s.pop());

            }
        }

}

