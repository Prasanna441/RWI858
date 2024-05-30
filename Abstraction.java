package Basics;

abstract class Aa{
	abstract void printname();
	abstract void printage();
	void printRollNo(int a) {
		System.out.println(a);
	}
	
}

class Bb extends Aa{
	void printname() {
		System.out.println("prasanna");
	}
	
	void printage() {
		System.out.println("22");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bb obj=new Bb();
		obj.printname();
		obj.printage();
		obj.printRollNo(858);

	}

}
