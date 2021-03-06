package 代码库.笔试为主.递归和动态规划;

public class 换钱的最少货币数 {
	/*
	【题目】
	给定数组 arr， arr 中所有的值都为正数且不重复。每个值代表一种面值的货币，每种面值的
	货币可以使用任意张，再给定一个整数 aim 代表要找的钱数，求组成 aim 的最少货币数。
	【举例】
	arr=[5,2,3]， aim=20。
	4 张 5 元可以组成 20 元，其他的找钱方案都要使用更多张的货币，所以返回 4。
	arr=[5,2,3]， aim=0。
	不用任何货币就可以组成 0 元，返回 0。
	arr=[3,5]， aim=2。
	根本无法组成 2 元，钱不能找开的情况下默认返回-1
	 */
	public static int minCoins1(int[] arr, int aim) {
		if (arr == null || arr.length == 0 || aim < 0) {
			return -1;
		}
		int n = arr.length;
		int max = Integer.MAX_VALUE;
		int[][] dp = new int[n][aim + 1];
		for (int j = 1; j <= aim; j++) {
			dp[0][j] = max;
			if (j - arr[0] >= 0 && dp[0][j - arr[0]] != max) {
				dp[0][j] = dp[0][j - arr[0]] + 1;
			}
		}
		int left = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= aim; j++) {
				left = max;
				if (j - arr[i] >= 0 && dp[i][j - arr[i]] != max) {
					left = dp[i][j - arr[i]] + 1;
				}
				dp[i][j] = Math.min(left, dp[i - 1][j]);
			}
		}
		return dp[n - 1][aim] != max ? dp[n - 1][aim] : -1;
	}

	public static int minCoins2(int[] arr, int aim) {
		if (arr == null || arr.length == 0 || aim < 0) {
			return -1;
		}
		int n = arr.length;
		int max = Integer.MAX_VALUE;
		int[] dp = new int[aim + 1];
		for (int j = 1; j <= aim; j++) {
			dp[j] = max;
			if (j - arr[0] >= 0 && dp[j - arr[0]] != max) {
				dp[j] = dp[j - arr[0]] + 1;
			}
		}
		int left = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= aim; j++) {
				left = max;
				if (j - arr[i] >= 0 && dp[j - arr[i]] != max) {
					left = dp[j - arr[i]] + 1;
				}
				dp[j] = Math.min(left, dp[j]);
			}
		}
		return dp[aim] != max ? dp[aim] : -1;
	}

	/*
	补充问题：
	给定数组arr,arr中所有的值的都为正数。每个值仅代表一张钱的面值，在给定一个整数aim
	代表要找的钱数，求组成aim的最小的货币数。
	 */
	public static int minCoins3(int[] arr, int aim) {
		if (arr == null || arr.length == 0 || aim < 0) {
			return -1;
		}
		int n = arr.length;
		int max = Integer.MAX_VALUE;
		int[][] dp = new int[n][aim + 1];
		for (int j = 1; j <= aim; j++) {
			dp[0][j] = max;
		}
		if (arr[0] <= aim) {
			dp[0][arr[0]] = 1;
		}
		int leftup = 0; // 左上角某个位置的值
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= aim; j++) {
				leftup = max;
				if (j - arr[i] >= 0 && dp[i - 1][j - arr[i]] != max) {
					leftup = dp[i - 1][j - arr[i]] + 1;
				}
				dp[i][j] = Math.min(leftup, dp[i - 1][j]);
			}
		}
		return dp[n - 1][aim] != max ? dp[n - 1][aim] : -1;
	}

	public static int minCoins4(int[] arr, int aim) {
		if (arr == null || arr.length == 0 || aim < 0) {
			return -1;
		}
		int n = arr.length;
		int max = Integer.MAX_VALUE;
		int[] dp = new int[aim + 1];
		for (int j = 1; j <= aim; j++) {
			dp[j] = max;
		}
		if (arr[0] <= aim) {
			dp[arr[0]] = 1;
		}
		int leftup = 0; // 左上角某个位置的值
		for (int i = 1; i < n; i++) {
			for (int j = aim; j > 0; j--) {
				leftup = max;
				if (j - arr[i] >= 0 && dp[j - arr[i]] != max) {
					leftup = dp[j - arr[i]] + 1;
				}
				dp[j] = Math.min(leftup, dp[j]);
			}
		}
		return dp[aim] != max ? dp[aim] : -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 100, 20, 5, 10, 2, 50, 1 };
		int aim1 = 17019;
		System.out.println(minCoins1(arr1, aim1));
		System.out.println(minCoins2(arr1, aim1));

		int[] arr2 = { 10, 100, 2, 5, 5, 5, 10, 1, 1, 1, 2, 100 };
		int aim2 = 223;
		System.out.println(minCoins3(arr2, aim2));
		System.out.println(minCoins4(arr2, aim2));

	}
}
