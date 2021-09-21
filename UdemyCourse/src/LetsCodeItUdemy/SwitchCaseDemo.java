package LetsCodeItUdemy;

public class SwitchCaseDemo {
	int month;
	int numOfDays;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCaseDemo obj = new SwitchCaseDemo();
		obj.fetchdays(13);
	}

	public int fetchdays(int month) {

		switch (month) {
		case 1:
			numOfDays = 13;
			System.out.println("Total days in January month is:" + numOfDays);
			break;
		case 2:
			numOfDays = 30;
			System.out.println("Total days in Febuary month is:" + numOfDays);
			break;
		case 3:
			numOfDays = 31;
			System.out.println("Total days in March month is:" + numOfDays);
			break;
		case 4:
			numOfDays = 30;
			System.out.println("Total days in April month is:" + numOfDays);
			break;
		case 5:
			numOfDays = 31;
			System.out.println("Total days in May month is:" + numOfDays);
			break;
		case 6:
			numOfDays = 30;
			System.out.println("Total days in June month is:" + numOfDays);
			break;
		case 7:
			numOfDays = 31;
			System.out.println("Total days in July month is:" + numOfDays);
			break;
		case 8:
			numOfDays = 31;
			System.out.println("Total days in Auguast month is:" + numOfDays);
			break;
		case 9:
			numOfDays = 30;
			System.out.println("Total days in September month is:" + numOfDays);
			break;
		case 10:
			numOfDays = 31;
			System.out.println("Total days in Octomber month is:" + numOfDays);
			break;
		case 11:
			numOfDays = 30;
			System.out.println("Total days in November month is:" + numOfDays);
			break;
		case 12:
			numOfDays = 31;
			System.out.println("Total days in December month is:" + numOfDays);
			break;

		default:
			System.out.println("Testing Switch");

		}
		return numOfDays;
	}
}
