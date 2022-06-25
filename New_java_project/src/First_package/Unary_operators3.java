package First_package;

public class Unary_operators3 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		System.out.println(a++); // 10,11
		System.out.println(a++ + ++a); // 11,12,13,13
		System.out.println(b++ + ++b); // 10,11,12,12
		System.out.println(b++ + b++); // 12,13,13,14
		System.out.println(b); // 14
		System.out.println(a++ + b++); // 13,14,14,15

		int x = 2;
		int y = x++;
		System.out.println(y); // 2
		System.out.println(x); // 3
		System.out.println(x); // 3
		System.out.println(y); // 2

	}

}
