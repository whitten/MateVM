package tests;

public class ArgumentPassing1 {
	public static void main(String []args) {
		myadder(23, 4, 0x77); // 0x92
		noreturn(23, 4, 0x77); // nothing
		noargs(); // 0x1337
	}

	public static int myadder(int a, int b, int c) {
		return a + b + c;
	}

	public static void noreturn(int a, int b, int c) {
		return;
	}

	public static int noargs() {
		return -0x1337;
	}
}
