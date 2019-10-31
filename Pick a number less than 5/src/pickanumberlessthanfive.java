import java.util.Scanner;

public class pickanumberlessthanfive {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);

		// start the program in a loop.
		while(true) {

			// provide a basic CLI interface (prompt).
			System.out.println("Pick a number less than 5");

			// wait for an INT input.
			int userinput = scan.nextInt();

			// show the int that was picked.
			System.out.println("You picked " + userinput);

			// if int is less than 5 -> show the number that was entered by the user.
			if (userinput < 5) {
				System.out.println("Note: The number you picked, " + userinput + ", is less than 5! Great job!");
			}
			// else -> error out.
			else {
				System.out.println("ERROR! You should pick a number less than 5");

				// ask if they want to play again.
				System.out.println("Would you like to continue? (yes or no)");

				Scanner scann = new Scanner(System.in);

				String s = scann.nextLine();

				// if "no" -> exit.
				if (s.equals("no")) {
					System.out.println("Thank you for playing this game!");
					break;
				}
				// else -> play again.
				else {
					continue;
				}
			}
		}
	}
}
