package Basics;

interface interA{
	void printA();
}


interface interC{
	void printC();
}

interface interD{
	void printD();
	
}


class interB implements interA,interC,interD{
	@Override
	public void printA() {
		// TODO Auto-generated method stub
		System.out.println("A");
		
	}

	@Override
	public void printD() {
		// TODO Auto-generated method stub
		System.out.println("D");
		
	}

	@Override
	public void printC() {
		// TODO Auto-generated method stub
		System.out.println("C");
		
	}
	
	
}



public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interB obj = new interB();
		obj.printA();
		obj.printC();
		obj.printD();

		

	}

}
