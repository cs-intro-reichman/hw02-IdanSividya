/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	// get argument from the user as an integer.
		int perfect = Integer.parseInt(args[0]);
		int sum = 1;
		String s = perfect +" is a perfect number since " + perfect + " = 1";
		//calculate the sum of all given numbers divisors
		for(int i = 2;i < perfect;i++){
			if(perfect % i == 0){
				sum = sum + i;
				s = s + " + " + i;
			}	
		}
	// check and prints if the given number is perfect or not
		if(perfect == sum){
			System.out.println(s);
		}
		else{
			System.out.println(perfect + " is not a perfect number");
		}

	}
}
