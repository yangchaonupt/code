package �����.����Ϊ��.�ַ���;

public class ��һ��ֻ����һ�ε��ַ� {
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
