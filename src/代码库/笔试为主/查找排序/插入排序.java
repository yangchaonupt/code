package 代码库.笔试为主.查找排序;

public class 插入排序 {
    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        System.out.println("初始值：");
        print(a);
        insertSort(a);
        System.out.println("排序后：");
        print(a);
    }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    private static void insertSort(int[] a) {
        for (int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while (j>=0&&a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
    }
}
