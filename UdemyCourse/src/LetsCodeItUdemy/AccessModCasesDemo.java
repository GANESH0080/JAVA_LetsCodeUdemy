package LetsCodeItUdemy;

public class AccessModCasesDemo {

	public static void main(String[] args) {
		AccessModCases dc = new AccessModCases();
		//Accessing default variable in other class of same package
		System.out.println(dc.i);
		// Accessing default method in other class of same package
		dc.defaultmethod();
		
		// Not able to access private variable and method in other class of same package
		// If you want to access in other class of same package then create getter / setter methods
		
		//Accessing public variable in other class of same package
		System.out.println(dc.publicint);
		//Accessing public method in other class of same package
		dc.publicmethod();
		
		//Accessing protected variable in other class of same package
		System.out.println(dc.protectedsting);
		//Accessing protected method in other class of same package
		dc.protectedmethod();
		
		
		
	}

}
