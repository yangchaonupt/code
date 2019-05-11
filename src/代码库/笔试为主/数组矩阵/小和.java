package 代码库.笔试为主.数组矩阵;
/*
 * 数组小和的定义如下：
	例如，数组s=[1,3,5,2,4,6]，在s[0]的左边小于或等于s[0]的
	数的和为0，在s[1]的左边小于或等于s[1]的数的和为1，在s[2]
	的左边小于或等于s[2]的数的和为1+3=4，在s[3]的左边小于或
	等于s[3]的数的和为1，在s[4]的左边小于或等于s[4]的数的和
	为1+3+2=6，在s[5]的左边小于或等于s[5]的数的和为
	1+3+5+2+4=15，所以s的小和为0+1+4+1+6+15=27。
	给定一个数组s，实现函数返回s的小和。
	给定一个数组arr，返回子数组的最大累加和。
	例如，arr=[1,-2,3,5,-2,6,-1]，所有的子数组中，[3,5,-2,6]可以
	累加出最大的和12，所以返回12。
 */
public class 小和 {
	public static int getSmallSum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		return func(arr, 0, arr.length - 1);
	}

	public static int func(int[] s, int l, int r) {
		if (l == r) {
			return 0;
		}
		int mid = (l + r) / 2;
		return func(s, l, mid) + func(s, mid + 1, r) + merge(s, l, mid, r);
	}

	public static int merge(int[] s, int left, int mid, int right) {
		int[] h = new int[right - left + 1];
		int hi = 0;
		int i = left;
		int j = mid + 1;
		int smallSum = 0;
		while (i <= mid && j <= right) {
			if (s[i] <= s[j]) {
				smallSum += s[i] * (right - j + 1);
				h[hi++] = s[i++];
			} else {
				h[hi++] = s[j++];
			}
		}
		for (; (j < right + 1) || (i < mid + 1); j++, i++) {
			h[hi++] = i > mid ? s[j] : s[i];
		}
		for (int k = 0; k != h.length; k++) {
			s[left++] = h[k];
		}
		return smallSum;
	}

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 6, 2, 7, 8, 1 };
		System.out.println(getSmallSum(arr));

	}

}
