package 代码库.笔试为主.栈和队列;

import java.util.Stack;

/*
对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
测试样例："(()())",6    返回：true
测试样例："()a()()",7   返回：false
测试样例："()(()()",7   返回：false
 */
public class 合法括号序列判断 {
    public static void main(String[] args) {

    }
    public boolean chkParenthesis(String A, int n) {
        if (n%2==1){
            return false;
        }
        Stack<Character> s=new Stack<>();
        for (int i=0;i<A.length();i++){
            Character ch=A.charAt(i);
            if (ch!='('&&ch!=')'){
                return false;
            }
            if (ch=='('){
                s.push(ch);
            }else {
                if (s.empty()){
                    return false;
                }else {
                    s.pop();
                }
            }
        }
        return true;

    }
}
