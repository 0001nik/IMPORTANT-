package First_package;

public class Unary_operators2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		System.out.println(a++); // 10,11
		System.out.println(a++ + ++a); // 11,12,13,13
		System.out.println(a + a++); // 13,13,14
		System.out.println(b++ + b--); // 10,11,11,10
		System.out.println(b++ + b--); // 10,11,11,10
		System.out.println(b); // 10

	}

}
