
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int children = 0;
		boolean boy = false;
		boolean girl = false;
		String s = "";

		while(!boy || !girl){
			children = children + 1;
			double random = Math.random();
			if(random<0.5){
				girl = true;
				s = s + "g ";
			}
			else{
				boy = true;
				s = s + "b ";

			}
		}	
		System.out.println(s);		
		System.out.println("You made it... and you now have " + children + " children.");

		
		
	}
}
