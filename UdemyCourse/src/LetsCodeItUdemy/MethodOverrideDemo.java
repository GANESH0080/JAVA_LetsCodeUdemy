package LetsCodeItUdemy;

public class MethodOverrideDemo extends MethodOverRide {

	
	public void MethodOne() {
		System.out.println("ChildClass Method One");
	}

	public int methodtwo(int abc) {
		System.out.println("ChildClass Method Two");
		return abc;
	}
	
	public static void main(String[] args) {
		// Using the child class object we can call Parent class and Child class methods
		MethodOverrideDemo dm = new MethodOverrideDemo();
		dm.MethodOne();
		dm.methodtwo(88);
		dm.Protectedmethod();
		dm.nomodifiermethod();
		
		
		// Using Parent class object we can call only parent class methods
		MethodOverRide r = new MethodOverRide();
		r.MethodOne();
		r.methodtwo(43);
		r.nomodifiermethod();
		r.Protectedmethod();
		
		// Using Parent class referance and child class object we can call child class methods
		MethodOverRide t = new MethodOverrideDemo();
		t.MethodOne();
		t.methodtwo(65);
		
		
		
	}

}
