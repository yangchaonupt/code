package �����.����Ϊ��.�������;

/*
��һ����Ϊn������A��������0��a��b<n��A[b]-A[a]�����ֵ��
��������A�����Ĵ�Сn���뷵������ֵ��
���������� [10,5],2    ���أ�0
 */
public class ����ֵ {
    public int getDis(int[] A, int n) {
        if (n < 2) {
            return 0;
        }
        int min = A[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] - min > max) {
                max = A[i] - min;//�����������ڴ������ֵ������
            }
            if (A[i] < min) {
                min = A[i];//������Сֵ
            }
        }
        return max;
    }

    public int getDis2(int[] A, int n) {
        if (A.length < 2) {
            return 0;
        }
        int max = 0;
        int temp = 0;
        int[] cu = new int[n];
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                cu[i] = cu[i - 1] + A[i] - A[i - 1];
            } else {
                int j = i - 2;
                while (j >= 0) {
                    if (A[i] > A[j]) {
                        cu[i] = cu[j] + A[i] - A[j];
                        break;
                    } else {
                        j--;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (cu[i] > max) {
                max = cu[i];
            }
        }
        return max;
    }
}
