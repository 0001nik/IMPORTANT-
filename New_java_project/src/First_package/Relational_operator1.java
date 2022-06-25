package First_package;

/**
 * @author Lenovo
 *
 */
/**
 * @author Lenovo
 *
 */
/**
 * @author Lenovo
 *
 */
public class Relational_operator1 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		if (a != b) {
			System.out.println("a is not equal to b");
		}

		else {
			System.out.println("a and b are equal");
		}

		String p = "Selinium Class";
		String q = "selinium CLASS";

		// 1st way of string comparision is not correct
		if (p == q) {
			System.out.println("p is equal to q for 1st way");
		}

		else {
			System.out.println("p and q are not equal for 1st way");
		}

		// 2nd way of string comparision is not appropriate
		if (p.equals(q)) {
			System.out.println("p is equal to q for 2nd way");
		}

		else {
			System.out.println("p and q are not equal for 2nd way");
		}

		// 3rd way of string comparision is correct
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p is equal to q for 3rd way");
		}

		else {
			System.out.println("p and q are not equal for 3rd way");
		}
	}

}
