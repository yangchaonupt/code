package �����.����.������;

public class ��������� {
    //����������麯��,size��������min����Сֵ��max�����ֵ����Χ[min,max)
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = min + (int) (Math.random() * (max - min));
        }
        return arr;
    }

    //������Arrays.sort(res);
    //������ɾ�����,m��������n:������min����Сֵ��max�����ֵ����Χ[min,max)
    public static int[][] generateRandomArray2(int m, int n, int min, int max) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = min + (int) (Math.random() * (max - min));
            }
        }
        return arr;
    }

    //��ӡ���麯��
    public static void printArray(int[] arr) {
        for (int i = 0; i != arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //��ӡ������
    public static void printArray2(int[][] arr) {
        for (int i = 0; i != arr.length; i++) {
            for (int j = 0; j != arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    //���ճ��ȿ������������
    public static void main(String[] args) {
        int size = 100;
        int min = -10;
        int max = 11;
        //[min,max)
        int[] a = generateRandomArray(size, min, max);
        printArray(a);

        int[][] a2 = generateRandomArray2(5,5, min, max);
        printArray2(a2);


    }


}
