package LetsCodeItUdemy;

public class AccessModCases {

	int i = 10;

	void defaultmethod() {
		System.out.println("Default Method");
	}
	
	AccessModCases()
	{
		System.out.println("No Modifier Constructor");
	}

	private int privatint = 10;

	private void privatemethod() {
		System.out.println("Private Void Method");
	}


	@SuppressWarnings("unused")
	private AccessModCases(int abc)
	{
		System.out.println("Private Constructor");
	}

	
	public static String publicint = "Ganesh";

	public static void publicmethod() {
		System.out.println("Public method");
	}
	public AccessModCases(String abc)
	{
		System.out.println("Public Constructor");
	}

	
	
	protected String protectedsting = "Salunkhe";
    protected String provariable;
	protected void protectedmethod() {
		System.out.println("Protected Method");
	}
	
	protected AccessModCases(int xyz, String ab)
	{
		System.out.println("protected Constructor");
	}


	public static void main(String[] args) {
		AccessModCases cd = new AccessModCases();
		// Accessing No modifier variable in same class
		System.out.println(cd.i);
		// accessing no modifier method in same class
		cd.defaultmethod();

		// Accessing private variable in same class
		System.out.println(cd.privatint);
		// Accessing private method in same class
		cd.privatemethod();

		// Accessing public variable in same class
		System.out.println(cd.publicint);
		// Accessing public method in same class
		cd.publicmethod();

		// Accessing protected variable in same class
		System.out.println(cd.protectedsting);
		// Accessing protected method in same class
		cd.protectedmethod();

	}
	}
