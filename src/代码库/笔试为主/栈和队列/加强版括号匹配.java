package �����.����Ϊ��.ջ�Ͷ���;

import java.util.Scanner;
import java.util.Stack;

/*
n����'('��')'��ɵĵ��ַ��������ж��ٶ��Ǻͷ��ַ�����a+b��b+a�����֣��������ͬһ���Ļ�
 */
public class ��ǿ������ƥ�� {
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
