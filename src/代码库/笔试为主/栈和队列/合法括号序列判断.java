package �����.����Ϊ��.ջ�Ͷ���;

import java.util.Stack;

/*
����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���
����һ���ַ���A�����ĳ���n���뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���
����������"(()())",6    ���أ�true
����������"()a()()",7   ���أ�false
����������"()(()()",7   ���أ�false
 */
public class �Ϸ����������ж� {
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
