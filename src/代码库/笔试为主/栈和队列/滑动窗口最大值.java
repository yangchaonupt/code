package �����.����Ϊ��.ջ�Ͷ���;

import java.util.LinkedList;
/*
���ɴ������ֵ����
����Ŀ��
��һ����������arr��һ����СΪw�Ĵ��ڴ����������߻������ұߣ�����ÿ�����ұ߻�һ��
λ�á�
���磬����Ϊ[4,3,5,4,3,3,6,7]�����ڴ�СΪ3ʱ��
[4 3 5] 4 3 3 6 7 ���������ֵΪ5
4 [3 5 4] 3 3 6 7 ���������ֵΪ5
4 3 [5 4 3] 3 6 7 ���������ֵΪ5
4 3 5 [4 3 3] 6 7 ���������ֵΪ4
4 3 5 4 [3 3 6] 7 ���������ֵΪ6
4 3 5 4 3 [3 6 7] ���������ֵΪ7
������鳤��Ϊn�����ڴ�СΪw����һ������n-w+1�����ڵ����ֵ��
��ʵ��һ��������
���룺��������arr�����ڴ�СΪw��
�����һ������Ϊn-w+1������res��res[i]��ʾÿһ�ִ���״̬�µ����ֵ��
�Ա���Ϊ�������Ӧ�÷���{5,5,5,4,6,7}
 */
public class �����������ֵ {

    public static int[] getMaxWindow(int[] arr, int w) {
        if (arr == null || w < 1 || arr.length < w) {
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - w) {
                qmax.pollFirst();
            }
            if (i >= w - 1) {
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

    // for test
    public static void printArray(int[] arr) {
        for (int i = 0; i != arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 4, 3, 3, 6, 7 };
        int w = 3;
        printArray(getMaxWindow(arr, w));

    }
}
