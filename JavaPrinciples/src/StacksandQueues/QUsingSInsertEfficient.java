package StacksandQueues;

import java.util.Stack;
//insert efficient
//remove-O(n)
//insertion-O(1)

public class QUsingSInsertEfficient {
	
	private Stack<Integer> first;
	private Stack<Integer> second;
	
	QUsingSInsertEfficient(){
		first=new Stack<>();
		second = new Stack<>();
	}
	
	public int remove() {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int ele=second.pop();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return ele;
		
	}
	
	public void insert(int item) {
		first.push(item);
	}
	
	public int peek() {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int ele=second.peek();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return ele;
		
	}

}
