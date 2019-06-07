
public class Overlaoding {
	public static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("i-i Function called  a = " + a + " b = " + b);
		System.out.println("Sum= " + sum);

	}

	public static int sum(float a, float b) {
		float sum = a + b;
		System.out.println("f-f Function called  a = " + a + " b = " + b);
		System.out.println("Sum= " + sum);
		return 0;

	}

	public static int sum(double a, double b) {
		double sum = a + b;
		System.out.println("f-f Function called  a = " + a + " b = " + b);
		System.out.println("Sum= " + sum);
		return 0;
	}

	public static int sum(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("i-i-i Function called  a = " + a + " b = " + b + " c = " + c);
		System.out.println("Sum= " + sum);
		return sum;
	}

	public static void main(String[] args) {
		sum(2, 3);
		sum(4.5F, 3.5F);
//		sum(5, 10, 20);
//		sum(3.8, 4.9);

	}

}
