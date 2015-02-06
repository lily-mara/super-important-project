public class Fib {
	public static void main(String[] args) {
		System.out.println(fib(10));
	}

	public static int fib(int fibNumber) {
		switch (fibNumber) {
			case 0:
				return 0;
			case 1:
				return 1;
		}

		int n = 1;
		int n1 = 1;
		int n2 = 1;

		for (int i = 2; i < fibNumber; i++) {
			n = n1 + n2;
			n1=n2;
			n2=n;
		        
		}

		return n;
	}
}
