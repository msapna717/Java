import java.util.Scanner;

public class Palindrome {
	static String original = "Deleveled";
	static String reverse = "";

	public static void isPalindrome(String word) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("The string is a palindrome.");

		else
			System.out.println("The string isn't a palindrome.");
	}

	public static void main(String[] args) {
		isPalindrome("");
	}
}