package 代码库.笔试为主.查找排序;

public class 快速排序_挖坑填数 {

	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		//int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("初始值：");
		print(a);
		quickSort(a, 0, a.length - 1);
		System.out.println("排序后：");
		print(a);
	}

	public static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void quickSort(int[] a, int low, int high) {
		if (low < high) { // 如果不加这个判断递归会无法退出导致堆栈溢出异常
			int middle = getMiddle(a, low, high);
			quickSort(a, 0, middle - 1); // 递归对低子表递归排序
			quickSort(a, middle + 1, high); // 递归对高子表递归排序
		}
	}

	public static int getMiddle(int[] a, int low, int high) {

		// int random = (int) (Math.random() * (high - low + 1)) + low;
		// int temp = a[random];
		// a[random] = a[low];
		// a[low] = temp;

		int key = a[low];// 基准元素，排序中会空出来一个位置
		while (low < high) {
			while (low < high && a[high] >= key) {// 从high开始找比基准小的，与low换位置
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= key) {// 从low开始找比基准大,放到之前high空出来的位置上
				low++;
			}
			a[high] = a[low];

		}
		a[low] = key;// 此时low=high 是基准元素的位置，也是空出来的那个位置
		return low;

	}
}
