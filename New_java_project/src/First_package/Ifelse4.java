package First_package;

public class Ifelse4 {

	public static void main(String[] args) {

		int age = 25;
		int weight = 50;

		if (age >= 25) {

			if (weight > 49) {
				System.out.println("eligible for blood donation ");
			} else {
				System.out.println("not eligble");
			}
		} else {
			System.out.println("Must be greater than 25");
		}

		if (age >= 25 & weight > 45) {
			System.out.println("eligible for donation");
		} else {
			System.out.println("not eligible");
		}

	}

}
