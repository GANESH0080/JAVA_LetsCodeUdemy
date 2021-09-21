package LetsCodeItUdemy;

// If any method in class is abstract then that class is Abstract 
public abstract class AbstractClassDemo {

	// Abstarct method means no defination for method 
	// If any method define with abstract keyword then that method will be the abstract
	public abstract void abstractone();

	// Abstract class has non abstract method also
	// Abstract can contain only non abstract method also
	public void noabstractone() {
		System.out.println("No Abstract");
	}
	
	public abstract void abstracttwo(int i);
	
	protected abstract void protectedabstract();
	
	// We cant create private abstract methods
	private abstract void privateabstract();
	
	private void privatenonabstract()
	{
		System.out.println("Ganesh");
	}
	
	abstract void nomodifiedabstract();
	
	
	

	public static void main(String[] args) {
		// You cant create object of Abstarct class
		// But we can extend the abstract class
		// AbstractClassDemo n = new AbstractClassDemo();
		
	}
}

