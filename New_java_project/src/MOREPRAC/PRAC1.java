package MOREPRAC;

public class PRAC1 {

	 private int val1;
	 public int val2;
	 int val3;
	 protected int val4;
	
	void method1() {
		System.out.println("i am from default method1");
	}
	
	
	private void method2() {
		System.out.println("i am from private method2");
	}
	
	public void method3() {
		System.out.println("i am from public method3");
	}
	
	protected void method4() {
		System.out.println("i am from protected method4");
	}
	public static void main(String[] args) {
		
		PRAC1 a = new PRAC1();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		a.val1=4;
		a.val2=5;
		a.val3=6;
		a.val4=7;
		a.display();
	
	}
	
	void display() {
		System.out.println("value of val1: " + val1);
		System.out.println("value of val2: " + val2);
		System.out.println("value of val3: " + val3);
		System.out.println("value of val4: " + val4);
	}
}
