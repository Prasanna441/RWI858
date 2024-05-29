package Basics;

public class Inheritance {

	public static void main(String[] args) {
		B obj=new B();
		obj.PrintB();
		obj.PrintA();
		C obj2=new C();
		obj2.PrintA();
		A obj3=new A();
		obj3.PrintA();

	}

}

class A{
	
	public int a;
	public void PrintA() {
		System.out.println("A");
		
	}
}
 class B extends A{
	void PrintB() {
		System.out.println("B");
	}
}
 
 class C extends B{
	 void PrintC() {
		 System.out.println("C");
	 }
 }
 
