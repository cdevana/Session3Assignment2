package session3;

public class PrimeOrNot {

	public static String isPrime(int number) {
		String result = null;
		
		//Check if the number is divisible by any other number
		boolean isPrime = true;
		for (int j = 2; j < number; j++) {
			if (isPrime) {
				if (number % j == 0) {
					result = number + " is not prime.";
					break;
				} else {
					result = number + " is prime.";
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// Call isPrime method to see if input integer is prime or not		
		System.out.println(isPrime(Integer.parseInt(args[0])));
		
		/* Output
		 * For input 9:
		 * 9 is not prime.
		 * 
		 * For input 17:
		 * 17 is prime.
		 */

	}

}
