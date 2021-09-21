package UdemyCourseExamples;

public class AccountHolderObjects {

	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		tom.age = 23;
		tom.accountBalance = 3565;
		tom.firstName = "TOM";
		tom.lastName = "Salunkhe";
		tom.testElegibilityForCreditCard();
		System.out.println("Is TOM Eligible for CC: " + " " + tom.eligibleForCreditCard);

		AccountHolder sam = new AccountHolder();
		sam.age = 23;
		sam.accountBalance = 35605;
		sam.firstName = "TOM";
		sam.lastName = "Salunkhe";
		sam.testElegibilityForCreditCard();
		System.out.println("Is SAM Eligible for CC: " + " " + sam.eligibleForCreditCard);

	}

}
