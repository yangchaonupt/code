package 代码库.笔试为主.递归和动态规划;

public class 龙与地下城游戏 {
	/*
	给定一个二维数组，含义是一张地图，如
	-2 -3  3
	-5 -10 1
	0  30 -5
	规则：
	1.骑士左上角出发只能向右向下走，公主在右下角
	2.负数说明是怪兽损失血量，正数血瓶加血
	3.走到任意位置，血量不能少于1
	保证见到公主，初始血量至少是多少
	 */

	public static int minHP1(int[][] m) {
		if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
			return 1;
		}
		int row = m.length;
		int col = m[0].length;
		int[][] dp = new int[row--][col--];
		dp[row][col] = m[row][col] > 0 ? 1 : -m[row][col] + 1;
		for (int j = col - 1; j >= 0; j--) {
			dp[row][j] = Math.max(dp[row][j + 1] - m[row][j], 1);
		}
		int right = 0;
		int down = 0;
		for (int i = row - 1; i >= 0; i--) {
			dp[i][col] = Math.max(dp[i + 1][col] - m[i][col], 1);
			for (int j = col - 1; j >= 0; j--) {
				right = Math.max(dp[i][j + 1] - m[i][j], 1);
				down = Math.max(dp[i + 1][j] - m[i][j], 1);
				dp[i][j] = Math.min(right, down);
			}
		}
		return dp[0][0];
	}

	public static int minHP2(int[][] m) {
		if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
			return 1;
		}
		int more = Math.max(m.length, m[0].length);
		int less = Math.min(m.length, m[0].length);
		boolean rowmore = more == m.length;
		int[] dp = new int[less];
		int tmp = m[m.length - 1][m[0].length - 1];
		dp[less - 1] = tmp > 0 ? 1 : -tmp + 1;
		int row = 0;
		int col = 0;
		for (int j = less - 2; j >= 0; j--) {
			row = rowmore ? more - 1 : j;
			col = rowmore ? j : more - 1;
			dp[j] = Math.max(dp[j + 1] - m[row][col], 1);
		}
		int choosen1 = 0;
		int choosen2 = 0;
		for (int i = more - 2; i >= 0; i--) {
			row = rowmore ? i : less - 1;
			col = rowmore ? less - 1 : i;
			dp[less - 1] = Math.max(dp[less - 1] - m[row][col], 1);
			for (int j = less - 2; j >= 0; j--) {
				row = rowmore ? i : j;
				col = rowmore ? j : i;
				choosen1 = Math.max(dp[j] - m[row][col], 1);
				choosen2 = Math.max(dp[j + 1] - m[row][col], 1);
				dp[j] = Math.min(choosen1, choosen2);
			}
		}
		return dp[0];
	}

	public static void main(String[] args) {
		int[][] map = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 }, };
		System.out.println(minHP1(map));
		System.out.println(minHP2(map));

	}

}
