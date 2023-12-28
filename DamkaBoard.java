/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// get the size of the board as an argument  
		int n = Integer.parseInt(args[0]);
		// print the damka board. seperate between 3 cases. 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i%2==1&&j==0){
				System.out.print(" * ");
				}
				else if(i%2==1 && j==n-1){
				System.out.print("*");
				}
				else {
				System.out.print("* ");
				}
			}
		System.out.println();
		
		}
	}
}
