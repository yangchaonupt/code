package 代码库.工具;

public class 打表求组合 {
    public static void main(String[] args) {
        int mod=1000000007;
        int [][] comb=new int [1005][1005];
        for(int i=0;i<1001;i++){
            comb[i][0] = comb[i][i]=1;
            for(int j=1;j<i;j++){
                comb[i][j]=comb[i-1][j]+comb[i-1][j-1];
                comb[i][j]%=mod;
            }
        }
    }

}
