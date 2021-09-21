package LetsCodeItUdemy;

public class VariableDemo {

	static int iclassvar;
	static byte bvariable;
	static char cvariable;
	static char cvariable11 = 78;
	static float fvariable;
	static long lvariable;
	static boolean boovariable;

	public static void main(String[] args) {
		// If the variable declared in method we cant identify the default value of that
		// variable
		// If you want to identify the default value of variable then you have to create
		// variable globally (under the class)
		// Local variable means variable define or declared in method
		// Instance or class variable means variable define under the class
		int ilocalvarivale = 10;
		byte blocalvariable;
		char clocalvariable = 'r';
		char clocalvariable11 = 78;
		float flocalvariable;
		long llocalvariable;
		boolean boolocalvariable;

		System.out.println("Print default value of I:" + " " + ilocalvarivale);
		System.out.println("Print default value of I:" + " " + blocalvariable);
		System.out.println("Print default value of I:" + " " + clocalvariable);
		System.out.println("Print default value of I:" + " " + clocalvariable11);
		System.out.println("Print default value of I:" + " " + flocalvariable);
		System.out.println("Print default value of I:" + " " + llocalvariable);
		System.out.println("Print default value of I:" + " " + boolocalvariable);

		System.out.println("-----------------------------------------------------------");

		System.out.println("Print default value of I:" + " " + iclassvar);
		System.out.println("Print default value of I:" + " " + bvariable);
		System.out.println("Print default value of I:" + " " + cvariable);
		System.out.println("Print default value of I:" + " " + cvariable11);
		System.out.println("Print default value of I:" + " " + fvariable);
		System.out.println("Print default value of I:" + " " + lvariable);
		System.out.println("Print default value of I:" + " " + boovariable);
	}

	public void accessvariable() {
		// We cant access any local variable inside the any method
		System.out.println("Print default value of I:" + " " + ilocalvarivale);

		// We can access Global variable inside any method
		System.out.println("Print default value of I:" + " " + iclassvar);
	}
}