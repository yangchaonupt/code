package 代码库.笔试为主.数组矩阵;
/*
 * P为给定的二维平面整数点集。定义 P 中某点x，如果x满足 P中任意点都不在 x 
 * 的右上方区域内（横纵坐标都大于x），则称其为“最大的”。求出所有“最大的”点的集合。
 * （所有点的横坐标和纵坐标都不重复, 坐标轴范围在[0, 1e9) 内）如下图：实心点为满足条件的点的集合。
 * 请实现代码找到集合 P 中的所有 ”最大“ 点的集合并输出。
	输入
	第一行输入点集的个数 N， 接下来 N 行，每行两个数字代表点的 X 轴和 Y 轴。
	输出
	输出“最大的” 点集合， 按照 X 轴从小到大的方式输出，每行两个数字分别代表点的 X 轴和 Y轴。
	样例输入
	5
	1 2
	5 3
	4 6
	7 5
	9 0
	题目一
	样例输出
	输出结果按照 x 轴排序，如上例输出为：
	4 6
	7 5
	9 0
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class 右下角 {
	public static class Node {
		public int x;
		public int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static class MyComparator implements Comparator<Node> {

		@Override
		public int compare(Node o1, Node o2) {
			if (o1.x != o2.x) {
				return o1.x - o2.x;
			} else {
				return o2.y - o1.y;
			}
		}

	}

	public static LinkedList<Node> getRightCornerNodes1(int[] x, int[] y) {
		int size = x.length;
		LinkedList<Node> res = new LinkedList<Node>();
		Node[] nodes = new Node[size];
		for (int i = 0; i < size; i++) {
			nodes[i] = new Node(x[i], y[i]);
		}
		Arrays.sort(nodes, new MyComparator());
		for (int i = 0; i < size; i++) {
			boolean insert = true;
			for (int j = 0; j < size; j++) {
				if ((nodes[i].x < nodes[j].x) && (nodes[i].y < nodes[j].y)) {
					insert = false;
				}
			}
			if (insert) {
				res.add(nodes[i]);
			}
		}
		return res;
	}

	public static LinkedList<Node> getRightCornerNodes2(int[] x, int[] y) {
		int size = x.length;
		LinkedList<Node> res = new LinkedList<Node>();
		Node[] nodes = new Node[size];
		for (int i = 0; i < size; i++) {
			nodes[i] = new Node(x[i], y[i]);
		}
		Arrays.sort(nodes, new MyComparator());
		res.add(nodes[size - 1]);
		int rightMaxY = nodes[size - 1].y;
		for (int i = size - 2; i >= 0; i--) {
			if (nodes[i].y >= rightMaxY) {
				res.addFirst(nodes[i]);
			}
			rightMaxY = Math.max(rightMaxY, nodes[i].y);
		}
		return res;
	}

	public static int[] generateRandomArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * 1000);
		}
		return arr;
	}

	public static boolean isEqual(LinkedList<Node> list1, LinkedList<Node> list2) {
		if (list1.size() != list2.size()) {
			return false;
		}
		while (!list1.isEmpty()) {
			Node node1 = list1.pollFirst();
			Node node2 = list2.pollFirst();
			if (node1.x != node2.x || node1.y != node2.y) {
				return false;
			}
		}
		return true;
	}

	public static void printArray(int[] x, int[] y) {
		for (int i = 0; i < x.length; i++) {
			System.out.print("(" + x[i] + "," + y[i] + ") ");
		}
		System.out.println();
	}

	public static void printLinkedList(LinkedList<Node> list) {
		for (Node node : list) {
			System.out.print("(" + node.x + "," + node.y + ") ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int testTime = 3000000;
		for (int i = 0; i < testTime; i++) {
			int size = 3;
			int[] x = generateRandomArray(size);
			int[] y = generateRandomArray(size);
			LinkedList<Node> res1 = getRightCornerNodes1(x, y);
			LinkedList<Node> res2 = getRightCornerNodes2(x, y);
			if (!isEqual(res1, res2)) {
				printArray(x, y);
				printLinkedList(res1);
				printLinkedList(res2);
				break;
			}
		}
	}
}
