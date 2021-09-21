package UdemyCourseExamples;

import LetsCodeItUdemy.*;

public class AccessModCasePackage extends AccessModCases {

	AccessModCasePackage() {
		super("Ganesh");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cant used constructor here , for using we have to create child class
		// consutctor as above then only below statement execute this is because we are
		// extending parent class from different package.
		AccessModCases dd = new AccessModCases("Ganesh");

		// Not able to access no modifier variable / method in other package
		// Not able to access private variable / method outside the class

		// Accessing public variable in other package
		System.out.println(dd.publicint);
		// Accessing public method in other package
		// dd.publicmethod();
		dd.publicmethod();

		// You cant access the Protected variable / Methods using Parent class reference

		// you can access protected variable / methods using chaild class reference.
		
		 AccessModCasePackage j = new AccessModCasePackage();
		  System.out.println(j.protectedsting); 
		  j.protectedmethod();
		 

	}

}
