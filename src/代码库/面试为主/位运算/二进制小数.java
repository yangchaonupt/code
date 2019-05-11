package 代码库.面试为主.位运算;
/*
有一个介于0和1之间的实数，类型为double，返回它的二进制表示。00
如果该数字无法精确地用32位以内的二进制表示，返回“Error”。
给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
测试样例：
0.625
返回：0.101
 */
public class 二进制小数 {
    public static void main(String[] args) {
        String s = printBin(0.03125);
        System.out.println(s);
    }
    public static String printBin(double num) {
        StringBuffer res=new StringBuffer();
        res.append("0.");
        int count =0;
        while (num!=0){
            if (count>32){
                return "Error";
            }
            num*=2;
            //此处要有等于，方法是*2，-1的方法。
            if(num>=1){
                res.append("1");
                num=num-1;

            }else {
                res.append("0");
            }
            count++;
        }

        return  res.toString();
    }
}
