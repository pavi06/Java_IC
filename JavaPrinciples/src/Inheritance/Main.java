package Inheritance;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		Student stud=new Student("Pavi",21,105,9.8);
//		Student stud=new Student();
//		stud.name="Pavi";
//		stud.rollno=105;
//		stud.setCgpa(9.8);
		
		stud.displayInfo();//private ele can be accessed through getter method
		//System.out.println("My cgpa: "+stud.getCgpa());
		
		Human stud1 = new Student("Sai",15,101,9.3);
		System.out.println(stud1.age);
		System.out.println(stud1.name);
		//can access only the base class properties==>since parent holds the child class ref and it knows only its properties
		//cannot call like Student stud1=new Human(name,age)->it holds parent class ref
	}
}
