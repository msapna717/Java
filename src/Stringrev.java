import java.util.Scanner;

public class Stringrev {
	static void rev() {
		String name;
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		StringBuffer sb = new StringBuffer(name);
		System.out.println("input : " + sb);

		System.out.println("Output : " + sb.reverse());
	}

	static void rev(String str) {
		String str1 = "Welcome";
		char[] a = str1.toCharArray();
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}

	}

	public static void main(String[] args) {
		rev();
		rev("test");
	}

}