package �����.����Ϊ��.�ַ���;

import java.util.Scanner;
/*
�˿�����Ϸ���Ӧ�ö��Ƚ���Ϥ�ˣ�һ������54����ɣ���3~A��2��4�ţ�С��1�ţ�����1�š������С�����������ַ����ַ�����ʾ�����У�Сдjoker��ʾС������дJOKER��ʾ������:)
3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
���������ƣ�������֮���á�-�����ӣ�ÿ���Ƶ�ÿ�����Կո�ָ�����-������û�пո��磺4 4 4 4-joker JOKER
��Ƚ������ƴ�С������ϴ���ƣ���������ڱȽϹ�ϵ�����ERROR
��������
��1������ÿ���ƿ����Ǹ��ӣ����ӣ�˳�ӣ�����5�ţ���������ը�����ĸ����Ͷ����е�һ�֣���������������������뱣֤�����ƶ��ǺϷ��ģ�˳���Ѿ���С�������У�
��2������ը���Ͷ������Ժ������ƱȽ�֮�⣬�������͵���ֻ�ܸ���ͬ���͵Ĵ��ڱȽϹ�ϵ���磬���Ӹ����ӱȽϣ������������Ƚϣ��������ǲ���������磺�����Ӳ�ֳɸ��ӣ�
��3����С��������ƽʱ�˽�ĳ���������ͬ�����ӣ����ӣ������Ƚ������С��˳�ӱȽ���С�ƴ�С��ը������ǰ�����е��ƣ�ը��֮��Ƚ������С�������������ƣ�
��4������������Ʋ��������ȵ������
����ʾ��
��1������ը���Ͷ���֮�⣬��������ͬ���ͱȽϡ�
��2�������Ѿ���֤�Ϸ��ԣ����ü�������Ƿ��ǺϷ����ơ�
��3�������˳���Ѿ�������С����������˲�����������.
��������:
���������ƣ�������֮���á�-�����ӣ�ÿ���Ƶ�ÿ�����Կո�ָ�����-������û�пո���4 4 4 4-joker JOKER��
�������:
����������нϴ�����֣��������ӷ����˿���˳�򲻱䣬���Կո��������������ڱȽϹ�ϵ�����ERROR��
ʾ��1
����
4 4 4 4-joker JOKER
���
joker JOKER
 */
public class һ���˿��Ʊȴ�С {
    static String base="345678910JQKA2jokerJOKER";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] pokers = s.split("-");
        String[] s0 = pokers[0].split(" ");
        String[] s1 = pokers[1].split(" ");
        if (pokers[0].equals("joker JOKER")) {
            System.out.println(pokers[0]);
            return;
        }
        if (pokers[1].equals("joker JOKER")) {
            System.out.println(pokers[1]);
            return;
        }
        if (s0.length==s1.length) {
            int res = cmp(s0[0], s1[0]);
            System.out.println(pokers[res]);
            return;
        }
        if (s0.length == 4) {
            System.out.println(pokers[0]);
            return;
        }
        if (s1.length == 4) {
            System.out.println(pokers[1]);
            return;
        }
        System.out.println("ERROR");
    }

    public static int cmp(String s1, String s2) {
        if(base.indexOf(s1)>base.indexOf(s2)){
            return 0;
        }else{
            return 1;
        }
    }

}
