/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word =  (args[0]);
		String Reverse = "";
		int middle = (word.length())/2;
		for (int i= word.length() - 1; i>=0;i--){
		Reverse = Reverse + word.charAt(i);
		}
		char m = word.charAt(middle);
		System.out.println(Reverse);
		System.out.println("The middle character is "+m);

	}
}
