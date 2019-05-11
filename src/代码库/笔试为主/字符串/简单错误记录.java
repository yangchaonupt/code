package 代码库.笔试为主.字符串;

import java.util.*;
/*
开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
处理:
1.记录最多8条错误记录，对相同的错误记录(即文件名称和行号完全匹配)只记录一条，错误计数增加；(文件所在的目录不同，文件名和行号相同也要合并)
2.超过16个字符的文件名称，只记录文件的最后有效16个字符；(如果文件名不同，而只是文件名的后16个字符和行号相同，也不要合并)
3.输入的文件可能带路径，记录文件名称不能带路径
输入描述:
一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
    文件路径为windows格式
    如：E:\V1R2\product\fpgadrive.c 1325
输出描述:
将所有的记录统计并将结果输出，格式：文件名代码行数数目，一个空格隔开，如: fpgadrive.c 1325 1
    结果根据数目从多到少排序，数目相同的情况下，按照输入第一次出现顺序排序。
    如果超过8条记录，则只输出前8条记录.
    如果文件名的长度超过16个字符，则只输出后16个字符
示例1
输入
E:\V1R2\product\fpgadrive.c 1325
输出
fpgadrive.c 1325 1
 */
public class 简单错误记录 {
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
        //用比较器排序，按Record中的count的大小排序
        Comparator<Record> comparator = (a, b) -> {
            return b.count - a.count;
        };
        Collections.sort(al, comparator);
        // Record[] records= (Record[]) al.toArray();
        Record[] records = al.toArray(new Record[al.size()]);
        printRecord(records);
    }

    //通过记录的文件名称与记录list中进行比较，没有的话返回-1，有的话将记录数+1
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

    //将数组的前八位数据打印出来
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
