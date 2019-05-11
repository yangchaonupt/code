package 代码库.笔试为主.查找排序;
/**
 * 输入n个整数，找出其中最小的k个整数，找出其中最小的k个数。
 * 例如输入4，5，1，6，2，7，3，8这8个数字，则最小的4个数字为1，2，3，4
 * 思路：
 * 基于Partition函数来解决这个问题。如果基于数组的第k个数字来调整，
 * 使得比第k个数字小的所有数字都位于数组的左边，比第k个数字大的所有数字都位于数组的右边。
 * 这样调整之后，位于数组中左边的k个数字就是最小的k个数字。
 */
public class 最小K个数1 {
    public static void main(String[] args){
        int[] arr= {4,5,1,6,2,7,3,8};

        int[] output=getLeastNumbers(arr, 4);
        for(int i = 0;i<output.length ;i++){
            System.out.print(output[i]+",");
        }
    }
    // 使用partition函数 O(N)的算法
    public static int partition(int[] arr, int left, int right) {
        int result = arr[left];
        if (left > right)
        return -1;

        while (left < right) {
            while (left < right && arr[right] >= result) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] < result) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = result;
        return left;
    }

    public static int[] getLeastNumbers(int[] input, int k){
        if(input.length == 0 || k<= 0)
            return null;
        int[] output = new int[k];
        int start = 0;
        int end = input.length-1;
        int index = partition(input,start,end);
        while(index != k-1){
            if(index > k-1){
                end = index -1;
                index = partition(input,start ,end);
            } else{
                start = index+1;
                index = partition(input,start ,end);
            }
        }
        for(int i = 0;i<k;i++){
            output[i] = input[i];
        }
        return output;
    }

}
