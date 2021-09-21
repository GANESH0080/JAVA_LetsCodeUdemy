package UdemyCourseExamples;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void demo() throws Exception

	{
		System.out.println("In method before the exception");
		int i = 1 / 0;
		System.out.println("In method after the exception");

	}

}
