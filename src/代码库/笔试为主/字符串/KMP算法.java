package 代码库.笔试为主.字符串;
/*
字符串匹配问题，求的是匹配的第一个位置，无则返回-1
 */
public class KMP算法 {

	public static int getIndexOf(String s, String m) {
		if (s == null || m == null || m.length() < 1 || s.length() < m.length()) {
			return -1;
		}
		char[] ss = s.toCharArray();
		char[] ms = m.toCharArray();
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(ms);

		while (si < ss.length && mi < ms.length) {
			if (ss[si] == ms[mi]) {
				si++;
				mi++;
			} else if (next[mi] == -1) {
				si++;
			} else {
				mi = next[mi];
			}
		}
		return mi == ms.length ? si - mi : -1;
	}

	//此处为，最长前缀和最长后缀的匹配度。比如abcabcd，d的最长前缀和最长后缀的匹配度为3，
	// 最长前缀不到最后一位，最长后缀不到第一位
	public static int[] getNextArray(char[] ms) {
		if (ms.length == 1) {
			return new int[] { -1 };
		}
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < next.length) {
			if (ms[pos - 1] == ms[cn]) {
				next[pos++] = ++cn;
			} else if (cn > 0) {
				cn = next[cn];
			} else {
				next[pos++] = 0;
			}
		}
		return next;
	}

	public static void main(String[] args) {
		String str = "abcabcababaccc";
		String match = "ababa";
		System.out.println(getIndexOf(str, match));

//		String test ="ababaaababaa";
//		int [] next = getNextArray(test.toCharArray());
//		for(int i=0;i<next.length;i++){
//			System.out.print(next[i]+",");
//		}

	}

}
