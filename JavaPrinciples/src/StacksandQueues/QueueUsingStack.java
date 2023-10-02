package StacksandQueues;

import java.util.Stack;
//remove efficient
//remove-O(1)
//insertion-O(n)

public class QueueUsingStack {
	private Stack<Integer> first;
	private Stack<Integer> second;
	
	QueueUsingStack(){
		first=new Stack<>();
		second = new Stack<>();
	}
	
	public void insert(int item) {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		first.push(item);
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		System.out.println("Inserted successfully");
		
	}
	
	public int remove() {
		return first.pop();
	}
	
	public void peek() {
		System.out.println(first.peek());
	}

}
