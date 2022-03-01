package com;
class A{
	int x=100;
}
class B extends A{
	int x=200;
	void dis1();{
		int x=300;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
	}
	
}

public class superandthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B obj =new B();
 obj.dis1();
	}

}
