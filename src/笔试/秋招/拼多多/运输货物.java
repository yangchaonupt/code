package 笔试.秋招.拼多多;
/*
有N个货物（0<=N<=1024），每个货物的重量是W（100<=W<=300）。如果每辆车最多的载重为300，请问最少需要多少辆车才能运输所有货物。
输入描述:
一行输入，包含N个正整数，表示每个货物的重量，空格分隔。
输出描述:
一行输出，包含一个整数，表示需要的车辆数。
示例1
输入
复制
130 140 150 160
输出
复制
2
 */

import java.util.Arrays;
import java.util.Scanner;
//要注意的是范围【100,300】，先排序。然后考虑3个100组成一起，其他最多装两个，两个指针从两边指向中间
public class 运输货物 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String [] ss= s.split(" ");
            int n=ss.length;
            int [] a =new int [n];
            for (int i=0;i<n;i++){
                a[i]=Integer.parseInt(ss[i]);
            }
            Arrays.sort(a);
            int cout=0;
            int tag=n;
            while (tag!=0){
                int temp=0;
                for (int i=n-1;i>-1;i--){
                    if (a[i]!=-1&& temp+a[i]<=300){
                        temp=temp+a[i];
                        a[i]=-1;
                        tag--;
                    }
                }
                cout++;

            }
            System.out.println(cout);
        }

    }
}
