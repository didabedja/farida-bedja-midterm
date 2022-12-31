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
		int numberOfPrimes = 0;

		ArrayList<Integer> arrList = new ArrayList<>();

		for(int i=2; i<=1000000; i++)
		{

			if(checkPrime(i)){


				arrList.add(i);


				numberOfPrimes++;
			}
		}


		System.out.println(numberOfPrimes);


	}

	private static boolean checkPrime(int i) {
		return false;
	}

	private static class ArrayList<T> {
		public void add(T i) {
		}
	}
}