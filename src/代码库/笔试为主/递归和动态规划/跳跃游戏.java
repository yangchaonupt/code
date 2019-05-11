package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;

public class ��Ծ��Ϸ {
	/*
	��������arr��arr[i]==k������Դ�λ��i������1-k�����롣����arr[]==3,����
	��λ��2��������λ��3��λ��4����λ��5.�����λ��0��������������������������arr
	����λ���ϡ�
	 */

	public static int jump(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int jump = 0;
		int cur = 0;
		int next = 0;
		for (int i = 0; i < arr.length; i++) {
			if (cur < i) {
				jump++;
				cur = next;
			}
			next = Math.max(next, i + arr[i]);
		}
		return jump;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 1, 1, 4 };
		System.out.println(jump(arr));

	}

}
