package �����.����Ϊ��.����;
/*
 *����һ���ȸ����������1~5���������rand1To5���£�  	
 *public int rand1To5() { 		
 *	return (int) (Math.random() * 5) + 1; 	
 *} 
 * ����֮�⣬����ʹ���κζ����������ƣ�����rand1To5ʵ�ֵȸ����������1~7���������rand1To7�� 
 */
public class ���5�����7 {

	public static int rand1To5() {
		return (int) (Math.random() * 5) + 1;
	}

	public static int rand1To7() {
		int num = 0;
		do {
			num = (rand1To5() - 1) * 5 + rand1To5() - 1;
		} while (num > 20);
		return num % 7 + 1;
	}
//	public static int rand1To7(){
//		return rand1To5()*7/5-(1/ rand1To5()-1/5)/2;
//	}
	
/*��������Ŀ�� ����һ����p���ʲ���0����1-p���ʲ���1���������rand01p���£�  	
 * public int rand01p() { 		
 * 		// ������ı�p 		
 * 		double p = 0.83; 		
 * 		return Math.random() < p ? 0 : 1; 	
 * }  
 * ����֮�⣬����ʹ���κζ����������ƣ�����rand01pʵ�ֵȸ����������1~6���������rand1To6�� 
 * 	
 */
	public static int rand01p() {
		// you can change p to what you like, but it must be (0,1)
		double p = 0.83;
		return Math.random() < p ? 0 : 1;
	}

	public static int rand01() {
		int num;
		do {
			num = rand01p();
		} while (num == rand01p());
		return num;
	}

	public static int rand0To3() {
		return rand01() * 2 + rand01();
	}

	public static int rand1To6() {
		int num = 0;
		do {
			num = rand0To3() * 4 + rand0To3();
		} while (num > 11);
		return num % 6 + 1;
	}
/*
 * ��������Ŀ�� ����һ���ȸ����������1~M���������rand1ToM���£�  	
 * public int rand1ToM(int m) {
 * 		return (int) (Math.random() * m) + 1; 	
 *  }  
 *  ����֮�⣬����ʹ���κζ����������ơ�
 *  ����������������ֱ�Ϊm��n������rand1ToM(m)ʵ�ֵȸ����������1~n���������rand1ToN�� 
 */
	public static int rand1ToM(int m) {
		return (int) (Math.random() * m) + 1;
	}

	public static int rand1ToN(int n, int m) {
		int[] nMSys = getMSysNum(n - 1, m);
		int[] randNum = getRanMSysNumLessN(nMSys, m);
		return getNumFromMSysNum(randNum, m) + 1;
	}

	// ��valueת��m���Ƶ���
	public static int[] getMSysNum(int value, int m) {
		int[] res = new int[32];
		int index = res.length - 1;
		while (value != 0) {
			res[index--] = value % m;
			value = value / m;
		}
		return res;
	}

	// �ȸ����������һ��0~nMsys��Χ�ϵ�����ֻ������m���Ʊ��ġ�
	public static int[] getRanMSysNumLessN(int[] nMSys, int m) {
		int[] res = new int[nMSys.length];
		int start = 0;
		while (nMSys[start] == 0) {
			start++;
		}
		int index = start;
		boolean lastEqual = true;
		while (index != nMSys.length) {
			res[index] = rand1ToM(m) - 1;
			if (lastEqual) {
				if (res[index] > nMSys[index]) {
					index = start;
					lastEqual = true;
					continue;
				} else {
					lastEqual = res[index] == nMSys[index];
				}
			}
			index++;
		}
		return res;
	}

	// ��m���Ƶ���ת��10����
	public static int getNumFromMSysNum(int[] mSysNum, int m) {
		int res = 0;
		for (int i = 0; i != mSysNum.length; i++) {
			res = res * m + mSysNum[i];
		}
		return res;
	}

	public static void printCountArray(int[] countArr) {
		for (int i = 0; i != countArr.length; i++) {
			System.out.println(i + " appears " + countArr[i] + " times");
		}
	}

	public static void main(String[] args) {
		int testTimes = 1000000;
		int[] countArr1 = new int[8];
		for (int i = 0; i != testTimes; i++) {
			countArr1[rand1To7()]++;
		}
		printCountArray(countArr1);

		System.out.println("=====================");

		int[] countArr2 = new int[7];
		for (int i = 0; i != testTimes; i++) {
			countArr2[rand1To6()]++;
		}
		printCountArray(countArr2);

		System.out.println("=====================");

		int n = 17;
		int m = 3;
		int[] countArr3 = new int[n + 1];
		for (int i = 0; i != 2000000; i++) {
			countArr3[rand1ToN(n, m)]++;
		}
		printCountArray(countArr3);

		System.out.println("=====================");

	}

}
