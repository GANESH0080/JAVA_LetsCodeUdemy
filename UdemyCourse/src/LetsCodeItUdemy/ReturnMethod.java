package LetsCodeItUdemy;

public class ReturnMethod {

	public static void main(String[] args) {

		int add = addition(10,20);
		System.out.println("Addtion of two numbers is :" +add);
		
	}

	public static int addition(int a, int b) {
		int c = a + b;
		return c;
	}

}
