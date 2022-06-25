package MOREPRAC;

public class CONSTRUCTER1 {
	
	int x;
	int y;
	int z;
	
	public CONSTRUCTER1(int a,int b,int c) {
		x=a;
		y=b;
		z=c;	
	}
	
	public CONSTRUCTER1() {
		x=10;
		y=20;
		z=30;
	}

	void display() {
		System.out.println("value of val1: " + x);
		System.out.println("value of val2: " + y);
		System.out.println("value of val3: " + z);
	}
	
	public static void main(String[] args) {
		CONSTRUCTER1 c1 = new CONSTRUCTER1();
		c1.display();
		CONSTRUCTER1 c2 = new CONSTRUCTER1(100,200,300);
		c2.display();
		CONSTRUCTER1 c3 = new CONSTRUCTER1(1000,2000,3000);
		c3.display();
	}

}
