package 代码库.笔试为主.字符串;

import java.util.*;

/*
请设计一个高效算法，再给定的字符串数组中，找到包含"Coder"的字符串(不区分大小写)，并将其作为一个新的数组返回。
结果字符串的顺序按照"Coder"出现的次数递减排列，若两个串中"Coder"出现的次数相同，则保持他们在原数组中的位置关系。

给定一个字符串数组A和它的大小n，请返回结果数组。保证原数组大小小于等于300,其中每个串的长度小于等于200。同时保证一定存在包含coder的字符串。

测试样例：
["i am a coder","Coder Coder","Code"],3
返回：["Coder Coder","i am a coder"]
 */
public class 寻找Coder_比较器的使用 {
    public static void main(String[] args) {
        String[] ss={"coder","xfcoderjbixcoderpuvwhcoderodpacoderycacoderjskcoderptcoderkcoderdtwcodergalucoderfnjpwcoderagmtcodermkzoqcoderysqsycoderlvccodervbycoderacuagcodereueucoderscoderrbcoder","xbxcoderlafrcoderyuccoderjcoderefldcodersstujcoderelcoder","dvfowcoderfencoderqekcoderbtmcoderehcoderriyjdcodermocoder","ncbacoderjnvcoderfqcoderenwjpcoderkintcoderwtgcoder"};
        String[] res=findCoder(ss,5);
        for (int i=0;i<ss.length;i++){
            System.out.println(res[i]);
        }
    }


    public static String[] findCoder(String[] A, int n) {
        // write code here
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<n;i++){
            String cur=A[i];
            String temp=cur.toLowerCase();
            String[] ss=temp.split("coder");
            int cout=ss.length-1;
            if(cout==-1||cout==0){
                cout=1;
            }
            map.put(A[i],cout);
        }
        List<Map.Entry<String,Integer>> al= new ArrayList<>(map.entrySet());
        Collections.sort(al, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
                return o2.getValue()-o1.getValue();
            }
        });
        String[] res=new String[n];
        int le=0;
        for(Map.Entry<String,Integer> entry:al){
            res[le]=entry.getKey();
            le++;
        }
        return res;


    }
}
