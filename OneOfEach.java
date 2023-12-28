
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	// define variabels using them later.
		int children = 0;
		boolean boy = false;
		boolean girl = false;
		String s = "";
	// run while loop until get at least one child of each gender 
		while(!boy || !girl){
	// count num of children in the family.
			children = children + 1;
	// run a random number and using it to decide the child gender.
			double random = Math.random();
	// check if you get boy or girl, and change the boolean to true. Also, updating S variable according to child gender.
			if(random<0.5){
				girl = true;
				s = s + "g ";
			}
			else{
				boy = true;
				s = s + "b ";
			}
		}	
	// print number of children and the order of boys and girls in the family.
		System.out.println(s);		
		System.out.println("You made it... and you now have " + children + " children.");

		
		
	}
}
