import java.util.Scanner;

public class pickanumberlessthanfive {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while(true) {
		    //do whatever

			System.out.println("Pick a number less than 5");

			int userinput = scan.nextInt();

			System.out.println("You picked " + userinput);

			if (userinput < 5) {
				System.out.println("Note: The number you picked, " + userinput + ", is less than 5! Great job!");

			}
			else
				System.out.println("ERROR! You should pick a number less than 5");

		    System.out.println("Would you like to continue? (yes or no)");

		    Scanner scann = new Scanner(System.in);

		    String s = scann.nextLine();

		    if (s.equals("no")) {
		        run = false;

		       System.out.println("Thank you for playing this game!");
		       break;

		    }
		    else {
		    	run = true;
		 		}

		}
	}
}
