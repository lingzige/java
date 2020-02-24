/*
用栈实现队列：
	-1. 用两个栈实现一个队列
*/

public class MyQueue{
	private Stack<Integer> stackPop;
	private Stack<Integer> stackPush;

	public MyQueue(){
		// 初始化栈
		stackPop = new Stack<>(); // 负责出栈
		stackPush = new Stack<>(); // 负责进栈
	}

	// 添加
	public void push(int x){
		stackPush.push(x);
	}

	// 删除
	public int pop(){
		// 当出栈的栈中没有元素时，将进栈中的元素全部添加到出栈的栈中
		if(stackPop.isEmpty()){
			while(!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		}
		if(!stackPop.isEmpty()){
			return stackPop.pop();
		}
		throw new RuntimeException("栈中没有元素");
	}

	// 获取栈顶元素
	public int peek(){
		if(stackPop.isEmpty()){
			while(!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		}
		if(!stackPop.isEmpty()){
			return stackPop.peek();
		}
		throw new RuntimeException("栈中没有元素");
	}

	// 判断是否为空
	public boolean isEmpty(){
		return stackPush.isEmpty() && stackPop.isEmpty();
	}
}