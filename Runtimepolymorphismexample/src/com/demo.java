package com;
class A{
	void dis1() {
System.out.println("A class own dis1 method");
	}
}
class B extends A{
	void dis1() {
		System.out.println("B class overide dis1 method");
	}
	void dis2() {
		System.out.println("B class own dis2 method");
	}
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj1=new A();  obj1.dis1();
B obj2=new B();  obj2.dis1(); obj2.dis2();
A obj3=new B();  obj3.dis1();
	}

}
