package �����.����Ϊ��.�ַ���;

import java.util.Scanner;

/*
����һ���ַ��������Ƿ���ͨ�����һ����ĸ�����Ϊ���Ĵ���
��������:
һ��һ����Сд��ĸ���ɵ��ַ������ַ�������С�ڵ���10��
�������:
�����(YES\NO).
ʾ��1
����coco      ���YES
 */
public class ��һ����ĸΪ���Ĵ� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s=sc.nextLine();
            char [] ss =s.toCharArray();
            boolean res=stringCore(ss,0,ss.length-1,0);
            if (res){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public  static boolean stringCore(char [] ss,int start,int end,int tag){

        while (start<end){
            if (ss[start]==ss[end]){
                start++;
                end--;
            }else {
                if (tag!=0){
                    return false;
                }
                int a=start++;
                int b=end--;
                tag++;
                return stringCore(ss,a,end,tag)||stringCore(ss,start,b,tag);
            }
        }

        return true;
    }
}
