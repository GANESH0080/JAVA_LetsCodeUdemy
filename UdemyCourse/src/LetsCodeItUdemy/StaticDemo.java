package LetsCodeItUdemy;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static variable NAME which has value is already set:" +StaticExampleclass.name);		
		System.out.println("Static variable ROLLNUMBER which has value is already set:" +StaticExampleclass.rollnumber);
		
		StaticExampleclass.PhonenUmber = "9768180080";
		System.out.println("Static variable PHONENUMBER which has value is not set:" +StaticExampleclass.PhonenUmber);

	    // Cant access not static marksheet number variable in static method using
		// classname
		// System.out.println(StaticExampleclass.marsheetnum);

		// We can access non static variable in static method using object
		StaticExampleclass obj = new StaticExampleclass("Mahesh");
		System.out.println(obj.name);
		System.out.println(obj.getinstance());
		int marksnum = obj.marsheetnum = 25;
		System.out.println("Non-Static variable MARKSHEETNUM which has value is not set:" +marksnum);
		
		
		System.out.println("Non-Static variable ADDRESS which has value is already set:"+obj.address);
		
		
		StaticExampleclass obj1 = new StaticExampleclass("Mahesh");
		// We can access GetInstance method using classname also but for that we have to make Getinatnce method as static 
		System.out.println(obj1.getinstance());
		
	}

}
