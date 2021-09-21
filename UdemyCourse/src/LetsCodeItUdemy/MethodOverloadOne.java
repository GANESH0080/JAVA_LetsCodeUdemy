package LetsCodeItUdemy;

public class MethodOverloadOne {

	
	public void show() {
	}
	{
		System.out.println("Show Method");
	}
	
	public int show(int abc) {
	
	
		System.out.println("Integer SHOW method");
		return abc;
		
	}
	public String show(String abc) {
	
	
		System.out.println("String SHOW Method");
		
		return abc;
	}
	
	public int show(int abc, int xyz) {
		
		
		System.out.println("Integer SHOW method");
		return abc + xyz;
	}
	public String show(String abc, String xyz) {
		
		
		System.out.println("String SHOW Method");
		
		return abc + xyz;
	}
	
	
public static void main(String[] args) {
	MethodOverloadOne n = new MethodOverloadOne();
	n.show();
	System.out.println(n.show(44));
	System.out.println(n.show("Ganesh"));
	System.out.println(n.show(10, 20));
	System.out.println(n.show("Ganesh", "Salunkhe"));
}
	
	
	
	
	
}
