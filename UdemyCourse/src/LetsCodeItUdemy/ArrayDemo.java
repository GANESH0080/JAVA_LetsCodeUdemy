package LetsCodeItUdemy;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		// Array Declaration method 1
		int[] aint = new int[5];

		// Defining the value for each element
		aint[0] = 15;
		aint[1] = 25;
		aint[2] = 35;
		aint[3] = 45;
		aint[4] = 55;
		// Printing array element value of method 1
		System.out.println(aint);
		System.out.println(aint[0]);
		System.out.println(aint[1]);
		System.out.println(aint[02]);
		System.out.println(aint[3]);
		// We can define array in 2 digit also
		System.out.println(aint[04]);
		// Default value for element is 0 If I have not given value for any index
		// System.out.println(aint[5]);
		System.out.println(aint.length);

		System.out.println("---- Creating String array with one more way--------");
		// Array declaration method 1
		String arraystring[] = { "Ganesh", "Mahadev", "Salunkhe" };

		// Printing array element value of method 1
		System.out.println(arraystring);
		System.out.println(arraystring[0]);
		System.out.println(arraystring[1]);
		System.out.println(arraystring[2]);
		System.out.println(arraystring.length);

		// Before sorting
		// i represent the index of array
		// we define i < aint length insted of i <= aint because index is always less
		// than one digit of length
		for (int i = 0; i < aint.length; i++) {
			System.out.println("Before Sorting the Array: " + aint[i]);
		}
		// This is the Array class
		Arrays.sort(aint);

		// After sorting the Array
		for (int i = 0; i < aint.length; i++) {
			System.out.println("After Sorting the Array: " + aint[i]);
		}

		// Created new aaray and copy the elements from existing array
		// First Parameter is original array name & 2nd parameter is how much length you
		// want to print
		int[] b = Arrays.copyOf(aint, 4);

		for (int j = 0; j < b.length; j++) {
			System.out.println("B array index is:" + b[j]);
		}

		// Copyin1 index to 4 index
		// 1 index is inclusive and 4 is exclusive
		int[] c = Arrays.copyOfRange(aint, 1, 5);
		System.out.println("Array C length is " + c.length);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		// Verifying both array has same or not
		System.out.println(Arrays.equals(aint, c));

	}

}