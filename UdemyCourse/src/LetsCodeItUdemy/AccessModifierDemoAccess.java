package LetsCodeItUdemy;

public class AccessModifierDemoAccess {

	public static void main(String[] args) {
		AccessModifierDemo BMW = new AccessModifierDemo();
		BMW.setColour("Pink");
		String validcolour = BMW.getColour();
		System.out.println("Coluur of BMW is: " + validcolour);

		AccessModifierDemo skoda = new AccessModifierDemo();
		skoda.setNo_of_doors(8);
		System.out.println("Number of doors is: " + skoda.getNo_of_doors());

		skoda.setColour("Black");
		System.out.println(skoda.getColour());

		skoda.price = 435242342242d;
		System.out.println(skoda.getPrice());

		skoda.setModel("Bajaj");
		System.out.println("Model is " + " " + skoda.getModel());

	}
}
