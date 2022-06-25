package MOREPRAC;

public class PRAC2 {
	
	private int val11;
	public int val22;
	 int val33;
	protected int val44;
	
	void method11() {
		System.out.println("i am from default method11");
	}
	
	
	private void method22() {
		System.out.println("i am from private method22");
	}
	
	public void method33() {
		System.out.println("i am from public method33");
	}
	
	protected void method44() {
		System.out.println("i am from protected method44");
	}
	public static void main(String[] args) {
		
		PRAC2 b = new PRAC2();
		b.method11();
		b.method22();
		b.method33();
		b.method44();
		b.val11=55;
		
		PRAC1 a = new PRAC1();
		a.method1();
		//a.method2();
		a.method3();
		a.method4();

		//PRAC1.val1=4;
		a.val2=5;
		a.val3=6;
		a.val4=7;
	
	}

}
