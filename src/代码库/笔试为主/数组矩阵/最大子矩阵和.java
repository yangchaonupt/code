package �����.����Ϊ��.�������;
/*
 * ����һ������matrix�����е�ֵ�������и�����0�������Ӿ��������ۼӺ͡�
���磬����matrixΪ��
-90 48 78
64 -40 64
-81 -7 66
���У�����ۼӺ͵��Ӿ���Ϊ��
48 78
-40 64
-7 66
���Է����ۼӺ�209��
���磬matrixΪ��
-1 -1 -1
-1 2 2
-1 -1 -1
���У�����ۼӺ͵��Ӿ���Ϊ��
2 2
���Է����ۼӺ�4��
 */
public class ����Ӿ���� {
	
	public static int maxSum(int[][] m) {
		if (m == null || m.length == 0 || m[0].length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int cur = 0;
		int[] s = null; // �ۼ�����
		for (int i = 0; i != m.length; i++) {
			s = new int[m[0].length];
			for (int j = i; j != m.length; j++) {
				cur = 0;
				for (int k = 0; k != s.length; k++) {
					s[k] += m[j][k];
					cur += s[k];
					max = Math.max(max, cur);
					cur = cur < 0 ? 0 : cur;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] matrix = { { -90, 48, 78 }, { 64, -40, 64 }, { -81, -7, 66 } };
		System.out.println(maxSum(matrix));

	}

}
