package LetsCodeItUdemy;

public class MethodOverRide {

	String i = "Ganesh";

	public void MethodOne() {
		System.out.println("Method One");
	}

	public int methodtwo(int abc) {
		System.out.println("Method Two");
		return abc;
	}

	@SuppressWarnings("unused")
	private void provatemethod() {
		System.out.println("Private method");
	}

	protected void Protectedmethod()
	{
		System.out.println("Protected Method");
	}
	
	void nomodifiermethod()
	{
		System.out.println("No Modifier Method");
	}
}