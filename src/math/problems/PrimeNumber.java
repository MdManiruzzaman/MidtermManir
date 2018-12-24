package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		for (int i = 1; i <= 100; i++) {
			for (int k = 2; k <= i; k++) {
				if (k == i) {
					System.out.println(i);
				}
				if (i % k == 0) {
					break;
				}
			}

		}

	}

}
