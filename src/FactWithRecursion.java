
public class FactWithRecursion {
	static int fact = 1;
	static int n = 5;

	public static void main(String[] args) {
		fact = fact(6);
		System.out.println("Factorial of " + n + " is: " + fact);

	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);

	}

}
