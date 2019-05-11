package 代码库.笔试为主.字符串;
/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。

 */
public class 字符流中第一个不重复的字符 {
    public class Solution {
        int count[]=new int[256];
        //Insert one char from stringstream
        int index=1;//用index来说明此数是什么时候进入数据组的
        public void Insert(char ch)
        {
            if(count[ch]==0){
                count[ch]=index++;
            } else{
                count[ch]=-1;
            }
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce()
        {
            int temp=Integer.MAX_VALUE;
            char ch='#';
            for(int i=0;i<256;i++){
                if(count[i]!=0&&count[i]!=-1&&count[i]<temp){//求符合条件的index值最小的i
                    temp=count[i];
                    ch=(char)i;
                }
            }
            return ch;
        }
    }
}
