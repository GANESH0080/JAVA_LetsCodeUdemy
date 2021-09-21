package LetsCodeItUdemy;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GanEsh";
		String str1 = "Ganesh";
		String stra = " ";
		String stre = "";
		String replacestr = "gagagag";
		String trimstr = "    Ganu";

		// Length give the length of Sting
		System.out.println(str.length());

		// ChatAt() return the index value of the given index
		System.out.println(str.charAt(2));

		// Merge the both String
		System.out.println(str.concat("abc"));

		// Returning Unicode value of Index
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointAt(2));

		// Returning the count of Unicode value from specified starting index to ending
		// index (Ending index not considered)
		System.out.println(str.codePointCount(1, 3));

		// Below method identify added char available in String or not.
		System.out.println(str.contains("o"));
		System.out.println(str.contains("E"));

		// Below method compare with content
		System.out.println(str.contentEquals("GanEsh"));
		// Below method compare with another string
		System.out.println(str.contentEquals(str1));

		System.out.println(str.endsWith("H"));
		System.out.println(str.startsWith("G"));
		System.out.println(str.equals(str1));

		// below method return -1 if specified char not in String
		System.out.println(str.indexOf("P"));
		// below method return index number of specified char
		System.out.println(str.indexOf("n"));

		// Below method return -1 if specified char is provided in caps /small letter
		System.out.println(str.indexOf("A"));

		// Below method return finding E after 1 index and giving the index number of
		// first occurance of E after 1 index
		System.out.println(str.indexOf("E", 1));

		// If not found the return -1
		System.out.println(str.indexOf("e", 1));

		// Checking string is empty or not
		System.out.println(str.isEmpty());
		// This returning false because Space is a string
		System.out.println(stra.isEmpty());
		// Checking string is empty or not
		System.out.println(stre.isEmpty());

		// Replacing G with M in string from string
		System.out.println(str.replace("G", "M"));
		System.out.println(replacestr.replace("g", "m"));

		// Printing string from 2nd index to end
		System.out.println(str.substring(2));
		// Starting from 1 to 3 , 4 will not consider
		System.out.println(str.substring(1, 4));

		System.out.println(str.toUpperCase());

		// Eliminating leading and Trailing spaces
		System.out.println(trimstr.trim());

		// Convert String into CharArray
		char[] chararray = str.toCharArray();

		for (int i = 0; i < chararray.length; i++) {
			System.out.println(chararray[i]);
		}

	}

}
