package 代码库.笔试为主.数组矩阵;

public class 多数组K大数 {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3};
        int[] arr2 ={3,4,5,6};
        System.out.println(findKthNum(arr1,arr2,4));


    }
    public static int findKthNum(int[] arr1, int[] arr2, int kth) {
        int le1=arr1.length;
        int le2=arr2.length;
        int [] a=new int[le1+le2];
        int s1=0;
        int s2=0;
        for (int i=0;i<a.length;i++){
            if (s1==le1){
                for (int j=s2;j<le2;j++){
                    a[j]=arr2[j];
                }
                break;
            }
            if (s2==le2){
                for (int j=s1;j<le1;j++){
                    a[j]=arr1[j];
                }
                break;
            }
            if (arr1[s1]<arr2[s2]){
                a[i]=arr1[s1];
                s1++;
            }else if (arr1[s1]>arr2[s2]){
                a[i]=arr1[s2];
                s2++;
            }else {
                a[i]=arr1[s1];
                s1++;
                s2++;
            }
        }
        return a[kth-1];

    }
}
