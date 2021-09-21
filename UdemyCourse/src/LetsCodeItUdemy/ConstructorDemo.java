package LetsCodeItUdemy;

public class ConstructorDemo {

	int number;
	String address;
	String name;

	ConstructorDemo() {
		// Calling another constructor under this constructor using THIS
		//this(34);
         this("Vashi","Mandar");
		// Constructor are used for initialising value to the Class variable
		this.number = 5;
		// This line is executed first because at the time of object creation
		// consturctor call first
		System.out.println("In Constrcutor");
	}

	ConstructorDemo(String paddress, String pname) {
		this.address = paddress;
		this.name = pname;
		System.out.println("In Parametrised Constrcutor");

	}

	ConstructorDemo(int str) {
		System.out.println("In Integer Parametrised Constrcutor");
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		
		System.out.println(obj.number);
		
		ConstructorDemo obj1 = new ConstructorDemo("Ganesh", "Kalamboli");
		System.out.println(obj1.name);
		System.out.println(obj1.address);
		//System.out.println(obj.name);
		//System.out.println(obj.address);
		ConstructorDemo obj2 = new ConstructorDemo(24);
	}

}
