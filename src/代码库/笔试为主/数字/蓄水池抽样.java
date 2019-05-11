package �����.����Ϊ��.����;
/*
 * ��ˮ���㷨 ����Ŀ�� ��һ����������Ȼ�����еķ�ʽ�³���1����2����3���򣬡�������
 * ����һ�����ӣ��������ֻ��װ��K���򣬲��ҳ��������⣬��û�и���Ŀռ䡣���һ��ѡ��ʽ��
 * ʹ�õ������³���N�����ʱ��N>K����������е�������K����ͬʱ���Ա�֤��1����N�����е�ÿһ����
 * ��ѡ�����ӵĸ��ʶ���K/N����һ������������ӣ���һ��ֻ��װ��10����Ĵ��ӣ����³�100����ʱ��
 * ��������10���򣬲���1~100���е�ÿһ����ѡ�еĸ��ʶ���10/100��
 * Ȼ��������򣬵��³�1000����ʱ����������10���򣬲���1~1000���е�ÿһ����ѡ�еĸ��ʶ���10/1000��
 * �������򣬵��³�i����ʱ����������10���򣬲���1~i���е�ÿһ����ѡ�еĸ��ʶ���10/i��
 * �������ͬʱ���Ѿ��³�����ѡ�еĸ���Ҳ��̬�ر仯��
 */
public class ��ˮ�س��� {

	// һ���򵥵��������������һ�����������ǲ���
	public static int rand(int max) {
		// �ȸ��ʷ���1~max�е�һ��   -> 0~max-1 +1 -> 1~max
		return (int) (Math.random() * max) + 1;
	}

	public static int[] getKNumsRand(int k, int max) {
		if (max < 1 || k < 1) {
			return null;
		}
		int[] res = new int[Math.min(k, max)];
		for (int i = 0; i != res.length; i++) {
			res[i] = i + 1; // ǰk����ֱ�ӽ�����
		}
		for (int i = k + 1; i < max + 1; i++) {
			if (rand(i) <= k) { // ����i����������
				res[rand(k) - 1] = i; // i�����������е�һ��
			}
		}
		return res;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] res = getKNumsRand(10, 10000);
		printArray(res);
	}

}
