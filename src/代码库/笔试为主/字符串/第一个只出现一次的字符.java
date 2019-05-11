package 代码库.笔试为主.字符串;

public class 第一个只出现一次的字符 {
    public static void main(String[] args) {
        String s="google";
        int res=firstNotRepeatingChar(s);
        System.out.println(res);
    }
    public static int firstNotRepeatingChar(String str) {
        if (str==null||str.length()==0){
            return -1;
        }
        int [] arr = new int[256];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
