package lab2.problem3;

public class Problem11 {

	public int fibonacci(int n) {
		if (n < 0)
        {
            throw new IllegalArgumentException("n must be >= 0");
        }
		int a, b, c;
		a = 0;
		b = 1;

		for (int i = 1; i <= n; i++) {
			c = a;
			a = a + b;
			b = c;
		}

		return a;
	}

}