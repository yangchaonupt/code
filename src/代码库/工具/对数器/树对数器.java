package �����.����.������;



public class �������� {
	//�������Ľڵ㣬�������ҽڵ��ֵ
	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}
	
	public static void main(String[] args) {
		//������
		Node head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right.left = new Node(6);
	}

	
	
	

}
