
public class FactWithoutReccurssion {
	static int n = 5, fact = 1;

	public static void main(String[] args) {

		f(4);

	}

	public static int f(int n) {
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " = " + fact);
		return fact;
	}

}
