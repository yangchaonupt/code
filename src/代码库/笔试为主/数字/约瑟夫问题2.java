package �����.����Ϊ��.����;

import java.util.LinkedList;

/*
Լɪ��������һ��������Ȥ�⡣�������������޸�һ�¹���
��n����վ��һ�С�����ͷ��β�����Ǳ�ţ���һ���˱��Ϊ1��
Ȼ���ͷ��ʼ��������һ�����α�1��2��1��2...Ȼ�󱨵�2���˳��֡�
���ŵڶ����ٴ���һ�����һ���������˿�ʼ���α�1��2��3��1��2��3...
����2��3���˳��֡��Դ�����ֱ��ʣ���Ժ�һ���ˡ�������Ҫ��ļ�������˵ı�š�
����һ��int n��������Ϸ���������뷵�����һ���˵ı��
����������5      ���أ�5
 */
public class Լɪ������2 {
    public static void main(String[] args) {
        int res=getResult(210);
        System.out.println(res);
    }
    public static int getResult(int n) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<n;i++){
            list.add(i);
        }
        return 0;

    }
}
