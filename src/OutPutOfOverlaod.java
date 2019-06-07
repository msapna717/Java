
public class OutPutOfOverlaod {
	public void f(int a, int b) {
		System.out.println("i-i Function called a = " + a + " b = " + b);
	}

	public void f(long a, long b) {
		System.out.println("l-l Function called  a = " + a + " b = " + b);
	}

	public void f(float a, float b) {
		System.out.println("f-f Function called  a = " + a + " b = " + b);
	}

	public void f(double a, double b) {
		System.out.println("d-d Function called  a = " + a + " b = " + b);
	}

	public void f(double a, int b) {
		System.out.println("d-i Function called  a = " + a + " b = " + b);
	}

	public void f(int a, double b) {
		System.out.println("i-d Function called  a = " + a + " b = " + b);
	}

	public void f(int a, int b, int c) {
		System.out.println("i-i-i Function called  a = " + a + " b = " + b + " c = " + c);
	}

	public static void main(String[] args) {
		OutPutOfOverlaod obj = new OutPutOfOverlaod();
		obj.f(2, 3);

	}

}
