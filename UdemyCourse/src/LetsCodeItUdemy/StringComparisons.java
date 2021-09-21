package LetsCodeItUdemy;

public class StringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ganesh";
		String str1 = "ganesh";
		String str2 = "Ganesh";

		// comparing Ganesh & ganesh with equal method
		boolean b = str.equals(str1);
		System.out.println(b);

		// comparing Ganesh & ganesh with equalIgnorecase method
		boolean eb = str.equalsIgnoreCase(str1);
		System.out.println(eb);

		// comparing Ganesh & Ganesh with equal method
		boolean c = str.equals(str2);
		System.out.println(c);
		
		boolean ec = str.equalsIgnoreCase(str2); // str1
		System.out.println(ec);

	
	}

}
