/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int quarter = 25;
		int num = Integer.parseInt(args[0]);
		// cent = 1
		System.out.println("Use " + num / quarter + " quarters" + " and " + num % quarter + " cents");
	}
}