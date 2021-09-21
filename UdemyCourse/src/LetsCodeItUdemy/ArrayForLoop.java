package LetsCodeItUdemy;

public class ArrayForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println("Length of Array is:" + a.length);

		for (int index = 0; index < a.length; index++) {
			System.out.println("Value of index" + " " + index + " " + "is" + " " + a[index]);
		}

		System.out.println(
				"=============================================== Array Printing using For Each Loop====================================================");
		for (int element : a) {
			System.out.println("Value if index are :" + element);
		}

	}

}
