package �����.����Ϊ��.�ַ���;

import java.util.*;

/*
�����һ����Ч�㷨���ٸ������ַ��������У��ҵ�����"Coder"���ַ���(�����ִ�Сд)����������Ϊһ���µ����鷵�ء�
����ַ�����˳����"Coder"���ֵĴ����ݼ����У�����������"Coder"���ֵĴ�����ͬ���򱣳�������ԭ�����е�λ�ù�ϵ��

����һ���ַ�������A�����Ĵ�Сn���뷵�ؽ�����顣��֤ԭ�����СС�ڵ���300,����ÿ�����ĳ���С�ڵ���200��ͬʱ��֤һ�����ڰ���coder���ַ�����

����������
["i am a coder","Coder Coder","Code"],3
���أ�["Coder Coder","i am a coder"]
 */
public class Ѱ��Coder_�Ƚ�����ʹ�� {
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
