package ����.����.ƴ���;
/*
����һ�ȵ����籭�����ˣ�С���ڹ�˾�ڷ�����һ��Ʊѡ��ǿ���ǵĻ������ N ����ѡ���ǣ�ÿλͶƱ����Ҫ��ѡƱ��Ϊÿλ��ѡ��������һ��ʵ���ȼ����ȼ���Ӣ����ĸ��ʾ��'a' ����ߣ�'z' ����ͣ���26����
���ǳƺ�ѡ���� X ǿ�ں�ѡ���� Y������ X �������� Y �ߡ���Ʊ�����ڡ� Y �������� X �ߡ���Ʊ������һ����ѡ����ǿ����һ������ѡ����ʱ����Ƹ�����Ϊ�������������������������ֻ����һ����������Ҫע�����Ҳ����û��������
���ڸ������� M ��ѡƱ�������С���ж�һ����λ��ѡ������������
��������:
��һ�а���2������ N��M���ֱ��ʾ��ѡ���������Լ�ѡƱ������
�������� M �У�ÿ����һ������Ϊ N ���ַ�����ÿ���ַ�����ʾһ��ѡƱ�ϵ���Ϣ��ÿ���ַ����ĵ� k (0 <= k < N) ���ַ�����ʾ����ѡƱ�Ե� k ����ѡ���ǵ�������
���ݷ�Χ��
1 <= N <= 50
1 <= M <= 50
�ַ���ֻ����СдӢ����ĸ(a-z)��
�������:
���������������һ�н�����һ������ X����ʾ���Ϊ X (0 <= X < N) �ĺ�ѡ��������������û�������������һ�н�����һ������ -1 ��
ʾ��1
����
4 3
acbd
bacd
bdca
���
0
ʾ��2
����
3 3
abc
bca
cab
���
-1
ʾ��3
����
4 1
abac
���
-1
 */
import java.util.Scanner;

public class Ʊѡ���� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String te = sc.nextLine();
            String[] s =new String[m];
            for (int i=0;i<m;i++){
                s[i]=sc.nextLine();
            }
            int cout=0;
            int tag=0;
            int da=0;
            int cu=n-1;
            for (int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    if (k==j){
                        continue;
                    }
                    for (int i=0;i<m;i++){
                        if (s[i].charAt(j)<s[i].charAt(k)){
                            cout++;
                        }else if (s[i].charAt(j)>s[i].charAt(k)){
                            cout--;
                        }else {
                            break;
                        }
                    }
                    if (cout>0){
                        tag++;
                    }else {
                        break;
                    }

                }
                if (tag==cu){
                    System.out.println(j);
                    da=1;
                }

            }
            if (da==0){
                System.out.println(-1);
            }
        }

    }
}
