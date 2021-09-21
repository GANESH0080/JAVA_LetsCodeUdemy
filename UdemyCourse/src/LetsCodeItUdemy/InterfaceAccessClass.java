package LetsCodeItUdemy;

public class InterfaceAccessClass implements InterfaceOne, InterfaceTwo {

	

	@Override
	public void interfactwoemethod() {
		System.out.println("Interface Two Method");
		
	}

	@Override
	public void interfacemethod() {
		System.out.println("interface method");
		
	}

	@Override
	public void nomodifierinterfacemethod() {
		System.out.println("no modifier interfacemethod");
		
	}
	
	public static void main(String[] args) {
		
		InterfaceAccessClass c = new  InterfaceAccessClass();
		c.interfacemethod();
		c.interfactwoemethod();
		c.nomodifierinterfacemethod();
		System.out.println(c.abc);
		System.out.println(InterfaceTwo.xyz);
		
		//using the reference of Interface we can create object of class
		InterfaceOne t = new InterfaceAccessClass();
		t.interfacemethod();
		t.nomodifierinterfacemethod();
		
		//using the reference of Interface we can create object of class
		InterfaceTwo n = new InterfaceAccessClass();
		n.interfactwoemethod();
		
		
		
	}

}
