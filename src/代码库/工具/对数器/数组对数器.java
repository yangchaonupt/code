package 代码库.工具.对数器;

public class 数组对数器 {
    //随机生成数组函数,size：个数，min：最小值，max：最大值，范围[min,max)
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = min + (int) (Math.random() * (max - min));
        }
        return arr;
    }

    //排序用Arrays.sort(res);
    //随机生成矩阵函数,m：行数，n:列数，min：最小值，max：最大值，范围[min,max)
    public static int[][] generateRandomArray2(int m, int n, int min, int max) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = min + (int) (Math.random() * (max - min));
            }
        }
        return arr;
    }

    //打印数组函数
    public static void printArray(int[] arr) {
        for (int i = 0; i != arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //打印矩阵函数
    public static void printArray2(int[][] arr) {
        for (int i = 0; i != arr.length; i++) {
            for (int j = 0; j != arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    //按照长度课随机生成数组
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
