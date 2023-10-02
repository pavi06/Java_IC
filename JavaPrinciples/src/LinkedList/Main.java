package LinkedList;

public class Main {
	public static void main(String args[]) {
		CustomLinkedList l= new CustomLinkedList();
		l.addBegin(5);
		l.addBegin(2);
		l.add(10, 1);
		l.addEnd(12);
		l.display();
		System.out.println("Size: "+l.size());
//		int n=l.size;
//		System.out.println(l.delete(n));
		System.out.println(l.delete(3));
		l.display();
		System.out.println(l.delete(3));
		l.display();
	}

}
