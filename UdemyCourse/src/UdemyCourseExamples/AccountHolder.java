package UdemyCourseExamples;

public class AccountHolder {

	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;

	public void testElegibilityForCreditCard() {
		if (age > 20 && accountBalance >= 20000) {
			eligibleForCreditCard = true;
		}
	}

}
