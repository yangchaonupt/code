package �����.����Ϊ��.�ַ���;

/*
��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ���
��'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 */
public class ������ʽƥ�� {
    public static void main(String[] args) {

    }
    public boolean match(char[] str, char[] pattern) {
        if (str==null||pattern==null){
            return false;
        }
        boolean res=matchCore(str,pattern,0,0);
        return res;

    }
    public static boolean matchCore(char[] str, char[] pattern,int index1,int index2){
        return false;
    }
}
