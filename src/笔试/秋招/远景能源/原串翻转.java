package ����.����.Զ����Դ;

public class ԭ����ת {
    public static void main(String[] args) {

    }
    public String reverseString(String iniString) {
        // write code here
//        if (iniString==null){
//            return null;
//        }
//        for (int i=0;i<iniString.length()/2;i++){
//            char a =iniString.charAt(i);
//            char b=iniString.charAt(iniString.length()-1-i);
//
//            char temp=a;
//            =b;
//            b=temp;
//        }
        return  new StringBuffer(iniString).reverse().toString();
    }
}
