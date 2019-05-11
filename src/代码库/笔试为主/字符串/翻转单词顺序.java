package 代码库.笔试为主.字符串;

public class 翻转单词顺序 {
    public static void main(String[] args) {
        String s="";
        int le=s.length();
        String res= reverseSentence(s);
        System.out.println(res);
        System.out.println(le);
    }

    public static String reverseSentence(String str) {
        if(str == null){
            return null;
        }
        if(str.trim().equals("")){//trim 消除前后的空格
            return str;
        }
        String string = str;
        String[] strings = string.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for (int i = strings.length-1 ; i>=0;i--) {
            if(i == 0){
                sBuilder.append(strings[i]);
            }else {
                sBuilder.append(strings[i]);
                sBuilder.append(" ");
            }
        }

        String string2 = sBuilder.toString();
        return string2;
    }
}
