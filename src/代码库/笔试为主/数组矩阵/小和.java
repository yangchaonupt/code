package �����.����Ϊ��.�������;
/*
 * ����С�͵Ķ������£�
	���磬����s=[1,3,5,2,4,6]����s[0]�����С�ڻ����s[0]��
	���ĺ�Ϊ0����s[1]�����С�ڻ����s[1]�����ĺ�Ϊ1����s[2]
	�����С�ڻ����s[2]�����ĺ�Ϊ1+3=4����s[3]�����С�ڻ�
	����s[3]�����ĺ�Ϊ1����s[4]�����С�ڻ����s[4]�����ĺ�
	Ϊ1+3+2=6����s[5]�����С�ڻ����s[5]�����ĺ�Ϊ
	1+3+5+2+4=15������s��С��Ϊ0+1+4+1+6+15=27��
	����һ������s��ʵ�ֺ�������s��С�͡�
	����һ������arr�����������������ۼӺ͡�
	���磬arr=[1,-2,3,5,-2,6,-1]�����е��������У�[3,5,-2,6]����
	�ۼӳ����ĺ�12�����Է���12��
 */
public class С�� {
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
