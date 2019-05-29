
public class FactWithRecursion {

	public static void main(String[] args) {
		int number = 4;
		System.out.println("Factorial of " + number + " is: " + fact(number));

	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return (n * fact(n - 1));

	}

}
