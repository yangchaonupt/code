package 代码库.工具.对数器;



public class 链表对数器 {
	//构造链表的节点，包含下一个节点和值
	public static class Node {
		public int value;
		public Node next;
		public Node(int data) {
			this.value = data;
		}
	}
	
	public static void main(String[] args) {
		//生成链表
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
