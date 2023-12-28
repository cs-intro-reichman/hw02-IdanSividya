/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	// get argument from the user as an integer. 
		String word = (args[0]);
		String Reverse = "";
	//input the reverse version of the given string in an empty string  
		for (int i = word.length() - 1; i >= 0;i--){
			Reverse = Reverse + word.charAt(i);
		}
	//check the middle character of the string
		int middle = (word.length()-1)/2;
		char m = word.charAt(middle);
	//print resreve string and the middle character.
		System.out.println(Reverse);
		System.out.println("The middle character is " + m);
	}
}
