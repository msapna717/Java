
public class NumberPattern {
	static int length = 5;

	public static void main(String[] args) {

		System.out.println("---Pattern Programs----");
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
		pattern6();
	}

	public static void pattern1() {
		System.out.println("Pattern 1 Output:");
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}

	}

	public static void pattern2() {
		System.out.println("Pattern 2 Output:");
		for (int i = length; i >= 1; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println("\n");
		}

	}

	public static void pattern3() {
		System.out.println("Pattern 3 Output:");
		for (int i = length; i >= 0; i--) {
			for (int j = length; j > i; j--) {
				System.out.print("   ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" " + k + " ");
			}
			System.out.println("\n");
		}

	}

	public static void pattern4() {
		System.out.println("Pattern 4 Output:");
		for (int i = 1; i <= length; i++) {
			for (int j = length; j >= i; j--) {
				System.out.print("   ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print(" " + k + " ");
			}
			System.out.println("\n");
		}
	}

	public static void pattern5() {
		System.out.println("Pattern 5 Output:");
		int i, j, k;
		for (i = 1; i <= length; i++) {
			for (j = i; j < length; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for (i = length; i >= 1; i--) {
			for (j = length; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void pattern6() {
		System.out.println("Pattern 6 Output:");
		for (int i = length; i >= 0; i--) {
			for (int j = i + 1; j > i; j--) {
				System.out.print("   ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" " + k + " ");
			}
			System.out.println("\n");
		}

	}
}
