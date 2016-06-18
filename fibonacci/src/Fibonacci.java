
class Fibonacci {

	private static int fibRecursive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibRecursive(n - 1) + fibRecursive(n - 2);
		}
	}
	
	private static int fibIterative(int n ) {
		if (n <= 1) {
			return n;
		}
		int fib = 1;
		int fibPrev = 1;
		for (int i = 2; i < n; i++) {
			int temp = fib;
			fib += fibPrev;
			fibPrev = temp;
		}
		return fib;
	}

	public static void main (String args[]) {
		long start, end, total;
		int n = 20;

		start = System.nanoTime();
		for (int i = 1; i <= n; i++) {
			System.out.print(fibRecursive(i) + " ");
		}
		end = System.nanoTime();
		total = (end - start) / 1000;
		System.out.print("\nRecursive took approx " + total + " microseconds\n");
		
		start = System.nanoTime();
		for (int i = 1; i <= n; i++) {
			System.out.print(fibIterative(i) + " ");
		}
		end = System.nanoTime();
		total = (end - start) / 1000;
		System.out.print("\nIterative took approx " + total + " microseconds\n");
		
	}
	
}
