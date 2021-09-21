package LetsCodeItUdemy;

public class ChildInheriteClass extends InheritanceDemo {

 int i = 20;
	
 ChildInheriteClass()
 {
	 super();
	 System.out.println(super.i);
	 super.method1();
 }
 //Created same Method in child class which has in parent class - Method2 
	public void method2()
	{
		
		System.out.println("Clild class Method2");
		
	}
	//Created same Method in child class which has in parent class - Method3
	public void method3()
	{
		//Accessing parent class variable using Super keyword
		System.out.println("Parent class instance variable:" +" " +super.i);
		// Calling super class method using Super keyword
		super.method1();
		
		System.out.println("Child class Method3");
	}

	public void childclassunique()
	{
		System.out.println("Child class Unique method");
	}
	
	

	public static void main(String[] args)
	{
		ChildInheriteClass child = new ChildInheriteClass();
		// If child class object is created then we are showing propety value of child class when same variable avaialble in both class
		System.out.println(child.i);
		// We are executing parent class method using child class object using inheritance
		child.method1();
		// We are excecuting child class method using child class object when same method available in both class
		child.method2();
		child.method3();
		child.childclassunique();
		
		
		InheritanceDemo pclass = new InheritanceDemo();
		pclass.parentclassunique();
		//We cant access child class methods using parent class object
		pclass.childclassunique();
		
		//We cant access child class methods using parent class reference
		// We can access parent class methods using parent class reference
		InheritanceDemo pcclass = new ChildInheriteClass();
		pcclass.childclassunique();
		pcclass.parentclassunique();
		
		ChildInheriteClass cpclass = new InheritanceDemo();
		cpclass.childclassunique();
		cpclass.parentclassunique();
		
		
		
	
	}
}
