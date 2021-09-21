package LetsCodeItUdemy;

public class ReturnMethodDemo {

	public static void main(String[] args) {
		String studentgrade;
		String sname;
		ReturnMethodDemo obj = new ReturnMethodDemo();
		// Save the returned grade in variable
		studentgrade = obj.studentData(48);
		// pass grade saved variable in display method for displaying the grade
		sname = "Ganesh";
		obj.displygrade(sname, studentgrade);
		studentgrade = obj.studentData(98);
		sname = "Raju";
		obj.displygrade(sname, studentgrade);
	}

// Returning grade from this method
	public String studentData(int score) {
		String grade;

		if (score > 90 && score <= 100) {
			grade = "A";

		} else if (score > 80 && score <= 90) {
			grade = "B";
		} else {
			grade = "C";
		}
		return grade;
	}

// Print the Grade in this method
	void displygrade(String name, String grade) {
		System.out.println("value is :" + name + " " + "and" + " " + grade);
	}

}