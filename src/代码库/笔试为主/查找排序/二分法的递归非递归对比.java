package �����.����Ϊ��.��������;

import java.util.Arrays;

public class ���ַ��ĵݹ�ǵݹ�Ա� {
	
	public static int[] generateRandomArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * 400);
			//��Χ[0,100)��0-99�������Ҫ���������ں����ȥһ��������
		}
		Arrays.sort(arr);
		return arr;
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int sort(int []array,int a,int lo,int hi){
        if(lo<=hi){
            int mid=(lo+hi)/2;
            if(a==array[mid]){
                return mid+1;
            }
            else if(a>array[mid]){
                return sort(array,a,mid+1,hi);
            }else{
                return sort(array,a,lo,mid-1);
            }
        }
        return -1;
    }
	
	public static int biSearch(int []array,int a){
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
	
	public static void main(String[] args) {
		int[] arr=generateRandomArray(800);
		printArray(arr);
		long startTime1=System.nanoTime(); 
		int a=sort(arr, 50, 0, arr.length-1);
		long endTime1=System.nanoTime(); 
		System.out.println("��������ʱ�䣺 "+(endTime1-startTime1)+"ns");
		long startTime2=System.nanoTime(); 
		int b=biSearch(arr,50);
		long endTime2=System.nanoTime(); 
		System.out.println("��������ʱ�䣺 "+(endTime2-startTime2)+"ns");
		System.out.println(a+"===="+b);
	}

		
}
