package �����.����Ϊ��.�ַ���;
/*
��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
�������:
�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���

 */
public class �ַ����е�һ�����ظ����ַ� {
    public class Solution {
        int count[]=new int[256];
        //Insert one char from stringstream
        int index=1;//��index��˵��������ʲôʱ������������
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
                if(count[i]!=0&&count[i]!=-1&&count[i]<temp){//�����������indexֵ��С��i
                    temp=count[i];
                    ch=(char)i;
                }
            }
            return ch;
        }
    }
}
