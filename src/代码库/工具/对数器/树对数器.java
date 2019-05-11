package 代码库.工具.对数器;



public class 树对数器 {
	//构造树的节点，包含左右节点和值
	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}
	
	public static void main(String[] args) {
		//生成树
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right.left = new Node(6);
	}

	
	
	

}
