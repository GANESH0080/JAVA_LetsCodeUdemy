package LetsCodeItUdemy;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Normal WHILE LOOP");
		int i = 10;
		while (i > 0) {
			System.out.println("Print I value" + i);
			i--;
		}
		System.out.println("--------------------------------------------------------");

		System.out.println("WHILE LOOP with BREAK");
		int money = 500;
		while (money <= 10000) {
			if (money == 550) {
				System.out.println("Print Money" + " " + money);
				break;

			}
			System.out.println("withdraw money" + " " + money);
			money++;

		}
		System.out.println("--------------------------------------------------------");

		System.out.println("WHILE LOOP with CONTINUE");

		int p = 15;
		while (p >= 0) {
			if (p == 5) {
				p--;
				continue;
			}
			System.out.println("Print:" + " " + p);
			p--;

		}

	}
}
