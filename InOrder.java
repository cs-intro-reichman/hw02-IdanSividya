/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
	// generate an random number in the range [0,10), and define random 2 to be equal to random 1.
        int random1 = (int) (Math.random() * 10);
        int random2 = random1; 
	// print the random numbersin form of non-decreasing sequence, by using do while. 
        do {
            System.out.print(random2 + " ");
            random1 = random2;
            random2 = (int) (Math.random() * 10);
        } while (random2 >= random1);
    }
}
