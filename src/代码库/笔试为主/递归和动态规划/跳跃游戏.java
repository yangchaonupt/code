package 代码库.笔试为主.递归和动态规划;

public class 跳跃游戏 {
	/*
	给定数组arr，arr[i]==k代表可以从位置i向右跳1-k个距离。比如arr[]==3,代表
	从位置2可以跳到位置3，位置4，或位置5.如果从位置0出发，返回最少跳几次能跳到arr
	最后的位置上。
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
