package LetsCodeItUdemy;

public class ConditionalStDemo {

	public static void main(String[] args) {

		System.out.println("Only IF Excample");
		String abc = "apple";
		if (abc == "apple") {
			System.out.println("I m apple");
		}

		System.out.println("-----------------------------------------");
		System.out.println("If - else example");
		int a = 10;
		if (a == 11) {
			System.out.println("Not matched");
		} else {
			System.out.println("Matched");
		}

		System.out.println("-----------------------------------------");
		System.out.println("If - else example");

		int m = 10;
		int n = 20;

		if (m == n) {
			System.out.println("both numbers are matched" + " " + m + " " + n);
		} else {
			System.out.println("both numbers are not matched" + " " + m + "and" + n);
		}

		System.out.println("-----------------------------------------");
		System.out.println("If - Else - If example");
		String grade = "D";
		if (grade == "A") {
			System.out.println("Fabulaous");
		} else if (grade == "B") {
			System.out.println("Smart");
		} else if (grade == "C") {
			System.out.println("Cool");
		} else {
			System.out.println("Super");
		}

		System.out.println("-----------------------------------------");
		System.out.println("Nested If Example");
		String name = "Ganesh";
		if (name == "Ganesh") {
			System.out.println("Ganesh Bhai");
			if (name == "Sahaji") {
				System.out.println("Sonu Bhai");
				if (name == "Jyotiram") {
					System.out.println("Deepak Bhai");
				}
			}
		}

		else {
			System.out.println("Om Salunkhe");
		}

	}

}
