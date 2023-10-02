package CustomArrayList;

import java.util.ArrayList;

public class ArrayListDefault {
	public static void main(String args[]) {
		//default arrayList
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(10);
		list.add(12);
		list.add(15);//ele add
		System.out.println("ArrayList: "+list);
		list.add(1, 6);//ele add with index(position)
		System.out.println("Altered ArrayList: "+list);
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1 =  (ArrayList<Integer>) list.clone();//casting the object to arraylist
		System.out.println("Cloned ArrayList: "+list1);
		System.out.println(list1==list);//checking both objects are same.(i.e pointing to same object)
		System.out.println(list1.equals(list));//checking the values are the same
		
		list.clear();
		System.out.println("ArrayList: "+list);
		
		System.out.println(list1.contains(6));
		System.out.println("HashCode for list1 object: "+list1.hashCode());
		
		System.out.println("Index of 12: "+list1.indexOf(12));
		System.out.println(list1.remove(2));
		System.out.println("ArrayList: "+list1);
		
		System.out.println("Size of Arraylist: "+list1.size());
		System.out.println(list1.isEmpty());
		list1.add(12);
		list1.add(153);
		list1.add(12);
		System.out.println("ArrayList: "+list1);
		System.out.println(list1.lastIndexOf(6));//index of last occurance of the ele 
		
	}

}
