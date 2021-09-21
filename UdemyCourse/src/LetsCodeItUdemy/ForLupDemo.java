package LetsCodeItUdemy;

public class ForLupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			
			if (i == 5)
			{
				System.out.println("I value before continue:" + " " + i);
				continue;
			}
			System.out.println("Print i value" + " " + i);

		}

	}

}