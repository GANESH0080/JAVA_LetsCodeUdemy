package LetsCodeItUdemy;

public class MainMethodDemo {

	public static void main(String[] args) {
		MainMethodDemo obj = new MainMethodDemo();
		obj.studentData("Ganesh", 88);
		obj.studentData("Om", 35);

	}

	public void studentData(String name, int score) {
		String grade;

		if (score > 90 && score <= 100) {
			grade = "A";

		} else if (score > 80 && score <= 90) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println("Student Name is: " + " " + name + " " + "and grade is : " + " " + grade);
	}

}