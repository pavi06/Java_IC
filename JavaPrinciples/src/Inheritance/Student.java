package Inheritance;
import java.util.*;

public class Student extends Human{
	//properties
	public int rollno;
	private double cgpa;
	
	//constructor
	public Student() {};
	
	public Student(String name,int age,int rollno,double cgpa){
		super(name,age);
		this.rollno=rollno;
		this.cgpa=cgpa;
	}

	//getter setter methods for private properties
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+super.name);
		System.out.println("Age: "+super.age);
		System.out.println("Rollno: "+this.rollno);
		System.out.println("CGPA: "+this.cgpa);
	}
	
	
}
