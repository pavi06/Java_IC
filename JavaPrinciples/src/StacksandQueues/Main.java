package StacksandQueues;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		QueueUsingStack qs=new QueueUsingStack();
//		qs.insert(1);
//		qs.insert(2);
//		qs.insert(3);
//		qs.insert(4);
//		qs.insert(5);
//		System.out.println(qs.remove());
//		qs.peek();
		
		
		QUsingSInsertEfficient q = new QUsingSInsertEfficient();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		System.out.println(q.remove());
		System.out.println(q.peek());
		
	}

}
