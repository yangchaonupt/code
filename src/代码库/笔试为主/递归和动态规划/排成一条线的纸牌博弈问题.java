package �����.����Ϊ��.�ݹ�Ͷ�̬�滮;

public class �ų�һ���ߵ�ֽ�Ʋ������� {
	/*
	����һ����������arr��������ֵ��ͬ��ֽ���ų�һ���ߡ����A��B��������ÿ��ֽ�ƣ�
	�涨���A���ã�B���ã�����ÿ�����ְ��������������ҵ�ֽ�ƣ����A�����B������������
	�뷵������ʤ�ߵķ�����
	����Ŀ��
	����һ����������arr��������ֵ��ͬ��ֽ���ų�һ���ߡ����A�����B��������ÿ��ֽ�ƣ��涨���A���ã�
	���B���ã�����ÿ�����ÿ��ֻ��������������ҵ�ֽ�ƣ����A�����B�������������뷵������ʤ�ߵķ�����
	��������
	arr=[1,2,100,4]����ʼʱ���Aֻ������1��4��������A����1�������б�Ϊ[2,100,4]��
	���������B��������2��4��Ȼ������ֵ����A�������ʼʱ���A����4�������б�Ϊ[1,2,100]��
	���������B��������1��100��Ȼ������ֵ����A�����A��Ϊ�����������˲�������4��
	��Ϊ��4֮�����B������100���������A������1�������б�Ϊ[2,100,4]�����������B������ôѡ��100��
	�ᱻ���A���ߡ����A���ʤ������Ϊ101�����Է���101��arr=[1,100,2]��
	��ʼʱ���A������1����2�����B��Ϊ�����������ˣ������100���ߡ����B���ʤ������Ϊ100�����Է���100��
	 */

	public static int win1(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		return Math.max(f(arr, 0, arr.length - 1), s(arr, 0, arr.length - 1));
	}

	public static int f(int[] arr, int i, int j) {
		if (i == j) {
			return arr[i];
		}
		return Math.max(arr[i] + s(arr, i + 1, j), arr[j] + s(arr, i, j - 1));
	}

	public static int s(int[] arr, int i, int j) {
		if (i == j) {
			return 0;
		}
		return Math.min(f(arr, i + 1, j), f(arr, i, j - 1));
	}

	public static int win2(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int[][] f = new int[arr.length][arr.length];
		int[][] s = new int[arr.length][arr.length];
		for (int j = 0; j < arr.length; j++) {
			f[j][j] = arr[j];
			for (int i = j - 1; i >= 0; i--) {
				f[i][j] = Math.max(arr[i] + s[i + 1][j], arr[j] + s[i][j - 1]);
				s[i][j] = Math.min(f[i + 1][j], f[i][j - 1]);
			}
		}
		return Math.max(f[0][arr.length - 1], s[0][arr.length - 1]);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 9, 1 };
		System.out.println(win1(arr));
		System.out.println(win2(arr));

	}

}
