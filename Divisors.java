/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// get argument from the user as an integer.
		int num = Integer.parseInt(args[0]);
		// For each number lower th num, check if 'i' is a divisor of the given number
		for(int i = 1;i <= num;i++){
			if(num%i == 0){
				System.out.println(i);
			}
		
		}
	}
}
