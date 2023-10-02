package LinkedList;

public class CustomLinkedList {
	
	public Node head;//two pointer
	public Node tail;
	public int size=0;
	
	//method to add ele at begining
	public void addBegin(int value) {
		Node n= new Node(value);
		n.next=head;
		head=n;
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	//method to add at the end
	public void addEnd(int value) {
		if(tail==null) {
			addBegin(value);
			return;
		}
		Node n= new Node(value);
		tail.next=n;
		tail=n;
		size+=1;
	}
	
	
	//method to add the ele inbetween
		public void add(int value,int index) {
			Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			Node n = new Node(value,temp.next);
			temp.next=n;
			size+=1;
		}
		
	//method to delete first ele
	public int  deleteFirst() {
		int value=head.value;
		head=head.next;
		return value;
	}
	
	//method to delete last ele
		public int  deleteLast() {
			if(size<=1) {
				deleteFirst();
			}
			
			Node prev=get(size-1);
			int value=prev.next.value;
			tail=prev;
			tail.next=null;
			return value;
//			Node temp=head;
//			while(temp.next!=null) {
//				tail=temp;
//				temp=temp.next;
//			}
//			tail.next=null;
//			int value=temp.value;
//			return value;
		}
		
		//method to delete inbetween ele
				public int  delete(int index) {
					if(index==1) {
						deleteFirst();
					}
					if(index==size) {
						deleteLast();
					}
					Node prev=get(index-1);
					int value=prev.next.value;
					prev.next=prev.next.next;
					return value;
				}
				
	public Node get(int index) {
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		return temp;
	}
		
	//method to display size;
	public int size() {
		return size;
	}
		
	//method to display the values
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"-->");
			temp=temp.next;
		}
		System.out.println("END");
	
	}
	
	//Node class
	public class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value,Node next) {
			this.value=value;
			this.next=next;
		}
	}

}
