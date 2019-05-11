package 代码库.笔试为主.字符串;


import java.util.Scanner;

public class 不用API大数相乘 {

//     大数相乘基本思想，输入字符串，转成char数组，转成int数组。采用分治思想，每一位的相乘;
//     公式：AB*CD = AC (BC+AD) BD , 然后从后到前满十进位(BD,(BC+AD),AC)。


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String num1=s.split(" ")[0];
            String num2=s.split(" ")[1];
            //把字符串转换成char数组
            char chars1[] = num1.toCharArray();
            char chars2[] = num2.toCharArray();

            //声明存放结果和两个乘积的容器
            int result[] = new int[chars1.length + chars2.length];
            int n1[] = new int[chars1.length];
            int n2[] = new int[chars2.length];

            //把char转换成int数组，为什么要减去一个'0'呢？因为要减去0的ascii码得到的就是实际的数字
            for(int i = 0; i < chars1.length;i++)
                n1[i] = chars1[i]-'0';
            for(int i = 0; i < chars2.length;i++)
                n2[i] = chars2[i]-'0';

            //逐个相乘，因为你会发现。AB*CD = AC(BC+AD)BD , 然后进位。
            for(int i =0 ; i < chars1.length; i++){
                for(int j =0; j < chars2.length; j++){
                    result[i+j]+=n1[i]*n2[j];
                }
            }

            //满10进位，从后往前满十进位
            for(int i =result.length-1; i > 0 ;i--){
                result[i-1] += result[i] / 10;
                result[i] = result[i] % 10;
            }

            //转成string并返回
            String resultStr = "";
            for(int i = 0; i < result.length-1; i++){
                resultStr+=""+result[i];
            }
            System.out.println(resultStr);
            System.out.println("70820244829634538040848656466105986748");
        }

    }
}
