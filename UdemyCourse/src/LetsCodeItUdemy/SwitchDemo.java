package LetsCodeItUdemy;

public class SwitchDemo {

	public static void main(String[] args) {
		String grade = "J";
		int marks;

		switch (grade) {
		case "A":
			marks = 100;
			System.out.println("100");
			break;
		case "B":
			marks = 90;
			System.out.println("90");
			break;
		case "C":
			marks = 80;
			System.out.println("80");
			break;
		case "D":
			marks = 70;
			System.out.println("70");
			break;
		case "E":
			marks = 60;
			System.out.println("60");
			break;
		case "F":
			marks = 50;
			System.out.println("50");
			break;
		case "G":
			marks = 40;
			System.out.println("40");
			break;
		case "H":
			marks = 30;
			System.out.println("30");
			break;
		case "I":
			marks = 20;
			System.out.println("20");
			break;

		default:
			System.out.println("Student Fail");

		}

	}
}
