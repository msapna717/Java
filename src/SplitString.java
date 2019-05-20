
public class SplitString {

	public static void main(String[] args) {
		split("abcde$%1234@#569");
		printOccurance("aaabbcjksdfdfggdss$");
		calculateSum("1235");
	}

	static void split(String str) {

		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

		int length = str.length();
		System.out.println("----- Separating alphabets,numeric value and special characters in string-----");
		System.out.println("length of string is = " + length);

		for (int i = 0; i < length; i++) {
			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));

			}

			else if (Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));

			}

			else {
				special.append(str.charAt(i));

			}

		}
		System.out.println("numeric values are = " + num);
		System.out.println("alphabetic values are = " + alpha);
		System.out.println("special characters are = " + special);
		System.out.println();
	}

	static void printOccurance(String str) {
		// StringBuffer alphabets = new StringBuffer();
		int length1 = str.length();
		int count = 0;
		System.out.println("--------Count of alphabet in a string--------");
		System.out.println("length of string is =" + length1);
		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == i) {
					count++;
				}
			}

			if (count != 0) {
				System.out.println(i + "=" + count);
				count = 0;
			}
		}
		System.out.println();
	}

	static void calculateSum(String str) {
		// StringBuffer num = new StringBuffer();
		int sum = 0;
		System.out.println("--------Sum of numbers in a string---------");
		for (int j = 0; j < str.length(); j++) {
			char a = str.charAt(j);

			if (Character.isDigit(a)) {
				int b = Integer.parseInt(String.valueOf(a));
				sum = sum + b;
			}
		}
		System.out.println(sum);

	}

}
