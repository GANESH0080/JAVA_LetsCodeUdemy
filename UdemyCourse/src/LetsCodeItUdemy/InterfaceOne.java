package LetsCodeItUdemy;

public interface InterfaceOne {

	int abc = 23;
	
	// We can define variable in interface is public only
	// If you not mention the modifier then it will automatic considerred as public only
	//private int m = 25;
	// protected int o = 77;
	

	public void interfacemethod();

	// Private method applicable in Interface since JAVA 9 only
	// private void privateinterfacemethond();

	// Protected methods not supported in interface
	// protected void protectedinterfacemethond();

	void nomodifierinterfacemethod();

}
