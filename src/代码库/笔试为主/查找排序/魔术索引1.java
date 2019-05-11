package 代码库.笔试为主.查找排序;
/*
在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。
给定一个升序数组，元素值各不相同，编写一个方法，
判断在数组A中是否存在魔术索引。请思考一种复杂度优于o(n)的方法。

给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。

测试样例：
[1,2,3,4,5]
返回：false
 */
public class 魔术索引1 {
    public static void main(String[] args) {
        int [] a={0,1,3,5,6,9,11,13,15,18,19,22,25,27,30,33,35,37,38,39,41,43,44,45,46,49,51,54,57,60,62,63,64,65,66,68,71,72,73,75,78,81,82,83,85,86,87,90,91,93,95,98,99,100,101,103,105,106,109,112,114,116,117,120,122,125,128,131,133,135,136,139,142,144,145,147,148,151,154,157,158};
        boolean re=findMagicIndex(a,81);
        System.out.println(re);

    }
    public static boolean findMagicIndex(int[] A, int n) {
        // write code here
        int start=0;
        int end=A.length-1;
        int mid=0;
        while (start<=end){
            mid=(start+end)/2;
            if (A[mid]>mid){
                end=mid-1;
            }else if(A[mid]<mid){
                start=mid+1;
            }else {
                break;
            }
        }
        if (A[mid]==mid){
            return true;
        }else {
            return false;
        }

    }
}
