package �����.����Ϊ��.��������;

public class ��������_�ڿ����� {

	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		//int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("��ʼֵ��");
		print(a);
		quickSort(a, 0, a.length - 1);
		System.out.println("�����");
		print(a);
	}

	public static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void quickSort(int[] a, int low, int high) {
		if (low < high) { // �����������жϵݹ���޷��˳����¶�ջ����쳣
			int middle = getMiddle(a, low, high);
			quickSort(a, 0, middle - 1); // �ݹ�Ե��ӱ�ݹ�����
			quickSort(a, middle + 1, high); // �ݹ�Ը��ӱ�ݹ�����
		}
	}

	public static int getMiddle(int[] a, int low, int high) {

		// int random = (int) (Math.random() * (high - low + 1)) + low;
		// int temp = a[random];
		// a[random] = a[low];
		// a[low] = temp;

		int key = a[low];// ��׼Ԫ�أ������л�ճ���һ��λ��
		while (low < high) {
			while (low < high && a[high] >= key) {// ��high��ʼ�ұȻ�׼С�ģ���low��λ��
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= key) {// ��low��ʼ�ұȻ�׼��,�ŵ�֮ǰhigh�ճ�����λ����
				low++;
			}
			a[high] = a[low];

		}
		a[low] = key;// ��ʱlow=high �ǻ�׼Ԫ�ص�λ�ã�Ҳ�ǿճ������Ǹ�λ��
		return low;

	}
}
