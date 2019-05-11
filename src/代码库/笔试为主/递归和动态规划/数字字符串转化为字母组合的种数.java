package 代码库.笔试为主.递归和动态规划;

public class 数字字符串转化为字母组合的种数 {
	/*
	给定一个字符串str，str全部由数字字符组成，如果str中某一个或相邻两个字符
	组成的子串值在1-26之间，则这个子串可以转化为一个字母。规定"1"转化为"A"，"2"转化为"B"，
	。。"26"转化为"Z"。写一个函数，求str有多少种不同的转化结果，并返回种数。
	 */

	public static int num1(String str) {
		if (str == null || str.equals("")) {
			return 0;
		}
		char[] chs = str.toCharArray();
		return process(chs, 0);
	}

	public static int process(char[] chs, int i) {
		if (i == chs.length) {
			return 1;
		}
		if (chs[i] == '0') {
			return 0;
		}
		int res = process(chs, i + 1);
		if (i + 1 < chs.length && (chs[i] - '0') * 10 + chs[i + 1] - '0' < 27) {
			res += process(chs, i + 2);
		}
		return res;
	}

	public static int num2(String str) {
		if (str == null || str.equals("")) {
			return 0;
		}
		char[] chs = str.toCharArray();
		int cur = chs[chs.length - 1] == '0' ? 0 : 1;
		int next = 1;
		int tmp = 0;
		for (int i = chs.length - 2; i >= 0; i--) {
			if (chs[i] == '0') {
				next = cur;
				cur = 0;
			} else {
				tmp = cur;
				if ((chs[i] - '0') * 10 + chs[i + 1] - '0' < 27) {
					cur += next;
				}
				next = tmp;
			}
		}
		return cur;
	}

	public static void main(String[] args) {
		String str = "781231783161018231";
		System.out.println(num1(str));
		System.out.println(num2(str));

	}
}
