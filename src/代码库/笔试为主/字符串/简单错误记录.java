package �����.����Ϊ��.�ַ���;

import java.util.*;
/*
����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš�
����:
1.��¼���8�������¼������ͬ�Ĵ����¼(���ļ����ƺ��к���ȫƥ��)ֻ��¼һ��������������ӣ�(�ļ����ڵ�Ŀ¼��ͬ���ļ������к���ͬҲҪ�ϲ�)
2.����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���(����ļ�����ͬ����ֻ���ļ����ĺ�16���ַ����к���ͬ��Ҳ��Ҫ�ϲ�)
3.������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·��
��������:
һ�л�����ַ�����ÿ�а�����·���ļ����ƣ��кţ��Կո������
    �ļ�·��Ϊwindows��ʽ
    �磺E:\V1R2\product\fpgadrive.c 1325
�������:
�����еļ�¼ͳ�Ʋ�������������ʽ���ļ�������������Ŀ��һ���ո��������: fpgadrive.c 1325 1
    ���������Ŀ�Ӷൽ��������Ŀ��ͬ������£����������һ�γ���˳������
    �������8����¼����ֻ���ǰ8����¼.
    ����ļ����ĳ��ȳ���16���ַ�����ֻ�����16���ַ�
ʾ��1
����
E:\V1R2\product\fpgadrive.c 1325
���
fpgadrive.c 1325 1
 */
public class �򵥴����¼ {
    public static class Record {
        String record;
        int count;

        public Record(String record, int count) {
            this.record = record;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Record> al = new ArrayList<>();
//        while(in.hasNextLine()){
        for (int i = 0; i < 100; i++) {
            String s = in.next();
            String lastFile = s.substring(s.lastIndexOf("\\") + 1);
            int row = in.nextInt();
            String fileName = lastFile + " " + row;

            int index = find(al, fileName);
            if (index == -1) {
                Record r = new Record(fileName, 1);
                al.add(r);
            }
        }
        //�ñȽ������򣬰�Record�е�count�Ĵ�С����
        Comparator<Record> comparator = (a, b) -> {
            return b.count - a.count;
        };
        Collections.sort(al, comparator);
        // Record[] records= (Record[]) al.toArray();
        Record[] records = al.toArray(new Record[al.size()]);
        printRecord(records);
    }

    //ͨ����¼���ļ��������¼list�н��бȽϣ�û�еĻ�����-1���еĻ�����¼��+1
    public static int find(ArrayList<Record> al, String fileName) {
        int index = -1;
        for (Record re : al) {
            if (re.record.equals(fileName)) {
                re.count++;
                index = 1;
            }
        }
        return index;
    }

    //�������ǰ��λ���ݴ�ӡ����
    public static void printRecord(Record[] records) {
        int n;
        if (records.length < 8) {
            n = records.length;
        } else {
            n = 8;
        }
        for (int i = 0; i < n; i++) {
            String[] res = records[i].record.split(" ");
            String res1 = res[0];
            int res2 = Integer.parseInt(res[1]);
            int res3 = records[i].count;
            if (res1.length() > 16) {
                res1 = res1.substring(res1.length() - 16);
            }
            System.out.println(res1 + " " + res2 + " " + res3);
        }

    }
}
