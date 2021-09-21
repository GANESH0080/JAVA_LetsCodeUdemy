package UdemyCourseExamples;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Before Exception");
			int i = 1 / 0;
			// Below line not get print because of exception
			System.out.println("After Exception");
		} catch (Exception exe)

		{
			System.out.println("Message is :" + " " + exe.getMessage());
			System.out.println("Exception is " + exe);
			System.out.println("Stacktrace :" + " " + exe.toString());

// printStackTrace never be in println
			exe.printStackTrace();
		}

		finally {
			System.out.println("I m in Finally");

		}

	}
}
