package 代码库.面试为主.栈队列;
/*
 * 一个栈依次压入1、2、3、4、5，那么从栈顶到栈底分别为5、4、
3、2、1。将这个栈转置后，从栈顶到栈底为1、2、3、4、5，
也就是实现栈中元素的逆序，但是只能用递归函数来实现，不
能用其他数据结构。
 */
import java.util.Stack;

public class 递归实现栈中元素逆序 {

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
