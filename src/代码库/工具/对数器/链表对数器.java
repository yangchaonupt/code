package �����.����.������;



public class ��������� {
	//��������Ľڵ㣬������һ���ڵ��ֵ
	public static class Node {
		public int value;
		public Node next;
		public Node(int data) {
			this.value = data;
		}
	}
	
	public static void main(String[] args) {
		//��������
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);

		while(head!=null){
			System.out.print(head.value+"->");
			if(head.next==null){
				System.out.print("null");
			}
			head=head.next;
		}
	}
	
}
