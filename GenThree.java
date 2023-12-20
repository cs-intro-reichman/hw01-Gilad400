/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// identifi the min and max number. 
		int max = Math.max(a , b);
		int min = Math.min(a , b);
		// Generates a random number in the range.
		int num1 = (int)(Math.random() * (max-min)) + min;
		int num2 = (int)(Math.random() * (max-min)) + min;
		int num3 = (int)(Math.random() * (max-min)) + min;
		System.out.println(num1 + "\n" + num2 + "\n" + num3);
		// Find the minimal number that was generated.
		int minimum = Math.min(Math.min(num1, num2), num3);
		System.out.println("The minimal generated number was " + minimum);	
	}
}
