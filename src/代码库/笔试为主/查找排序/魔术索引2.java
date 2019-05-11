package 代码库.笔试为主.查找排序;
/*
在数组A[0..n-1]中，有所谓的魔术索引，满足条件A[i]=i。
给定一个不下降序列，元素值可能相同，编写一个方法，
判断在数组A中是否存在魔术索引。请思考一种复杂度优于o(n)的方法。

给定一个int数组A和int n代表数组大小，请返回一个bool，代表是否存在魔术索引。

测试样例：
[1,1,3,4,5]
返回：true
 */
public class 魔术索引2 {
    public static void main(String[] args) {
        int [] a={0,0,1,1,3,4,5,6,6,8,9,9,11,11,11,11,12,14,14,14,14,16,18,18,18,20,20,22,24,24,24,26,28,30,30,32,32,32};
        boolean re=findMagicIndex(a,38);
        System.out.println(re);
    }
    public static boolean findMagicIndex(int[] A, int n) {
        // write code here
        int start=0;
        while (start<A.length){
            if (A[start]==start){
                return true;
            }else if (A[start]>start){
                start=A[start];
            }else {
                start++;
            }
        }
        return false;



    }
}
