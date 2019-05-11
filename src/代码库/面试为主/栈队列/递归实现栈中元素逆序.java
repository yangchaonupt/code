package �����.����Ϊ��.ջ����;
/*
 * һ��ջ����ѹ��1��2��3��4��5����ô��ջ����ջ�׷ֱ�Ϊ5��4��
3��2��1�������ջת�ú󣬴�ջ����ջ��Ϊ1��2��3��4��5��
Ҳ����ʵ��ջ��Ԫ�ص����򣬵���ֻ���õݹ麯����ʵ�֣���
�����������ݽṹ��
 */
import java.util.Stack;

public class �ݹ�ʵ��ջ��Ԫ������ {

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}

	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}

	public static void main(String[] args) {
		Stack<Integer> test = new Stack<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		test.push(5);
		reverse(test);
		while (!test.isEmpty()) {
			System.out.println(test.pop());
		}

	}


}
