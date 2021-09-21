package LetsCodeItUdemy;

public class MethodsDemo {

	String text = "Ganesh";
	static String name = "Salunkhe";

	// If you put any statement under the class then it will not executed because
	// every action and statements under the method only
	// System.out.println(name);

	public static void main(String[] args) {
		// Unable to print text variable value because method is static and
		// variable is not static
		// System.out.println(text);

		// You can print the value of name variable because name is an static variable.
		// We can access because variable and and method both are static
		System.out.println(name);

	}
}
