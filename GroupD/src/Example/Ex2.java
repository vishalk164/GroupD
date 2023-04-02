package Example;

import java.util.Scanner;

public class Ex2 {
	
	public static String removingSpaces(String str) {

		int start = 0;

		int end = str.length() - 1;

		while (start < str.length() && str.charAt(start) == ' ') {
			start++;
		}

		while (end >= 0 && str.charAt(end) == ' ') {
			end--;
		}

		return str.substring(start, end + 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");

		String str = sc.nextLine();
		String noSpaces = removingSpaces(str);
		System.out.println(noSpaces);
	}

}
