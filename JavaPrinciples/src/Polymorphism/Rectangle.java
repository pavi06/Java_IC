package Polymorphism;

public class Rectangle {
	public int a,b;
	public void area() {
		System.out.println("Area of Rectangle:  l*b  ");
	}
	public void area(int a,int b) {
		System.out.println("Area of Rectangle:  "+a*b);
	}
	//polymorphism with diff method declaration butwith same name => (overloading) 
}
