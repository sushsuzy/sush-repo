package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesClass class1=new SalesClass();
		System.out.println("Hello World!");
		greet();
		class1.show();
	}
	
	public static void greet() {
		System.out.println("Hello");
		System.out.println("How are you?");
		System.out.println("Be happy");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
