package �����.����Ϊ��.�ַ���;

/*
���������ַ���A��B��C�����ǳ�C��A��B������ɵ��ҽ���C�����ҽ�����A��B�������ַ���
�Ҷ�Ӧ��˳�򲻸ı䡣���дһ����Ч�㷨���ж�C���Ƿ���A��B������ɡ�

���������ַ���A,B��C�������ǵĳ��ȡ��뷵��һ��boolֵ��
����C�Ƿ���A��B������ɡ���֤�������ĳ��Ⱦ�С�ڵ���100��
����������"ABC",3,"12C",3,"A12BCC",6     ���أ�true
 */
public class �ַ���������� {
    public static void main(String[] args) {
        String a = "bcbccabccacccbcac";
        String b = "abbbacaabccbccaaaabbcbcbaaacccbaaba";
        String c = "babbbacaabccbccaaaabbcbcbaaacccbaabacbccabccacccbcac";
//        String a="ABC";
//        String b="12C";
//        String c="A12BCC";
        boolean res =chkMixture(a,a.length(),b,b.length(),c,c.length());
        System.out.println(res);
    }

    public static boolean chkMixture(String A, int n, String B, int m, String C, int v) {
        if (v != n + m) {
            return false;
        }
        boolean [][] res=new boolean[n+1][m+1];
        res[0][0]=true;
        for (int i=1;i<n;i++){
            if (A.charAt(i-1)==C.charAt(i-1)){
                res[i][0]=true;
            }else {
                break;
            }
        }
        for (int i=1;i<n;i++){
            if (B.charAt(i-1)==C.charAt(i-1)){
                res[0][i]=true;
            }else {
                break;
            }
        }
        for (int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                if (res[i-1][j]==true&&A.charAt(i-1)==C.charAt(i+j-1)){
                    res[i][j]=true;
                }
                if (res[i][j-1]==true&&B.charAt(j-1)==C.charAt(i+j-1)){
                    res[i][j]=true;
                }
            }
        }
        return res[n][m];

    }


}
