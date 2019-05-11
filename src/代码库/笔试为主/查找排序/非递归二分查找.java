package 代码库.笔试为主.查找排序;

public class 非递归二分查找 {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8};
        int b=binarySearch(a,8);
        System.out.print(b);
    }
	public static int binarySearch(int []array,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }

}
