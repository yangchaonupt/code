package �����.����Ϊ��.��������;
/**
 * ����n���������ҳ�������С��k���������ҳ�������С��k������
 * ��������4��5��1��6��2��7��3��8��8�����֣�����С��4������Ϊ1��2��3��4
 * ˼·��
 * ����Partition���������������⡣�����������ĵ�k��������������
 * ʹ�ñȵ�k������С���������ֶ�λ���������ߣ��ȵ�k�����ִ���������ֶ�λ��������ұߡ�
 * ��������֮��λ����������ߵ�k�����־�����С��k�����֡�
 */
public class ��СK����1 {
    public static void main(String[] args){
        int[] arr= {4,5,1,6,2,7,3,8};

        int[] output=getLeastNumbers(arr, 4);
        for(int i = 0;i<output.length ;i++){
            System.out.print(output[i]+",");
        }
    }
    // ʹ��partition���� O(N)���㷨
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
