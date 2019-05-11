package 代码库.笔试为主.字符串;

/*
对于三个字符串A，B，C。我们称C由A和B交错组成当且仅当C包含且仅包含A，B中所有字符，
且对应的顺序不改变。请编写一个高效算法，判断C串是否由A和B交错组成。

给定三个字符串A,B和C，及他们的长度。请返回一个bool值，
代表C是否由A和B交错组成。保证三个串的长度均小于等于100。
测试样例："ABC",3,"12C",3,"A12BCC",6     返回：true
 */
public class 字符串交错组成 {
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
