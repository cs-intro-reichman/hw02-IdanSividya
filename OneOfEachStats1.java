/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double average;
		int Sum2Children = 0;
		int Sum3Children = 0;
		int Sum4andmoreChildren = 0;
		double all = 0;
		for	(int i = 0;i < T; i++)
		{
			int children = 0;
			boolean boy = false;
			boolean girl = false;
			
			while(!boy || !girl){
				children = children + 1;
				all = all+1;
				double random = Math.random();
				if(random<0.5){
				girl = true;
				}
				else{
				boy = true;
				}
			}
			
		if (children == 2){
		Sum2Children = Sum2Children + 1;
		}
		else if (children == 3){
		Sum3Children = Sum3Children + 1;
		}
		else {
		Sum4andmoreChildren = Sum4andmoreChildren+ 1;
		}
		}
		int common = Math.max(Sum2Children, Math.max(Sum3Children, Sum4andmoreChildren));
		average = all/T;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " +Sum2Children);		
		System.out.println("Number of families with 3 children: " +Sum3Children);
		System.out.println("Number of families with 4 or more children: " +Sum4andmoreChildren);		
		
		if(Sum2Children >= Sum3Children && Sum2Children >= Sum4andmoreChildren){
			System.out.println("The most common number of children is 2.");
		}
		else if (Sum3Children >= Sum2Children && Sum3Children >= Sum4andmoreChildren){
			System.out.println("The most common number of children is 3.");
		}
		else{
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}