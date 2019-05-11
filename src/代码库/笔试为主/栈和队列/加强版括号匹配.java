package 代码库.笔试为主.栈和队列;

import java.util.Scanner;
import java.util.Stack;

/*
n个由'('和')'组成的的字符串，问有多少对是和法字符串，a+b和b+a算两种，如果不是同一个的话
 */
public class 加强版括号匹配 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            String temp=sc.nextLine();
            int [] left = new int[1000];
            int [] right = new int[1000];
            int res=0;
            int suc=0;
            for (int i=0;i<n;i++){
                String s=sc.nextLine();
                Stack<Character> stack =new Stack<>();
                for (int j=0;j<s.length();j++){
                    Character c=s.charAt(j);
                    if (c=='('){
                        stack.push(c);
                    }else{
                        if (stack.isEmpty()){
                            stack.push(c);
                        }else{
                            if (stack.peek()=='('){
                                stack.pop();
                            }else {
                                stack.push(c);
                            }
                        }
                    }
                }
                if (stack.isEmpty()){
                    suc++;
                    continue;
                }
                int le=0;
                int ri=0;
                while (!stack.isEmpty()){
                    if(stack.pop()=='('){
                        le++;
                    }else {
                        ri++;
                    }
                }
                if (le==0){
                    right[ri]++;
                }
                if (ri==0){
                    left[le]++;
                }
            }

            for (int i=0;i<left.length;i++){
                res+=left[i]*right[i];
            }
            res+=suc*suc;
            System.out.println(res);



        }
    }
}
